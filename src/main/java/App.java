import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public static void main(String[] args) {
        System.out.println(getRandomQuote());

    }

    public static String getRandomQuote(){
        try{
            //Create a new Gson object
            Gson gson = new Gson();

            //Read the recentquotes.json file
            BufferedReader reader = new BufferedReader(new FileReader("resources/quotes.json"));

            //convert the json to  Java object (quotes)
            Quote[] quotes = gson.fromJson(reader, Quote[].class);

           //Printing the quotes/authors Details

            //Generating a random number based on array length
            int rand = (int)(Math.random()*(quotes.length));
            //Printing out random quote
            return quotes[rand].toString();
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

    }


}
