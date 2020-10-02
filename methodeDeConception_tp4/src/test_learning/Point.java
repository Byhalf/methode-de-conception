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
public class Point {

    /**
     * @param args the command line arguments
     */

    private double x;
    private double y;
    private Mathematiques mathematiques;
    
    public Point(double x, double y) {
        Mathematiques maths = this.getMathematiques();
        
        if(!maths.estPositif(x))
            this.x=0;
        else
            this.x = x;

        if(!maths.estPositif(y))
            this.y=0;
        else
            this.y = y;
    }
    protected Mathematiques getMathematiques()
    {
        return new DefaultMathematiques();
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    

    public String toString(){
        return "("+x+","+y+")";
    }
}
