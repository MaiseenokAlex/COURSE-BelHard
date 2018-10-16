-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.0.41-community-nt - MySQL Community Edition (GPL)
-- Операционная система:         Win32
-- HeidiSQL Версия:              9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Дамп структуры базы данных netcrackerdb
--CREATE DATABASE netcrackerdb;
--USE netcrackerdb;

-- Дамп структуры для таблица netcrackerdb.cats
CREATE TABLE IF NOT EXISTS `cats` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(50) NOT NULL,
  `dad` int(11) default NULL,
  `mom` int(11) default NULL,
  `gender` varchar(50) NOT NULL default 'MALE',
  `age` float unsigned default '0',
  `color` varchar(50) default 'NONE',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы netcrackerdb.cats: ~14 rows (приблизительно)
/*!40000 ALTER TABLE `cats` DISABLE KEYS */;
INSERT INTO `cats` (`id`, `name`, `dad`, `mom`, `gender`, `age`, `color`) VALUES
	(1, 'Петр Липкий Нос', NULL, 4, 'MALE', 5, 'Черный'),
	(2, 'Джон Седой Ус', NULL, 4, 'MALE', 5.4, 'Черный'),
	(3, 'Серафима', 6, 11, 'FEMALE', 5.5, 'Белый'),
	(4, 'Мурка', NULL, 9, 'FEMALE', 4, 'Полосатый'),
	(5, 'Джонни Кэтсвилл', 3, 5, 'MALE', 0, 'Рыжий'),
	(6, 'Багира', 6, 9, 'FEMALE', 0, 'Шоколадный'),
	(7, 'Гарфилд', NULL, 11, 'MALE', 0, 'NONE'),
	(8, 'Княгиня', 6, 9, 'FEMALE', 5.1, 'Черепаховый'),
	(9, 'Васька', 10, 11, 'MALE', 0, 'Черный'),
	(10, 'Кошка', 10, 9, 'FEMALE', 4, 'Серый'),
	(11, 'Гриша', 6, 4, 'MALE', 2, 'Белый'),
	(12, 'Тест', 10, 4, 'FEMALE', 2, 'NONE');
/*!40000 ALTER TABLE `cats` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
