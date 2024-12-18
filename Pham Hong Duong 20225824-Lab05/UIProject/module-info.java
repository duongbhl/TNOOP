module UIProjects {
    requires AimsProject2;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.swing;
    requires java.naming;

    opens hust.soict.dsai.javafx;
    opens hust.soict.dsai.aims.screen to javafx.fxml;

}