package UngDungNhanDuLieu;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String serverIP = "127.0.0.1";
        int serverPort = 8080;

        try {
            Socket socket = new Socket(serverIP, serverPort);

            OutputStream outputStream = socket.getOutputStream();
            String message = "Hello, Hi, hahahahah";
            outputStream.write(message.getBytes());


            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String message1 = new String(buffer, 0, bytesRead);
            System.out.println("Receive message from server: " + message1);
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
