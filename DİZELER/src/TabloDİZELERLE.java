/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class TabloDİZELERLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] tablo=new int[][]{
            {1,75,10},
            {2,87,13},
            {3,95,15},
            {4,103,17},
            {5,110,19}
        };
        for (int i=0;i<tablo.length;i++) {
            for (int j = 0; j<tablo[0].length; j++) {
                System.out.print(tablo[i][j] + " ");
            }
            System.out.println();
        }
        
                
        
    }
    
}
