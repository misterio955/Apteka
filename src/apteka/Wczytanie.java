package apteka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public final class Wczytanie {

    
    private Algorytm_Boyer_Moore abm = new Algorytm_Boyer_Moore();

    public void wczytanie(String sciezka_Pliku, String pattern) throws IOException {
        //String first_read[] = null;
        //String second_read[] = null;
        //boolean spr_alg = false;
        try (FileReader filereader = new FileReader(sciezka_Pliku)) {
            BufferedReader buffReader = new BufferedReader(filereader);

            String textLine = buffReader.readLine();
            do {

                /* 
                first_read = textLine.split(";");//Pierwsze rozdzielenie separatorem ";"
                second_read = first_read[3].split(",");//Drugie rozdzielenie seperatorem ","
                for (String item : second_read)//Pętla po elementach tablicy 
                {   
                    System.out.print(item+" ");
                }
                System.out.println();
                 */
                
                if (abm.BM_alg(textLine, "ciąża") == true) {
                    System.out.println(textLine);
                    System.out.println(pattern);
                    System.out.println("udało sie znaleźć");
                }

                textLine = buffReader.readLine();//Czytanie kolejnej lini
            } while (textLine != null);

        }

    }

    public Wczytanie(String sciezka, String pattern) throws IOException {
        wczytanie(sciezka, pattern);
    }

}
