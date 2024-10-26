//6.1

package TNOOP;

import javax.swing.*;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null,"You've chosen: "+(option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
//Nếu chọn cancel thì khi chạy chương trình sau cửa sổ thông báo đó lại hiện lên và hỏi người dùng có muốn tự động save trước khi launch hay không
//