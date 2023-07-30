package UngDungNhanDuLieu;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public static void main(String[] args) {
        int serverPort = 8080;

        try {
            ServerSocket serverSocket = new ServerSocket(serverPort);
            System.out.println("Server is running and waiting for connection...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String message = new String(buffer,0,bytesRead);
            System.out.println("Receive message from clinet: " + message);


            OutputStream outputStream = socket.getOutputStream();
            String message1 = "CHao lai nhe";
            outputStream.write(message1.getBytes());


            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
