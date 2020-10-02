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
public class Date implements Comparable<Date> {
    private int annee;
    private int mois;
    private int jour;

    public Date(int annee, int date, int day) {
        this.annee = annee;
        this.mois = date;
        this.jour = day;
    }

    public static int compare(int a,int b){
        if(a==b)
            return 0;
        else if (a>b)
            return 1;
        return -1;
    }
    @Override
    public int compareTo(Date d){
        int comparaison =  Date.compare(this.annee,d.annee);
        if( comparaison != 0)
            return comparaison;
        comparaison =  Date.compare(this.mois,d.mois);
        if( comparaison != 0)
            return comparaison;
        return Date.compare(this.jour,d.jour);
    }
    /*
    //ma comparaison c
    @Override
    public int compareTo(Date d) {
        if(annee> d.annee)
            return 1;
        else if(annee == d.annee && mois>d.mois)
            return 1;
        else if(annee == d.annee && mois==d.mois && jour>d.jour )
            return 1;
        else if(annee == d.annee && mois==d.mois && jour==d.jour )
            return 0;
        return -1;
    }
    */
    
    
    
}
