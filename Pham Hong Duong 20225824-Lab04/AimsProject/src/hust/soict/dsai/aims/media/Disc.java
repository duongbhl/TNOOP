package hust.soict.dsai.aims.media;

public class Disc extends Media {
    private String director;
    private int length;

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }
    public Disc(Disc dsc){
        super(dsc);
    }
    public Disc(String title){
        super(title);
    }
    public Disc(String title, String category,float cost){
        super(title,category,cost);
    }

    //constructors




}
