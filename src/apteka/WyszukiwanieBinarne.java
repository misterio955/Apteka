/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apteka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Basian
 */
public class WyszukiwanieBinarne {
    
    private int line = 0;
    private int [] Lista;
    
            
    public int zliczenieWersow(String sciezka_Pliku) throws IOException {
       
        try (Scanner in = new Scanner(new FileReader(sciezka_Pliku))) {
            while (in.hasNext()) {
                line++;              //zliczanie wszsytkich lekarstw
            }
        }
         
          return line;    
        }
    
    public void wyszukanieID() throws IOException{
        WyszukiwanieBinarne wb = new WyszukiwanieBinarne();
        int [] lista = new int [wb.line];
        
        
        
        
    }
    
    
}
