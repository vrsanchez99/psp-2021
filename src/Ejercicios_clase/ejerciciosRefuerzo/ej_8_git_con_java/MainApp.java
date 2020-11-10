package Ejercicios_clase.ejerciciosRefuerzo.ej_8_git_con_java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private AnchorPane rootLayout;

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public MainApp(){

    }

    private void initVista(){
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(FXMLLoader.class.getResource(".git_con_java/VistaCommitsLayout.fxml"));
            rootLayout =  loader.load();


            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);

            Controlador controller = loader.getController();
            controller.setMainApp(this);

            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        this.primaryStage = stage;
        primaryStage.setTitle("Hello World");

        initVista();

    }
}
