package hust.soict.dsai.aims.media;


import hust.soict.dsai.aims.exception.PlayerException;

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

    public CompactDisc(CompactDisc dsc)throws Exception{
        super(dsc);
    }

    public CompactDisc(String title){
        super(title);
    }

    public CompactDisc(String title, String category,float cost)throws Exception{
        super(title,category,cost);
    }

    public void addTrack(Track track) {
        if(!tracks.contains(track.getTitle())) tracks.add(track);
        //else JOptionPane.showMessageDialog(null, "Track already exists!", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void removeTrack(Track track) throws Exception {
        if(tracks.contains(track.getTitle())) tracks.remove(track);
        else throw new Exception("Track does not exist");
    }

    public void play()throws PlayerException {
        if(this.getLength()>0){
            System.out.println("Id:"+getId()+"\nTitle:"+getTitle()+"\nCategory:"+getCategory()+
                    "\nArtist:"+getArtist()+"\nLength:"+getLength()+"\nCost:"+getCost());
            for(Track track:tracks){
                track.play();
            }
            java.util.Iterator iter=tracks.iterator();
            Track nextTrack;
            while(iter.hasNext()){
                nextTrack=(Track)iter.next();
                try{
                    nextTrack.play();
                }catch (Exception e){
                    throw e;
                }
            }
        }else{
            throw new PlayerException("Tracks is empty");
        }
        //JOptionPane.showMessageDialog(null, "Playing DVD: " + this.getTitle() + " DVD length: " + this.getLength(), "Play", JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public String toString(){
        return "Id:"+super.getId()+"\nTitle:"+super.getTitle()+
                "\nCategory:"+super.getCategory()+
                "\nArtist:"+getArtist()+"\nLength:"+getLength()+
                "\nCost:"+super.getCost();
    }


}
