package com.example.stilltesing;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.IOException;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Group;

public class Game{

    private Stage stage;
    private Scene scene;
    private Parent root;
    private boolean isClicked = false;

    @FXML
    private Rectangle myRectangle;
    private Timeline timeline;
    @FXML
    private Group myGroup;

    public void switchToWelcome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
        root = loader.load();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void clickDown(){
        isClicked = true;
        System.out.println("click down");
        timeline = new Timeline(new KeyFrame(
        Duration.millis(25), // change this to control the speed
        ae ->{
            myRectangle.setHeight(myRectangle.getHeight() + 1); // increase height by 1
            myRectangle.setLayoutY(myRectangle.getLayoutY() - 1);}
        
    ));

    timeline.setCycleCount(Timeline.INDEFINITE);
    timeline.play();
    }
    public void clickUp() {
        isClicked = false;
        System.out.println("click up");

        if (timeline != null) {
            timeline.stop();
        }

        Rotate rotate = new Rotate();
        rotate.setPivotX(myRectangle.getWidth() - 5);
        rotate.setPivotY(myRectangle.getHeight() - 5);
        rotate.setAngle(90);
        myRectangle.getTransforms().add(rotate);

            Timeline timeline = new Timeline(
        new KeyFrame(Duration.seconds(0), new KeyValue(rotate.angleProperty(), 0)),
        new KeyFrame(Duration.seconds(2), new KeyValue(rotate.angleProperty(), 90))
    );

    timeline.play();

        // RotateTransition rt = new RotateTransition(Duration.millis(1000), myGroup);
        // rt.setByAngle(90);
        // rt.play();
        
    }
}
