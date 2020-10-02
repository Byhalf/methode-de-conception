/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methode_conception_tp3;

/**
 *
 * @author 21705720
 */
public class Methode_conception_tp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banque b=new Banque();
        CompteBancaire c1=b.creationCompte("129023434");
        CompteBancaire c2=b.creationCompte("543458349");
        c1.operation(new Ajout(500, new Date(01,01,2017)));
        System.out.println(c1.solde);
        
        c2.operation(new Ajout(750, new Date(02,03,2017)));
        c1.operation(new Retrait(32, new Date(05,03,2017)));
        c1.operation(new Ajout(33, new Date(15,01,2018)));
        b.annuleOperationsJusquau(new Date(04,03,2017)); 
        System.out.println(b);
    }
    
}
