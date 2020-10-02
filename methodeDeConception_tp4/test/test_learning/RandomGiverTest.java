/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_learning;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 21705720
 */
public class RandomGiverTest {
    
    public RandomGiverTest() {
    }

    @Test
    public void testSomeMethod() {
        int n = 10000;
        int m = 100;
        int tab[] = new int[100];
        for(int i=0;i<n;i++)
        {
            double r = RandomGiver.random();
            int index = (int) (r*m);
            tab[index]++;
        }
        for(int i=0;i<m;i++){
            if(tab[i]<50 || tab[i]>150)
                fail("valeur trop faible ou élevé");
        }
    }
    
}
