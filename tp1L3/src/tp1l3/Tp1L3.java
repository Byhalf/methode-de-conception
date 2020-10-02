/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1l3;

/**
 *
 * @author 21705720
 */
public class Tp1L3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personne p1 = new PersonneBuilder().avecNom("Lemière").avecPrenom("René").build();
        System.out.println(p1);
    }
    
}
