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
public class parsing_xml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        saxEcho(new SaxEchoHandler2());
    }
    public static void saxEcho(DefaultHandler handler){
        SAXParserFactory factory = SAXParserFactory.newInstance();
	try 	
          {
	    // puis on obtient une instance de parseur à partir de cette usine.
	    SAXParser saxParser = factory.newSAXParser();
	    // Enfin, on lance le parsing :
	    saxParser.parse("/home/etudiants/21705720/NetBeansProjects/methodeConception_tp2/src/juicer.xml",
                    handler);  }
        catch(Exception e){
            System.out.println("can't open file");
        }
        
    }
    
    
}
