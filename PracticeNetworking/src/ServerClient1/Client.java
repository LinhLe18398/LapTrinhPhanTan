package ServerClient1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String serverIP = "127.0.0.1";
        int severPort = 8080;

        try {
            Socket socket = new Socket(serverIP, severPort);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap so dau tien: ");
            int number1 = scanner.nextInt();
            System.out.println("Nhap so thu 2: ");
            int number2 = scanner.nextInt();

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(number1);
            outputStream.write(number2);


            InputStream inputStream = socket.getInputStream();
            System.out.println("Tong 2 so la: " + inputStream.read());

            socket.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
