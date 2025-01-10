
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;



public class Client {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost",5000)) {
            PrintWriter out;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                out = new PrintWriter(socket.getOutputStream(), true);
                out.println("Hello From the Client");
                String serverMsg=in.readLine();
                System.out.println("Server : "+serverMsg);
            }
            out.close();
        }
    }
}
