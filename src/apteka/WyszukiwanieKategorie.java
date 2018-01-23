/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apteka;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        ArrayList<String> listaKategorie = new ArrayList<>();//lista kategorie leków
        ArrayList<String> lista = new ArrayList<>();// lista leków
        ArrayList<String> wynik= new ArrayList<>(); //lista szukanych leków 
        ArrayList<Integer> listawynik= new ArrayList<>();// lista pomocnicza
        String first_read[] = null;
        String second_read[] = null;
        //wczytanie pliku tekstowego do dwoch ArrayList
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
        catch (FileNotFoundException e) {
          
            JOptionPane.showMessageDialog(null, "Brak odpowiedniej scieżki pliku");
            System.exit(1);
        }
       //porownywanie kategorii leków do szukanej kategorii, jesli nie ma danej kategorii wypisz -1 do ArrayList, jesli tak dodaj jej indeks
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
       //zwracanie leków o szukanej kategorii
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
