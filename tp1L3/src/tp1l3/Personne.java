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
public class Personne {
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
    
    public Personne(String nom, String prenom, int anneeNaissance,
            String adresse, String telephoneMobile) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAnneeNaissance(anneeNaissance);
        this.setAdresse(adresse);
        this.setTelephoneMobile(telephoneMobile);
    }
    public Personne(String nom, String prenom, String adresse){
        this(nom,prenom,-1,adresse,null);
    }
    public Personne(String nom, String prenom){
        this(nom,prenom,null);
    }
    @Override
    public String toString(){
        String res = "Nom="+(this.getNom()==null?"N/A":this.getNom()) + "\nPrénom="+this.getPrenom()+
                "\nAnnée de naissance ="+(this.getAnneeNaissance()==-1?"N/A":this.getAnneeNaissance())+
                "\nAdresse ="+this.getAdresse()+"\nTelephone Mobile = "+
                this.getTelephoneMobile()+"\n";
        return res;
    }
    
    //************* Beans ************************
    public Personne(){
        this.setNom(null);
        this.setPrenom(null);
        this.setAnneeNaissance(-1);
        this.setAdresse(null);
        this.setTelephoneMobile(null);
    }
    //************* Factory method *******************
    public static Personne createPersonneFromNomPrenom(String nom, String prenom){
        return new Personne(nom,prenom);
    }
    public static Personne createPersonneFromNomPrenomAdresse(String nom,
            String prenom, String Adresse){
        return new Personne(nom,prenom,Adresse);
    }
    //*************  Fluent builder ******************
    //nouvelle classe PersonneBuilder
}
