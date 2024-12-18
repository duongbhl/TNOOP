package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media a,Media b){
        return Comparator.comparing(Media::getCost).thenComparing(Media::getTitle).compare(a,b);
    }

}
