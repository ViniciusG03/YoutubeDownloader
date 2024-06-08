package br.com.vinicius.youtubedownloader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DownloadController {
    @FXML
    private TextField urlField;

    @FXML
    private Button downloadButton;

    @FXML
    private Label statusLabel;

    @FXML
    protected void handleDownloadButtonAction() {
        String url = urlField.getText();
        if (url.isEmpty()) {
            statusLabel.setText("Por favor, insira uma URL.");
            return;
        }

        try {
            ProcessBuilder builder = new ProcessBuilder("C:\\Program Files\\youtube-dlp\\yt-dlp.exe", "-o", "%(title)s.%(ext)s", "-f", "bestvideo[ext=mp4]+bestaudio[ext=m4a]/best[ext=mp4]", url);
            builder.redirectErrorStream(true);
            Process process = builder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                statusLabel.setText("Download concluído com sucesso!");
            } else {
                statusLabel.setText("Falha no download. Verifique a URL e tente novamente.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            statusLabel.setText("Ocorreu um erro: " + e.getMessage());
        }
    }
}
