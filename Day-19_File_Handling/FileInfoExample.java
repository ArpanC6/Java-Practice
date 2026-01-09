import java.io.File;

public class FileInfoExample {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
        } else {
            System.out.println("File does not exist");
        }
    }
}
