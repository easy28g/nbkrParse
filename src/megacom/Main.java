package megacom;

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://www.nbkr.kg/ ").get();
        Elements h1Elements = doc.getElementsByAttributeValue("class", "name");
        System.out.println(h1Elements.text());

//        Elements h2Elements = doc.getElementsContainingOwnText("Кыргыз Республикасынын Улуттук банкы");
//        System.out.println(h2Elements);
//        System.out.println(h2Elements.select("h3[class=name]").text());
    }
}












