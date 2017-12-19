package apteka;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.Scanner;

public class ProbaWczytania {

    public static void wczytanie(String nazwa) throws FileNotFoundException {

        ArrayList<Lekarstwo> lekarstwa = new ArrayList<>();

        Scanner in = new Scanner(new FileReader(nazwa));
        String line;
        while (in.hasNext()) {
            line = in.nextLine();
            String lineElements[] = line.split(";");


        }
        in.close();

    }

}
