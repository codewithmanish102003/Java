
import java.io.*;
import java.net.*;

public class URLConnectionExample {

    public static void main(String[] args) {
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL("http://www.example.com");
            HttpURLConnection connection = (HttpURLConnection) (URLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            if (responseCode == 200) {
                try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        System.out.println(inputLine);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
