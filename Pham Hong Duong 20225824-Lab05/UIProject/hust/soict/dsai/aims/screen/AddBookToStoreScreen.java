package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookToStoreScreen extends AddItemToStoreScreen{
    public AddBookToStoreScreen(Store store, Cart cart, Book book) {
        super(store,cart,book);
    }

}
