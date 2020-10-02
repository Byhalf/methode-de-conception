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
//est ce qu'on implémente mathematiques
public class MathematiquesMock implements Mathematiques {
    public boolean estPositif(double v){
        if(v==1||v==2)
            return true;
        if(v==(-1)||v==(-2))
            return false;
        return false;
        
    }

    @Override
    public double valeurAbsolue(double v) {
        if(v==1||v==2)
            return v;
        if(v==(-1)||v==(-2))
            return -v;
        return 0;
    }
    
}
