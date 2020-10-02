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
class CompteBancaire {
    public String id;
    public Banque banque;
    public int solde;

    public CompteBancaire(String id, Banque banque, int solde) {
        this.id = id;
        this.banque = banque;
        this.solde = solde;
    }
    public void operation(OperationBancaire o){
        o.setCompteBancaire(this);
        o.appliquer();
        System.out.println(banque);
    }

}
