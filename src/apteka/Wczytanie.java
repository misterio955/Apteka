package apteka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public final class Wczytanie {

    private String sciezka;
    private String pattern;
    private Algorytm_Boyer_Moore abm = new Algorytm_Boyer_Moore();
    private ArrayList<String> Lista_elemetow = new ArrayList<>();

    public Wczytanie(String sciezka, String pattern) throws IOException {
        this.sciezka = sciezka;
        this.pattern = pattern;
    }

    public void porownanie_algorytm_boyer_more() throws IOException {
        String first_read[] = null;
        String second_read[] = null;
        try (FileReader filereader = new FileReader(this.sciezka)) {
            BufferedReader buffReader = new BufferedReader(filereader);

            String textLine = buffReader.readLine();
            do {

                first_read = textLine.split(";");//Pierwsze rozdzielenie separatorem ";"
                second_read = first_read[3].split(",");//Drugie rozdzielenie seperatorem ","
                for (String item : second_read)//Pętla po elementach tablicy 
                {
                    if (abm.BM_alg(item, this.pattern) == true) {
//                        System.out.println(textLine);
//                        System.out.println(item);
//                        System.out.println("Szukane słowo " + pattern);
//                        System.out.println("udało sie znaleźć");
                        Lista_elemetow.add(textLine);
                    }
                }
                

                textLine = buffReader.readLine();//Czytanie kolejnej lini
            } while (textLine != null);

        }

    }
    
    public ArrayList przekazanie_elementow ()
    {
        return Lista_elemetow;
    }

}