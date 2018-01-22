/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apteka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Gosc
 */
public class WyszukiwanieKategorie {
public boolean equalsIgnoreCase(String anotherString){
    return false;
};

public ArrayList WyszukiwanieKategorie (String sciezka, String Kategoria) throws IOException{
        
        int l;
        String kat = Kategoria;
        ArrayList<String> listaKategorie = new ArrayList<>();
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> wynik= new ArrayList<>();
        ArrayList<Integer> listawynik= new ArrayList<>();
        String first_read[] = null;
        String second_read[] = null;
        
        try (FileReader filereader = new FileReader(sciezka)) {
            BufferedReader buffReader = new BufferedReader(filereader);

            String textLine = buffReader.readLine();
            do {
                
                first_read = textLine.split(";");
                lista.add(textLine);
                second_read = first_read[4].split(";");
                for (String item2 : second_read){
                    listaKategorie.add(item2);
                }
                textLine = buffReader.readLine();
            } while (textLine != null);
        }
       
       for (int i=0;i<listaKategorie.size();i++){
            String temp=(String)listaKategorie.get(i);
            if(temp.equalsIgnoreCase(kat)){
            l=i+1;  
            listawynik.add(i);    
                
            }
            else
            {
                listawynik.add(-1);
            }
        }
       
    for (int j=0;j<lista.size();j++){
        
        if(listawynik.get(j)==-1){
            continue;
        }
        else{
            wynik.add(String.valueOf(lista.get(j)));
        }
    }
      return wynik;  
    }
}
