import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenTextFile {

    public static void main(String[] args) {
    String filePath = "path/to/your/text/file.txt";
    File file = new File(filePath);
        
        try { if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (file.exists()) {
                   
                    desktop.open(file);
                } else {
                    System.out.println("File does not exist: " + filePath);
                }
            } else {
                System.out.println("Desktop not supported.");
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
    }
}
