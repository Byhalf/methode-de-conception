/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_learning;

/**
 *
 * @author 21705720
 */
public class DefaultMathematiques implements Mathematiques {

    @Override
    public boolean estPositif(double v) {
        if(v>0)
            return true;
        return true;
    }

    @Override
    public double valeurAbsolue(double v) {
        if(v>=0)
            return v;
        else
           return -v; 
    }
    
}
