package com.example.serverchatjavafx;

import javafx.scene.layout.VBox;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket socket;
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;

    public Server(ServerSocket serverSocket) {

        try {
            this.serverSocket = serverSocket;
            this.socket = serverSocket.accept();
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        } catch (IOException e) {
            e.printStackTrace();
            close(serverSocket,socket,bufferedWriter,bufferedReader);
        }
    }

    public void close(ServerSocket serverSocket, Socket socket, BufferedWriter bufferedWriter, BufferedReader bufferedReader){
        try {
            if (serverSocket!= null){
                serverSocket.close();
            }
            if (socket != null){
                socket.close();
            }
            if (bufferedWriter != null){
                bufferedWriter.close();
            }
            if (bufferedReader != null){
                bufferedReader.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void receiveMessageFromClient(VBox vbox) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (socket.isConnected()){
                    String messageFromCLient = null;
                    try {

                        messageFromCLient = bufferedReader.readLine();
                        Main main = new Main();
                        main.addLabel(messageFromCLient,vbox);
                    } catch (IOException e) {
                        e.printStackTrace();
                        close(serverSocket,socket,bufferedWriter,bufferedReader);

                    }

                }
            }
        }).start();
    }

    public void sendMessageToClient(String message){
        try {
            bufferedWriter.write(message);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
           e.printStackTrace();
            close(serverSocket,socket,bufferedWriter,bufferedReader);
        }


    }
}
