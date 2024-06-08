package br.com.vinicius.youtubedownloader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/br/com/vinicius/youtubedownloader/download_view.fxml"));
            primaryStage.setTitle("YouTube Video Downloader");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}