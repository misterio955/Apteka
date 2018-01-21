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

public static void WyszukiwanieKategorie (String sciezka, String Kategoria) throws IOException{
        
        int l;
        ArrayList<String> listaKategorie = new ArrayList<>();
        ArrayList<String> lista = new ArrayList<>();
        
        String first_read[] = null;
        String second_read[] = null;
        try (FileReader filereader = new FileReader(sciezka)) {
            BufferedReader buffReader = new BufferedReader(filereader);

            String textLine = buffReader.readLine();
            do {
                
                first_read = textLine.split(";");//Pierwsze rozdzielenie separatorem ";"
                lista.add(textLine);
                second_read = first_read[4].split(";");//Drugie rozdzielenie seperatorem ","
                /*for (String item : first_read)//Pętla po elementach tablicy 
                {   
                   //System.out.print(item+" ");
                   lista.add(item);
                    
                }*/
                for (String item2 : second_read){
                    //System.out.print(item2+" ");
                    listaKategorie.add(item2);
                }
                //System.out.println();
                textLine = buffReader.readLine();//Czytanie kolejnej lini
            } while (textLine != null);
        }

       ArrayList<Integer> listawynik= new ArrayList<>();
       String wynik = Kategoria;
       for (int i=0;i<listaKategorie.size();i++){
            String temp=(String)listaKategorie.get(i);
            if(temp.equalsIgnoreCase(wynik)){
            l=i+1;  
            listawynik.add(i);    
                
            }
            else
            {
                listawynik.add(-1);
            }
        }
       //System.out.println(lista.get(15));
    for (int j=0;j<lista.size();j++){
        
        if(listawynik.get(j)==-1){
            continue;
        }
        else{
            System.out.println((String)lista.get(j));
        }
    }
        
    }    
}
