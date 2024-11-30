package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc  {
    private String director;
    private int length;
    private static int nbDigitalVideoDiscs=0;


    //getter
    public String getTitle() {
        return super.getTitle();
    }

    public String getCategory() {
        return super.getCategory();
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return super.getCost();
    }
    public int getId() {
        return super.getId();
    }
    public int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    //setter
    public void setTitle(String title) {
        super.setTitle(title);
    }

    public void setCategory(String category) {
        super.setCategory(category);
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        super.setCost(cost);
    }
    public void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        this.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }
    //Constructor
    public DigitalVideoDisc(DigitalVideoDisc dvd) {
        super(dvd);
        nbDigitalVideoDiscs++;
        super.setId(nbDigitalVideoDiscs);
        this.director = dvd.getDirector();
        this.length = dvd.getLength();
    }
    public DigitalVideoDisc(String title) {
        super(title);
        nbDigitalVideoDiscs++;
        super.setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        nbDigitalVideoDiscs++;
        super.setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title,category,cost);
        this.director = director;
        this.length = length;
        nbDigitalVideoDiscs++;
        super.setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title,category,cost);
        this.director = director;
        nbDigitalVideoDiscs++;
        super.setId(nbDigitalVideoDiscs);
    }
    //toString
    public String toString() {
        return "DVD-"+
                super.getTitle()+
                "-"+super.getCategory()+"-"+
                this.director+"-"+
                this.length+":"+
                super.getCost()+"$";
    }
    public boolean isMatch(String title){
        if(super.getTitle().compareTo(title)==0) return true;
        return false;
    }



}
