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
public class SaxEchoHandler2 extends DefaultHandler {

    public SaxEchoHandler2() {
        super();
    }
    
    @Override
    public void startElement(String namespaceURI, String localName,
            String qName, Attributes atts)
    {
      String attributes =" ";
      for(int i=0;i<atts.getLength();i++){
          attributes += ( atts.getQName(i)+"="+"\""+atts.getValue(i))+"\" ";
          
      }
      System.out.println("<"+qName+ attributes+">");
      
    }
    @Override
    public void characters(char[] ch, int indiceDebut, int longueur){
        for(int i=indiceDebut;i<longueur;i++){
            System.out.print(ch[i]);
        }
    }
    @Override
    public void endElement(String namespaceURI, String localName, String qName){
        System.out.println("<"+qName+"/>");

    }
}
