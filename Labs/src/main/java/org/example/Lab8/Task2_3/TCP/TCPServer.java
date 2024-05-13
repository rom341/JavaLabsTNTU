package org.example.Lab8.Task2_3.TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class TCPServer {
    final static Logger LOGGER = Logger.getLogger(TCPServer.class.getName());

    public static void main(String[] args) {
        LOGGER.info("SERVER STARTED");
        try (ServerSocket serverSocket = new ServerSocket(9999)){
            while (true){
                Socket socket = serverSocket.accept();
                LOGGER.info("Income connection from " + socket.getRemoteSocketAddress());

                Runnable connectionHandler = new ThreadedEchoHandler(socket);
                Thread thread = new Thread(connectionHandler);
                thread.start();
            }
        }catch (IOException ioe){
            LOGGER.warning("Cannot connect: " + ioe.getMessage());
        }
    }
}
