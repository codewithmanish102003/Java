
import java.net.MalformedURLException;
import java.net.URL;

public class URLExample {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL("https://www.example.com:8080/docs/resource1?name=abc");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
        } catch (MalformedURLException e) {
            System.out.println(e);
        }
    }
}
 