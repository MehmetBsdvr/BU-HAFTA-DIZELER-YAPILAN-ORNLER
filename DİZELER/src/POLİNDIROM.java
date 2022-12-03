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
public class POLİNDIROM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
       /* for(int i=1;i<=9;i++){
            for(int j=0;j<=9;j++){
                System.out.println("4 basamalı Polindırom listesi:"+(1000*i+100*j+10*j+i));
            }
        }*/ 
       System.out.println("Sayınızı giriniz");
       int N=input.nextInt();
       for(int i=1;i<=N;i++){
           for(int j=0;j<=N;j++){
               System.out.println(" rasgele: "+(10*i+j+i));
           }
       }
     
    }
    
}
