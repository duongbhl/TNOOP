package hust.soict.dsai.test.poly;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class PolyTest {
    public static void main(String[] args) {
        ArrayList<Media>mediae=new ArrayList<Media>();

        Book book= null;
        try {
            book = new Book("titanic","romantic",100);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        DigitalVideoDisc dvd= null;
        try {
            dvd = new DigitalVideoDisc("tom and jerry","cartoon","habera",50,200);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        CompactDisc cd= null;
        try {
            cd = new CompactDisc("attack on titan","action",500);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        mediae.add(book);
        mediae.add(dvd);
        mediae.add(cd);

        for (Media media : mediae) {
            System.out.println(media.toString()+"\n");
        }


    }
}
