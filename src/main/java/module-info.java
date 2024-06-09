module YoutubeDownloader {
    requires javafx.controls;
    requires javafx.fxml;

    exports br.com.vinicius.youtubedownloader to javafx.fxml, javafx.graphics;
    opens br.com.vinicius.youtubedownloader to javafx.fxml;
}