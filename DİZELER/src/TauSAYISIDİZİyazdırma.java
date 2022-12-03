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
public class TauSAYISIDİZİyazdırma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tau sayı bulma");
        Scanner input=new Scanner(System.in);
        System.out.println("Sayınızı giriniz");
        int N=input.nextInt();
        input.nextLine();
        
        int[] Tau=new int[N];
        for(int i=0;i<Tau.length;i++){
            System.out.println("SAYINIZ"+(i)+"Tau sayınızı giriniz");
            Tau[i]=input.nextInt();
            input.nextInt();
        }
        for(int TAU:Tau){
            for(int j=1;j<TAU;j++){
                
                if(TAU%j==0){
                    System.out.println("TAU SAYISIDIR");
                    break;
                }
                else{
                    System.out.println("TAU SAYISI DEGİLDİR");
                    break;
                }
            }
        }
    }
    
}
