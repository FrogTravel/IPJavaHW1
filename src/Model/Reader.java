package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Reader {
    public String readUrlFromConsole(){
        Scanner scan = new Scanner(System.in);
        String url = scan.nextLine();
        if(url.startsWith("/")){
            url = "file:/" + url;
        }
        return url;
    }

    public String readTextFromURL(String urlPath) {
        URL url = null;
        BufferedReader reader = null;
        try {
            url = new URL(urlPath);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String line;
        StringBuilder text = new StringBuilder();

        if(url != null && reader != null) {
            try {
                while ((line = reader.readLine()) != null) {
                    text.append(line);
                }
                reader.close();
            } catch (IOException exception) {
                System.out.println("Ошибка чтения");
                //TODO что можно сделать с IOException?
            }

        }

        return text.toString();
    }

}
