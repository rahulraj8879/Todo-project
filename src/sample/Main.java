//YASEER MADE A PULL REQUEST.

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.DataBase.Config;
import sample.DataBase.DatabaseHandler;

import java.sql.ResultSet;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("View/login.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("View/list.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
        System.out.println("pushed to git hub");


    }


    public static void main(String[] args) {
        launch(args);
    }
}
