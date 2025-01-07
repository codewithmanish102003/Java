
import java.io.File;
import java.io.IOException;


public class FileExample{
    public static void main(String[] args) {
        File file=new File("example.txt");

        if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println("file created : "+file.getName());
            } catch (IOException e) {
                System.out.println("An Error Occoured : ");
            }
        }else{
            System.out.println("File Already Exists");
        }
    }
}