import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class CreateFile{
    public static void main(String[] args) {
        Path path = Paths.get("path/to/directory/uniqueFile_TIMESTAMP.txt");
        String content = "UACS";
        try {
            Files.write(path, content.getBytes(StandardCharSets.UTF_8));
            System.out.println("File created successfully.");
            }catch(IOException e){
                e.printStackTrace();
            }
        
    }
}
