package piecesPuzzle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21705720
 */
public class Piece {
    private int x;
    private int y;
    
    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "("+Integer.toString(x)+";"+Integer.toString(y)+")";
    }
     public static void main (String[] args){
         Piece p1 = new Piece(12,14);
         System.out.println(p1);
     }
}
