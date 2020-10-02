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
public class PointTest {
    
    public PointTest() {
    }
    /*
    @Test
    public void testGetX() {
        System.out.println("getX");
        Point instance = null;
        float expResult = 0.0F;
        float result = instance.getX();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetY() {
        System.out.println("getY");
        Point instance = null;
        float expResult = 0.0F;
        float result = instance.getY();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    */
    @Test
    public void testToString() {
        System.out.println("toString");
        Point p = new Point(1,2);
        assertEquals(p.toString(), "(1.0,2.0)");
    }
    @Test
    public void testConstructeur() 
    {
    Point p1 =createPoint(-1, 2);
    assertTrue(p1.getX() == 0);
    assertTrue(p1.getY() == 2);
    Point p2 = createPoint(1, -2);
    assertTrue(p2.getX() == 1);
    assertTrue(p2.getY() == 0);}
    
    public Point createPoint(double x,double y){
        return new PointMock(x,y); // replacer par new Point(x,y) lorsque l'on veut tester avec la vraie classe (sans le Mock).
    }
}
