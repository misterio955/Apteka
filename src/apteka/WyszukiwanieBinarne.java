/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apteka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Basian
 */
public class WyszukiwanieBinarne {
    
    
    
    public void wyszukanieID(String sciezka_Pliku) throws IOException {
       
          
        try (FileReader filereader = new FileReader(sciezka_Pliku)) {
            int Wersy = 0;
            BufferedReader buffReader = new BufferedReader(filereader);
            String line = buffReader.readLine();
            
            while (line!=null){
                Wersy++;
            }
        }
        
        }
}
