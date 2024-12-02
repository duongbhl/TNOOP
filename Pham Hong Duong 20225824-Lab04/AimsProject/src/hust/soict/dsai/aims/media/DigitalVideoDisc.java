package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable  {
    private String director;
    private int length;

    //getter
    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DigitalVideoDisc(DigitalVideoDisc dvd) {
        super(dvd);
        this.director = dvd.getDirector();
        this.length = dvd.getLength();
    }

    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title,category,cost);
        this.director = director;
        this.length = length;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title,category,cost);
        this.director = director;
    }

    @Override
    public String toString() {
        return "Id:"+super.getId()+"\nTitle"+
                super.getTitle()+
                "\nCategory:"+super.getCategory()+"\nDirector:"+
                this.director+"\nLength:"+
                this.length+"\nCost:"+
                super.getCost()+"$";
    }

    @Override
    public boolean isMatch(String title){
        if(super.getTitle().compareTo(title)==0) return true;
        return false;
    }

    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());


    }



}
