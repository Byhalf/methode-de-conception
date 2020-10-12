/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piecesPuzzle;

public class PieceL extends PieceAbstract{
    public PieceL(int width,int height,Position gamePosition) {
        super(width,height,gamePosition);
        for(int i=0;i<height;i++){
            grid[0][i] = true;
        }for(int j=0;j<width;j++){
            grid[j][0] = true;
        }
    }
}
