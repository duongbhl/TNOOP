module UIProjects {
    requires AimsProject2;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.swing;

    opens hust.soict.dsai.javafx;
    opens hust.soict.dsai.aims.screen to javafx.fxml;

}