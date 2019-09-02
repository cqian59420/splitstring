package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("StringSpliter.fxml"));
        primaryStage.setTitle("String Spliter");
        Scene sence = new Scene(root, 800, 600);

     /*   Label label = new Label("分隔符 ");
        TextField spliterStr = new TextField();


        GridPane gridPane = new GridPane();
        gridPane.add(label,0,0);
        gridPane.add(spliterStr, 1, 0);*/


        primaryStage.setScene(sence);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
