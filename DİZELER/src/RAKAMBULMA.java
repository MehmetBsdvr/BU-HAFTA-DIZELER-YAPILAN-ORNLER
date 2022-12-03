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
public class RAKAMBULMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Rakam Bulma oyunu");
        Scanner input=new Scanner(System.in);
        System.out.println("Sayınızı giriniz");
        int N=input.nextInt();
        int[] Rakamlar={0,1,2,3,4,5,6,7,8,9};
        for(int i=0;i<Rakamlar.length;i++){
            System.out.println("Rakamlar"+(i));
            Rakamlar[i]=input.nextInt();
        }
    }
    
}
