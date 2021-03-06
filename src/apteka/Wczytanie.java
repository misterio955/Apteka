package apteka;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class Wczytanie {

    private String sciezka;
    private String pattern;

    private ArrayList<String> Lista_elemetow = new ArrayList<>();

    public Wczytanie(String sciezka, String pattern) throws IOException {
        this.sciezka = sciezka;
        this.pattern = pattern;
    }

    public void zmianapatterna(String pattern) {
        this.pattern = pattern;
    }

    public void porownanie_algorytm_boyer_more() throws IOException {
        Algorytm_Boyer_Moore abm = new Algorytm_Boyer_Moore();
        String first_read[] = null;
        String second_read[] = null;
        try (FileReader filereader = new FileReader(this.sciezka)) {
            BufferedReader buffReader = new BufferedReader(filereader);

            String textLine = buffReader.readLine();
            do {

                first_read = textLine.split(";");//Pierwsze rozdzielenie separatorem ";"
                second_read = first_read[2].split(",");//Drugie rozdzielenie seperatorem ","
                for (String item : second_read)//Pętla po elementach tablicy 
                {
                    if (abm.BM_alg(item, this.pattern) == true) {
                        if (Lista_elemetow.isEmpty() || Lista_elemetow.indexOf(textLine) == -1) {
                            
                            Lista_elemetow.add(textLine);
                        }
                    }
                }
            
            textLine = buffReader.readLine();//Czytanie kolejnej lini
        }
        while (textLine != null);
        }
    }

public void wyszukanie_kmp() throws IOException {
        Algorytm_Knutha_Morrisa_Pratta akmp = new Algorytm_Knutha_Morrisa_Pratta();
        String first_read[] = null;
        String second_read[] = null;
        try (FileReader filereader = new FileReader(this.sciezka)) {
            BufferedReader buffReader = new BufferedReader(filereader);

            String textLine = buffReader.readLine();
            do {

                first_read = textLine.split(";");//Pierwsze rozdzielenie separatorem ";"
                second_read = first_read[1].split(",");//Drugie rozdzielenie seperatorem ","
                for (String item : second_read)//Pętla po elementach tablicy 
                {
                    if (akmp.akmp(item, this.pattern) == true) {
                        Lista_elemetow.add(textLine);
                    }
                }

                textLine = buffReader.readLine();//Czytanie kolejnej lini w
            } while (textLine != null);

        }
        catch (FileNotFoundException e) {
          
            JOptionPane.showMessageDialog(null, "Brak odpowiedniej scieżki pliku");
            System.exit(1);
        }
    }

    public ArrayList przekazanie_elementow() {
        
        return Lista_elemetow; // przekazanie
    }

}
