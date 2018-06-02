package com.maiseenok.seventh_homework.task1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLprocessing {

	public static List<Reader> readXML(List<Reader> list, String xmlPath) {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			DefaultHandler handler = new DefaultHandler() {
				boolean title = false;
				boolean author = false;
				boolean genre = false;
				boolean year = false;
				boolean isSoft = false;
				boolean adding = false;
				boolean type = false;
				Reader reading = new Reader();

				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {
					if (qName.equalsIgnoreCase("title")) {
						title = true;
					}
					if (qName.equalsIgnoreCase("author")) {
						author = true;
					}
					if (qName.equalsIgnoreCase("genre")) {
						genre = true;
					}
					if (qName.equalsIgnoreCase("year")) {
						year = true;
					}
					if (qName.equalsIgnoreCase("isSoft")) {
						isSoft = true;
					}
				}

				@Override
				public void characters(char ch[], int start, int length) throws SAXException {
					if (title) {
						reading.setTitle(new String(ch, start, length));
						;
						title = false;
					}
					if (author) {
						reading.setAuthor(new String(ch, start, length));
						author = false;
					}
					if (genre) {
						reading.setGenre(new String(ch, start, length));
						genre = false;
					}
					if (year) {
						reading.setYear(Integer.parseInt(new String(ch, start, length)));
						year = false;
					}
					if (isSoft) {
						type = Boolean.getBoolean(new String(ch, start, length));
						isSoft = false;
						adding = true;
					}
					if (adding) {
						if (type == false)
							list.add(new Book(reading));
						else
							list.add(new Magazine(reading));
						adding = false;
					}
				}
			};
			saxParser.parse(xmlPath, handler);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static boolean validateXML(String xsdPath, String xmlPath) {
		try {
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new File(xsdPath));

			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(new File(xmlPath)));
		}

		catch (IOException | SAXException e) {
			System.out.println("Exception: " + e.getMessage());
			return false;
		}
		return true;
	}
}
