package ServerClient1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int serverPort = 8080;


        try {

            ServerSocket serverSocket = new ServerSocket(serverPort);
            System.out.println("Server is running and waiting for connection...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            InputStream inputStream = socket.getInputStream();
            int num1 = inputStream.read();
            int num2 = inputStream.read();
            System.out.println("nhan duoc 2 so la: " + num1 + ", " + num2);
            int sum = num1 + num2;
            System.out.println(sum);

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(sum);


            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
