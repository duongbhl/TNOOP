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

    public Disc(Disc dsc)throws Exception{
        super(dsc);
    }

    public Disc(String title){
        super(title);
    }

    public Disc(String title, String category,float cost)throws Exception{
        super(title,category,cost);
    }

}
