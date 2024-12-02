package hust.soict.dsai.test.poly;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class PolyTest {
    public static void main(String[] args) {
        ArrayList<Media>mediae=new ArrayList<Media>();

        Book book=new Book("titanic","romantic",100);
        DigitalVideoDisc dvd=new DigitalVideoDisc("tom and jerry","cartoon","habera",50,200);
        CompactDisc cd=new CompactDisc("attack on titan","action",500);

        mediae.add(book);
        mediae.add(dvd);
        mediae.add(cd);

        for (Media media : mediae) {
            System.out.println(media.toString()+"\n");
        }


    }
}
