import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRaedExample {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        try {
            FileReader fReader=new FileReader("example.txt");
            BufferedReader bReader=new BufferedReader(fReader);
            String line;
            while ((line=bReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
