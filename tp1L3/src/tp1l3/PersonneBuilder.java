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
public class PersonneBuilder {
    private String nom;
    private String prenom;
    private int anneeNaissance;
    private String adresse;
    private String telephoneMobile;
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephoneMobile() {
        return telephoneMobile;
    }

    public void setTelephoneMobile(String telephoneMobile) {
        this.telephoneMobile = telephoneMobile;
    }


    public PersonneBuilder() {
        this.nom = null;
        this.prenom = null;
        this.anneeNaissance = -1;
        this.adresse = null;
        this.telephoneMobile = null;
    }
    
    public PersonneBuilder avecNom(String nom) {
        this.setNom(nom);
        return this;
    }
    public PersonneBuilder avecPrenom(String prenom) {
        this.setPrenom(prenom);
        return this;
    }

    public PersonneBuilder avecAdresse(String adresse) {
        this.setAdresse(adresse);
        return this;
    }
    public PersonneBuilder avecTelephoneMobile(String telephoneMobile) {
        this.setTelephoneMobile(telephoneMobile);
        return this;
    }
    
    public PersonneBuilder avecAnneeNaissance(String anneeNaissance) {
        this.setTelephoneMobile(anneeNaissance);
        return this;
    }
    public Personne build(){
        return new Personne(this.getNom(),this.getPrenom(),this.getAnneeNaissance(),
        this.getAdresse(),this.getTelephoneMobile());
        //return new Personne(nom,prenom,anneeNaissance,adresse,telephoneMobile;
    }
    
}
