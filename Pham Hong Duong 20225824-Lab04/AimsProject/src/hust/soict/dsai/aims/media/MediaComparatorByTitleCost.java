package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media a,Media b){
        return Comparator.comparing(Media::getTitle).thenComparing(Media::getCost).compare(a,b);
    }
}
