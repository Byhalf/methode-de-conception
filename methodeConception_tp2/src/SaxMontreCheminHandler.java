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
public class SaxMontreCheminHandler extends DefaultHandler {
    private String path ="";
    public SaxMontreCheminHandler() {
        super();
    }
    
    @Override
    public void startElement(String namespaceURI, String localName,
            String qName, Attributes atts)
    {
        path += "/"+qName;
        System.out.println(path);
    }
    @Override
    public void endElement(String namespaceURI, String localName, String qName){
        path = path.substring(0, path.length() - qName.length() - 1);
        System.out.println(path);
    }
}
