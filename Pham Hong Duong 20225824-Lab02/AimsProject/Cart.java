package AimsPackage;

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







}
