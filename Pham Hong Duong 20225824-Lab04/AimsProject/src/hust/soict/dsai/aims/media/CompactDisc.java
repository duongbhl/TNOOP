package hust.soict.dsai.aims.media;

import javax.swing.*;
import java.util.ArrayList;

public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track>tracks=new ArrayList<>();

    public String getArtist() {
        return artist;
    }

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

    public CompactDisc(Disc dsc){
        super(dsc);
    }
    public CompactDisc(String title){
        super(title);
    }
    public CompactDisc(String title, String category,float cost){
        super(title,category,cost);
    }


    public void addTrack(Track track) {
        if(!tracks.contains(track)) tracks.add(track);
        else JOptionPane.showMessageDialog(null, "Track already exists!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    public void removeTrack(Track track) {
        if(tracks.contains(track)) tracks.remove(track);
        else JOptionPane.showMessageDialog(null, "Track does not exist!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    public int getLength() {
        int sum=0;
        for(Track track : tracks) sum+=track.getLength();
        return sum;
    }
}
