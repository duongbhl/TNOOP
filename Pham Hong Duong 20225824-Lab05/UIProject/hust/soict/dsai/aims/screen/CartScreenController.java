package hust.soict.dsai.aims.screen;


import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.binding.StringBinding;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.naming.LimitExceededException;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class CartScreenController {

    private Store store;
    private Cart cart;


    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    public Label totalCost;

    @FXML
    private float totalCost(){
        return this.cart.totalCost();
    }

    @FXML
    public void PlaceOrder(javafx.event.ActionEvent event) {
        this.cart.removeAll();
        JOptionPane.showMessageDialog(null,"Đã thực hiện thanh toán");
        totalCost.setText(String.valueOf(totalCost()));
    }


    public CartScreenController(Store store,Cart cart) {
        super();
        this.store = store;
        this.cart = cart;
    }

    @FXML
    void btnPlayPressed(javafx.event.ActionEvent event) {
        Media media=tblMedia.getSelectionModel().getSelectedItem();
        if(media instanceof Playable){
            Playable playable=(Playable)media;
            try {
                playable.play();
            } catch (PlayerException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @FXML
    void btnRemovePressed(javafx.event.ActionEvent event) {
        Media media=tblMedia.getSelectionModel().getSelectedItem();
        try {
            cart.removeMedia(media);
        } catch (LimitExceededException e) {
            throw new RuntimeException(e);
        }
        totalCost.setText(String.valueOf(totalCost()));
    }

    @FXML
    void openStoreScreen(javafx.event.ActionEvent event) {
        //Store store = new Store();
        //Cart cart=new Cart();
//        Book book1 = new Book("duong","123",100);
//        CompactDisc cd1=new CompactDisc("long","123",200);
//        DigitalVideoDisc dvd1=new DigitalVideoDisc("duc","123",300);
//        Book book2 = new Book("duy","123",100);
//        CompactDisc cd2=new CompactDisc("linh","123",200);
//        DigitalVideoDisc dvd2=new DigitalVideoDisc("dung","123",300);
//        Book book3 = new Book("huy","123",100);
//        CompactDisc cd3=new CompactDisc("hung","123",200);
//        DigitalVideoDisc dvd3=new DigitalVideoDisc("cuong","123",300);
//        store.addMedia(book1);
//        store.addMedia(cd1);
//        store.addMedia(dvd1);
//        store.addMedia(book2);
//        store.addMedia(cd2);
//        store.addMedia(dvd2);
//        store.addMedia(book3);
//        store.addMedia(cd3);
//        store.addMedia(dvd3);
        StoreScreen storeScreen=new StoreScreen(store,cart);
    }

    @FXML
    private void initialize() {
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("Title"));
        colMediacategory.setCellValueFactory(new PropertyValueFactory<Media, String>("Category"));
        colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("Cost"));
        tblMedia.setItems(this.cart.getItemsOrderedObservableList());
        totalCost.setText(String.valueOf(totalCost()));
        this.cart.getItemsOrderedObservableList().addListener((ListChangeListener<Media>) change -> {
            // Cập nhật lại total cost khi danh sách thay đổi
            Platform.runLater(() -> {
                totalCost.setText(String.format("%.2f $", totalCost()));
            });
        });


    }
}

