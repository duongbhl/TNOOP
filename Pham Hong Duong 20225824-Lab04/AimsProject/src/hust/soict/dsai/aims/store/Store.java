package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore=new ArrayList<>();

    public void addMedia(Media item){
        if(!itemsInStore.contains(item)){
            itemsInStore.add(item);
            System.out.println("Added item");
        }else System.out.println("this item is already in the store");


    }

    public void removeMedia(Media item){
        if(itemsInStore.contains(item)){
            itemsInStore.remove(item);
            System.out.println("Removed item");
        }else System.out.println("this item is not in the store");

    }

    public void printMedia(){
        System.out.println("*******************************");
        for(Media item : itemsInStore){
            System.out.println(item);
            System.out.println();
        }
        System.out.println("*******************************");
    }

    public Media search(String title){
        for(Media item : itemsInStore){
            if(item.getTitle().equals(title)){
                return item;
            }
        }
        return null;
    }
}
