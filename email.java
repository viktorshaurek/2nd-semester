import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class LaunchMailClient {

    public static void main(String[] args) {
        // Recipient's email address
        String recipient = "recipient@example.com";
        
        // Subject of the email
        String subject = "Subject of the email";
        
        // Body of the email
        String body = "Body of the email";
        
        // Construct the mailto URI
        String uriStr = String.format("mailto:%s?subject=%s&body=%s",
                recipient, subject, body);
        
        try {
            // Create a URI object
            URI uri = new URI(uriStr);
            
            // Check if Desktop is supported
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                
                // Launch the default mail client with the mailto URI
                desktop.mail(uri);
            } else {
                System.out.println("Desktop not supported.");
            }
        } catch (URISyntaxException | IOException e) {
            System.out.println("Error launching mail client: " + e.getMessage());
        }
    }
}
