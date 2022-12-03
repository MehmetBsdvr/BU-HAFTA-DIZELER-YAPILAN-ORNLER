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
public class A6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Sayıları giriniz");
        int sayıdizisi=input.nextInt();
        input.nextLine();
         
        int[] sayılar=new int[sayıdizisi];
        
        for(int i=0;i<sayılar.length;i++){
            System.out.println("Sayıları "+(i)+"index degeri giriniz");
            sayılar[i]=input.nextInt();
        }
        
        for(int i=0;i<sayılar.length;i++){
            System.out.println(sayılar[i]);
            
        }
        
    }
    
}
