
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21705720
 */
public class SaxSelectionneHandler extends DefaultHandler {
    
    private String pathToFind = "/juicers/juicer/cost"; //ugly should be added as handler parameter but no time
    private String path ="";
    //private boolean flag = false;

    @Override
    public void startElement(String namespaceURI, String localName,
            String qName, Attributes atts)
    {
        path += "/"+qName;
        //if(path.equals(pathToFind))
        //{
        //    flag=true;
        //}
    }
    @Override
    public void characters(char[] ch, int indiceDebut, int longueur){

        if(path.equals(pathToFind)){
            //for(int i=indiceDebut;i<longueur;i++){System.out.print(ch[i]);} 
            System.out.println(new String(ch,indiceDebut,longueur)) ;
        }

    }
    @Override
    public void endElement(String namespaceURI, String localName, String qName){
        //if(path.equals(pathToFind))
        //{
        //    flag=false;
        //}
        path = path.substring(0, path.length() - qName.length() - 1);
    }
    
}
