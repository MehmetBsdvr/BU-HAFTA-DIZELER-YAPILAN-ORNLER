/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */

public class TabloDİZİLERLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("TAKIM       AMLEM    ŞEHİR");
        String[][] Tablo=new String[][]{
            {"Galatasaray","GS","  İstanbul"},
            {"Fenerbahce"," FB","  İstanbul"},
            {"Besiktaş","   BJK ","İstanbul"},
            {"Trabzonspor","TS","  Trabzon" },
            {"Başaksehir"," BŞK"," İstanbul"}
        };
        
        for (int i=0;i<Tablo.length;i++) {
            for (int j = 0; j<Tablo[0].length; j++) {
                System.out.print(Tablo[i][j] + "  ");
            }
            System.out.println();
        }
            
        }
    }   
    
    

