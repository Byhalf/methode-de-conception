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
public interface OperationBancaire {
    public void setCompteBancaire(CompteBancaire cb);
    public Date getDate();
    public void appliquer();
    public void desappliquer();


}
