/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
/**
 *
 * @author 21705720
 */
public class SaxEchoHandler extends DefaultHandler {

    public SaxEchoHandler() {
        super();
    }
    
    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts)
    {
      System.out.println("<"+qName+">");
    }
}
