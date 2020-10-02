
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class SaxSelectionne2 extends DefaultHandler{
    private List<String> endpath = new ArrayList(); 
    private String path ="";
    //private boolean flag = false;

    public SaxSelectionne2() {
        String[] temp = "juicer/cost".split("/");//ugly should be added as handler parameter but no time
        endpath = Arrays.asList(temp);
    }

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
        String[] splitPathTemp = path.split("/");
        List <String> splitPath;
        splitPath = Arrays.asList(splitPathTemp);
        if(endpath.equals(splitPath.subList(splitPath.size()-endpath.size(),endpath.size()))){
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
