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
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Dizimiz kaç elemanlı olsun");
        int uzunluk=input.nextInt();
        input.nextLine();
        
        String[] isimler=new String[uzunluk];
        for(int i=0;i<isimler.length;i++){
            System.out.println("Uzunluk "+(i)+"index degeri giriniz");
            isimler[i]=input.nextLine();
        }
        for(int i=0;i<isimler.length;i++){
            System.out.println(isimler[i]);
            break;
            
        }
    }
    
}
