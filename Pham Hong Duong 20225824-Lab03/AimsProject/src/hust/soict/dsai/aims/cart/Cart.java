package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED=20;
    private ArrayList<DigitalVideoDisc> itemsOrdered=new ArrayList<>(MAX_NUMBERS_ORDERED);
    private static int qtyOrdered=0;
    public void addDigitalVideoDisc(DigitalVideoDisc item){
        itemsOrdered.add(item);
        qtyOrdered++;
        if(qtyOrdered<20) System.out.println("The disc has been added");
        else if(qtyOrdered==20) System.out.println("The disc is almost full");
    }
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdlist){
        for (DigitalVideoDisc dvd : dvdlist) {
            itemsOrdered.add(dvd);
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc item){
        itemsOrdered.remove(item);
        qtyOrdered--;
        System.out.println("The disc has been removed");
    }
    public float totalCost(){
        float total=0;
        for(DigitalVideoDisc item : itemsOrdered){
            total+=item.getCost();
        }
        return total;

    }
    public int getQtyOrdered(){
        return this.qtyOrdered;
    }
    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(DigitalVideoDisc item : itemsOrdered){
            System.out.println(item.toString());
        }
        System.out.println("Total Cost: "+totalCost());
        System.out.println("**************************************************");
    }
    public String searchID(int ID){
        for(DigitalVideoDisc item : itemsOrdered){
            if(item.getId()==ID) return item.toString();
        }
        return "not found";
    }
    public String searchTitle(String title){
        for(DigitalVideoDisc item : itemsOrdered){
            if(item.isMatch(title)) return item.toString();
        }
        return "not found";
    }






}
