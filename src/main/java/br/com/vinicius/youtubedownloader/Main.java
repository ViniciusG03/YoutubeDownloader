package br.com.vinicius.youtubedownloader;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/br/com/vinicius/youtubedownloader/download_view.fxml"));
            Scene scene = new Scene(root, 600, 400);

            scene.getStylesheets().add(getClass().getResource("/dark-theme.css").toExternalForm());

            primaryStage.setTitle("YouTube Video Downloader");
            primaryStage.setScene(scene);

            Image icon = new Image(getClass().getResourceAsStream("/src/main/resources/yt-logo.png"));
            primaryStage.getIcons().add(icon);

            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}