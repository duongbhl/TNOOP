package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen{
    public AddDigitalVideoDiscToStoreScreen(Store store, Cart cart, DigitalVideoDisc disc) {
        super(store,cart,disc);
    }
}
