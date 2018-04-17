package com.maiseenok.seventh_homework.task2;
/*
 * В порту есть 100 контейнеров и 4 пирса (ограничено семафором)
 * Корабль приплывает и выгружает имеющийся груз
 * параллельно на него загружается максимально возможное количество контейнеров.
 * Когда корабль загружено, то уплывает на 2 секунды
 * процесс повторяется 3 раза
 * 
 * Если в порту количество контейнеров достигает 5 перед загрузкой корабля,
 * то выбрасывается исключение
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Port {
	protected final static Semaphore SEMAPHORE = new Semaphore(4, false);
	List<Box> box=new ArrayList<Box>();
	List<Ship> pier=new ArrayList<Ship>();
	
	Port(){
		for (int i = 0; i < 50; i++) {
			box.add(new SmallContainer());
			box.add(new LargeContainer());
		}
	}
	
	public void workProcess(Ship ship) {
		try {
			MyLambda lambda = (a) -> a.size() < 5 ? true : false;
			for(int i=0;i<3;i++) {
				
				SEMAPHORE.acquire();
				addShip(ship);
				System.out.println(ship.name + " in port");
				ExecutorService ex=Executors.newSingleThreadExecutor();
				
				ex.execute(new Runnable() {
					
					@Override
					public void run() {
						int val=ship.box.size();
						for (int j = 0; j < val; j++) {
							try {
								unloadBox(ship.unloading());
								Thread.sleep(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						if(val!=0)
							System.out.println(ship.name + " is Empty");
						
					}
				});
				
				Thread.sleep(300);
				ex.shutdown();
				while(!ship.isFull) {
					if(lambda.checkExeption(box)) {
						ex.shutdownNow();
						throw new MyException("Port can't manage");
						}
					synchronized (box) {
						Box c=takeBox();
						if(ship.loading(c))
							loadBox(c);
					}
					Thread.sleep(100);
				}
				removeShip(ship);
				if(i!=2)
					System.out.println(ship.name+" transport boxex");
				SEMAPHORE.release();
			
				Thread.sleep(new Random().nextInt(2000));
			}

			System.out.println(ship.name+" go away");
		}catch(MyException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void addShip(Ship ship) {
		pier.add(ship);
	}
	
	public void removeShip(Ship ship) {
		pier.remove(ship);
	}
	
	public synchronized Box takeBox() {
		int val=new Random().nextInt(box.size());
		return box.get(val);		
	}
	
	public synchronized void unloadBox(Box c) {
		box.add(c);
	}
	
	public synchronized void loadBox(Box i) {
		box.remove(i);
	}
}
