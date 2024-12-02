package hust.soict.dsai.aims.media;


import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbMedia = 0;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media(Media media) {
        this.title = media.getTitle();
        nbMedia++;
        this.id =nbMedia;
        this.category = media.getCategory();
        this.cost = media.getCost();
    }

    public Media(String title){
        this.title = title;
        nbMedia++;
        this.id =nbMedia;
    }

    public Media(String title, String category, float cost){
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbMedia++;
        this.id=nbMedia;
    }

    public boolean isMatch(String title){
        return true;
    }

    @Override
    public boolean equals(Object o){
        Media media = (Media) o;
        if(this.getTitle() == media.getTitle()) return true;
        else return false;
    }



}
