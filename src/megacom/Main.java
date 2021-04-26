package megacom;

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://www.nbkr.kg/ ").get();
        String words = doc.title();
        System.out.println(words);


        //System.out.println(doc);

        /*
        Elements h1Elements = doc.getElementsByAttributeValue("class", "name");
        Elements h2Elements = doc.getAllElements();

        System.out.println(h1Elements);
        System.out.println(h2Elements);
*/
    }
}












