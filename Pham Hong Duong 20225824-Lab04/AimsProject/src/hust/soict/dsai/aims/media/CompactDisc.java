package hust.soict.dsai.aims.media;

import javax.swing.*;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track>tracks=new ArrayList<>();

    public String getArtist() {
        return artist;
    }

    public int getLength() {
        int sum=0;
        for(Track track : tracks) sum+=track.getLength();
        return sum;
    }

    public CompactDisc(CompactDisc dsc){
        super(dsc);
    }

    public CompactDisc(String title){
        super(title);
    }

    public CompactDisc(String title, String category,float cost){
        super(title,category,cost);
    }

    public void addTrack(Track track) {
        if(!tracks.contains(track.getTitle())) tracks.add(track);
        else JOptionPane.showMessageDialog(null, "Track already exists!", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void removeTrack(Track track) {
        if(tracks.contains(track.getTitle())) tracks.remove(track);
        else JOptionPane.showMessageDialog(null, "Track does not exist!", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void play(){
        System.out.println("Id:"+getId()+"\nTitle:"+getTitle()+"\nCategory:"+getCategory()+
                "\nArtist:"+getArtist()+"\nLength:"+getLength()+"\nCost:"+getCost());
        for(Track track:tracks){
             track.play();
        }
    }

    @Override
    public String toString(){
        return "Id:"+super.getId()+"\nTitle:"+super.getTitle()+
                "\nCategory:"+super.getCategory()+
                "\nArtist:"+getArtist()+"\nLength:"+getLength()+
                "\nCost:"+super.getCost();
    }


}
