package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors=new ArrayList<String>();

    public int getId() {
        return super.getId();
    }

    public void setId(int id) {
        super.setId(id);
    }

    public String getTitle() {
        return super.getTitle();
    }

    public void setTitle(String title) {
        super.setTitle(title);
    }

    public String getCategory() {
        return super.getCategory();
    }

    public void setCategory(String category) {
        super.setCategory(category);
    }

    public float getCost() {
        return super.getCost();
    }

    public void setCost(float cost) {
        super.setCost(cost);
    }
    public void addAuthor(String author) {
        if(!authors.contains(author)) authors.add(author);
    }
    public void removeAuthor(String author) {
        if(authors.contains(author)) authors.remove(author);
    }

}
