package megacom;

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://www.nbkr.kg/ ").get();
        Elements nbkr = doc.getElementsByAttributeValue("class", "name");
        if(nbkr.isEmpty()){
            System.out.println("Error not founded");
        }else {
            System.out.println(nbkr.text());
        }

//        Elements nbkr2 = doc.getElementsContainingOwnText("Кыргыз Республикасынын Улуттук банкы");
//        System.out.println(nbkr2);
//        System.out.println(nbkr2.select("h3[class=name]").text());
    }
}












