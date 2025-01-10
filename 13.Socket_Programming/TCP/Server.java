import java.io.*;
import java.net.*;

//Server Side Example

public class Server {

    public static void main(String[] args) throws IOException {

        try ( //create a server socket
                ServerSocket serversocket = new ServerSocket(5000)) {
            System.out.println("Server is running for client");
            
            try ( //wait for incoming connection
                    Socket socket = serversocket.accept()) {
                System.out.println("Client Connected");
                
                PrintWriter out;
                try ( //input-output Streams
                        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                    out = new PrintWriter(socket.getOutputStream(),true);
                    //Read data from client
                    String clientMsg=in.readLine();
                    System.out.println("Client Says : "+clientMsg);
                    //Response to the client
                    out.println("Hello from the server");
                    //Close the Connections
                }
                out.close();
            }
        }
        
    }
}
