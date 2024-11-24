package AimsPackage.src;


public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc digitalVideoDisc1 = new DigitalVideoDisc("the lion king","animation","roger allers",87,19.5f);
        cart.addDigitalVideoDisc(digitalVideoDisc1);
        DigitalVideoDisc digitalVideoDisc2 = new DigitalVideoDisc("star wars","science fiction","george lucas",24.95f);
        cart.addDigitalVideoDisc(digitalVideoDisc2);
        DigitalVideoDisc digitalVideoDisc3 = new DigitalVideoDisc("aladin","animation",29.5f);
        cart.addDigitalVideoDisc(digitalVideoDisc3);
        DigitalVideoDisc digitalVideoDisc4=new DigitalVideoDisc("HarryPotter");//cost=0
        cart.addDigitalVideoDisc(digitalVideoDisc4);
        System.out.println("The total cost is: "+cart.totalCost());
        cart.removeDigitalVideoDisc(digitalVideoDisc2);
        System.out.println(cart.getQtyOrdered());




    }
}