package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SimpelTest simpelTest = new SimpelTest();

        //EKSEMPEL på opg. 14 Persistens
        //simpelTest.save();
        ArrayList<Opskrift> opskrifter = simpelTest.bootUp();
        for (Opskrift opskrift : opskrifter){
            System.out.println("Jeg har fundet en opskrift.");
        }
        launch(args);
    }
}
