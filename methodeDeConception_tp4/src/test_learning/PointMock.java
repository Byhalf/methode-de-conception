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
public class PointMock extends Point{
    
    public PointMock(double x, double y) {
        super(x, y);
    }
    
    public Mathematiques getMathematiques(){
        return new MathematiquesMock();
    }
}
