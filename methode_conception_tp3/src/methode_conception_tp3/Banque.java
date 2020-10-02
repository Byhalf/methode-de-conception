/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methode_conception_tp3;

import java.util.ArrayList;

/**
 *
 * @author 21705720
 */
public class Banque {
    public ArrayList<CompteBancaire> liste_comptes;
    public ArrayList<OperationBancaire> liste_operations;

    public Banque() {
        this.liste_comptes = new ArrayList<>();
        this.liste_operations = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        String s ="============= Descriptif des comptes ================\n";
        int i = 0;
        for(CompteBancaire cb:liste_comptes){
            s+="Compte n° "+ i +" "+ cb.id + " solde= "+ cb.solde + "\n";
            i++;
        }
        return s;
    }
    public CompteBancaire creationCompte(String id){
        CompteBancaire b;
        b = new CompteBancaire(id,this,0);
        liste_comptes.add(b);
        return b;
    }
    
    public void annuleOperationsJusquau(Date d){
        //que si la liste est trié
        /*
        for(int i = liste_operations.size()-1;i!=-1;i--){
            OperationBancaire o = liste_operations.get(i);
            if(o.getDate().compareTo(d)>-1)
                return;
            else
                o.desappliquer();
        }
        */
        for(int i = liste_operations.size()-1;i!=-1;i--){
            OperationBancaire o = liste_operations.get(i);
            if(o.getDate().compareTo(d)==1)
                o.desappliquer();
        }
        
    }
    
    
}
