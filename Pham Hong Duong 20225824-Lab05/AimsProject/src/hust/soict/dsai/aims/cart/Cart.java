package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;

import javax.naming.LimitExceededException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED=20;
    private static ObservableList<Media> itemsOrdered= FXCollections.observableArrayList();
    public void addMedia(Media item) throws LimitExceededException {
        if(itemsOrdered.size()<MAX_NUMBERS_ORDERED){
            itemsOrdered.add(item);
            if(itemsOrdered.contains(item)) System.out.println("this item is already in the cart");
            else System.out.println("The disc has been added");
        }else{
            throw new LimitExceededException("FULL ALREADY ORDERED");
        }
    }

    public void removeMedia(Media item) throws LimitExceededException {
        if(itemsOrdered.size()>0){
            if(itemsOrdered.contains(item)){
                itemsOrdered.remove(item);
                System.out.println("The item has been removed");
            }else System.out.println("The item is not in the cart");
        }else throw new LimitExceededException("CLEAR ALREADY");

    }

    public void removeAll(){
        itemsOrdered.clear();
    }

    public static float totalCost(){
        float total=0;
        for(Media item : itemsOrdered){
            total+=item.getCost();
        }
        return total;

    }

    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(Media item : itemsOrdered){
            System.out.println(item.toString());
        }
        System.out.println("Total Cost: "+totalCost());
        System.out.println("**************************************************");
    }

    public ObservableList<Media> getItemsOrderedObservableList(){
        return itemsOrdered;
    }

    public String searchID(int ID){
        for(Media item : itemsOrdered){
            if(item.getId()==ID) return item.toString();
        }
        return "not found";
    }

    public String searchTitle(String title){
        for(Media item : itemsOrdered){
            if(item.isMatch(title)) return item.toString();
        }
        return "not found";
    }

    public void sortbyCost(){
        Collections.sort(itemsOrdered,Media.COMPARE_BY_COST_TITLE);
    }

    public void sortbyTitle(){
        Collections.sort(itemsOrdered,Media.COMPARE_BY_TITLE_COST);
    }




}
