package apteka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProbaWczytania {

    public void wczytanie(String sciezka_Pliku) throws IOException {
        String first_read[] = null;
        String second_read[] = null;
        try (FileReader filereader = new FileReader(sciezka_Pliku)) {
            BufferedReader buffReader = new BufferedReader(filereader);

            String textLine = buffReader.readLine();
            do {
                
                first_read = textLine.split(";");//Pierwsze rozdzielenie separatorem ";"
                second_read = first_read[3].split(",");//Drugie rozdzielenie seperatorem ","
                for (String item : second_read)//Pętla po elementach tablicy 
                {   
                    System.out.print(item+" ");
                }
                System.out.println();
                textLine = buffReader.readLine();//Czytanie kolejnej lini
            } while (textLine != null);
        }

    }

}
