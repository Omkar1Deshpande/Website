package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadVideo {

    private JFrame frame;
    private JTextField urlField;
    private JTextField filenameField;
    private JButton downloadButton;
    private JLabel messageLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DownloadVideo::new);
    }

    public DownloadVideo() {
        frame = new JFrame("Video Downloader");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 1));

        urlField = new JTextField("Enter video URL here");
        filenameField = new JTextField("Enter filename (with extension)");
        downloadButton = new JButton("Download Video");
        messageLabel = new JLabel("", SwingConstants.CENTER);

        downloadButton.addActionListener(new DownloadButtonListener());

        frame.add(urlField);
        frame.add(filenameField);
        frame.add(downloadButton);
        frame.add(messageLabel);

        frame.setVisible(true);
    }

    private class DownloadButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String videoUrl = urlField.getText();
            String savePath = "C:\\Users\\Omkar\\Desktop\\Video\\" + filenameField.getText();
            messageLabel.setText("Downloading...");

            new Thread(() -> {
                try {
                    downloadVideo(videoUrl, savePath);
                    messageLabel.setText("Download complete!");
                } catch (IOException ex) {
                    messageLabel.setText("Error: " + ex.getMessage());
                }
            }).start();
        }
    }

    private void downloadVideo(String videoUrl, String savePath) throws IOException {
        URL url = new URL(videoUrl);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setDoOutput(true);

        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (InputStream in = new BufferedInputStream(httpURLConnection.getInputStream());
                 FileOutputStream fileOutputStream = new FileOutputStream(savePath)) {

                byte[] dataBuffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(dataBuffer, 0, dataBuffer.length)) != -1) {
                    fileOutputStream.write(dataBuffer, 0, bytesRead);
                }
            }
        } else {
            throw new IOException("Server returned response code: " + responseCode);
        }
    }
}
