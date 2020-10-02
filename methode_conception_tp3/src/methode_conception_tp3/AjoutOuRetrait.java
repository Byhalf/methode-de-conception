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
public  abstract class AjoutOuRetrait implements OperationBancaire{
    public Date date;
    public CompteBancaire cb;
    public int somme;
    
    @Override
    public void setCompteBancaire(CompteBancaire cb) {
        this.cb = cb;
    }
    
    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public  void appliquer(){
        cb.solde += somme;
        System.out.println(somme);
        cb.banque.liste_operations.add(this);
    };

    @Override
    public  void desappliquer(){
        cb.solde -= somme;
        cb.banque.liste_operations.remove(this);
    };
    

}
