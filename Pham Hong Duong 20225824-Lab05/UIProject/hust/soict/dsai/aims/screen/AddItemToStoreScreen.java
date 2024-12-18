package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;
import javafx.stage.Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AddItemToStoreScreen extends JFrame {
    private Store store;
    private Cart cart;
    private Media media;
    public  AddItemToStoreScreen(Store store,Cart cart,Media media) {
        this.store = store;
        this.cart = cart;
        this.media = media;
        //frame
        this.setSize(1500,1500);
        this.setTitle("Add Item To Store");
        this.setResizable(true);
        //container
        Container pane = new Container();
        pane.setLayout(new BorderLayout());
        //label1
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel pntitle = new JPanel();
        JLabel lbtitle = new JLabel("Title: ");
        JTextField tftitle = new JTextField(20);
        pntitle.add(lbtitle);
        pntitle.add(tftitle);

        JPanel pncategory = new JPanel();
        JLabel lbcategory = new JLabel("Category: ");
        JTextField tfcategory = new JTextField(20);
        pncategory.add(lbcategory);
        pncategory.add(tfcategory);

        JPanel pncost = new JPanel();
        JLabel lbcost = new JLabel("Cost: ");
        JTextField tfcost = new JTextField(20);
        pncost.add(lbcost);
        pncost.add(tfcost);

        lbtitle.setPreferredSize(lbcategory.getPreferredSize());
        lbcost.setPreferredSize(lbcategory.getPreferredSize());

        JPanel btnbutton=new JPanel();
        JButton button = new JButton("Add Item");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int tmp=store.getItemsInStore().size();
                media.setTitle(tftitle.getText());
                media.setCategory(tfcategory.getText());
                try {
                    media.setCost(Float.parseFloat(tfcost.getText()));
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                store.addMedia(media);
                int tmp2=store.getItemsInStore().size();
                MediaStore cell=new MediaStore(store.getItemsInStore().get(store.getItemsInStore().size()-1),cart);
                StoreScreen storeScreen=new StoreScreen(store,cart);
                storeScreen.center.add(cell);
                dispose();
            }
        });
        btnbutton.add(button);

        panel.add(pntitle);
        panel.add(pncategory);
        panel.add(pncost);
        pane.add(panel,BorderLayout.CENTER);
        pane.add(btnbutton,BorderLayout.SOUTH);
        this.add(pane);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(1);
    }
}



