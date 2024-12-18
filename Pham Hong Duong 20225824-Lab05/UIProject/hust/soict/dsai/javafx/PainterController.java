package hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;

    // Mode management (pen or erase)
    private String mode = "pen";

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if ("pen".equals(mode)) {
            // Draw a circle when in pen mode
            Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
            drawingAreaPane.getChildren().add(newCircle);
        } else if ("erase".equals(mode)) {
            // Erase by removing nodes under the mouse cursor
//
            Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.WHITE);
            drawingAreaPane.getChildren().add(newCircle);

        }
    }

    @FXML
    void penButtonPressed(ActionEvent event) {
        mode = "pen";
    }

    @FXML
    void eraseButtonPressed(ActionEvent event) {
        mode = "erase";
    }
}
