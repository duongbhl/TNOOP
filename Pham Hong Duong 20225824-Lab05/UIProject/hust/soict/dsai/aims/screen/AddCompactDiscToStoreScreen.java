package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.store.Store;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen{
    public AddCompactDiscToStoreScreen(Store store, Cart cart, CompactDisc compactDisc) {
        super(store,cart,compactDisc);
    }
}
