
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiClientServer {

    public static void main(String[] args) throws IOException {
        //Step1:Creating serverSocket that listens on port 5000
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server is listening on Port 5000...");

        //step2:continutionally accept client connections
        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("New Client Connected");

            //step3.create a new thread to handle the client
            ClientHandler clientHandler = new ClientHandler(clientSocket);
            new Thread(clientHandler).start();
        }

    }
}


class  ClientHandler implements Runnable{
    
}