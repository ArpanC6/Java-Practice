import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Java File Handling Example");
            writer.close();

            System.out.println("Data written to file");
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}
