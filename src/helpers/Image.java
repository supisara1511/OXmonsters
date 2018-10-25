
package helpers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import Database.UserDao;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Base64;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import Class.User;
import org.apache.commons.io.FileUtils;

public class Image {
    
    
    public static String fileToBase64StringConversion(String file) throws IOException {
        // load file from /src/test/resources
        File inputFile = new File(file);
 
        byte[] fileContent = FileUtils.readFileToByteArray(inputFile);
        String encodedString = Base64.getEncoder().encodeToString(fileContent);
        
        return encodedString;
    } 
    
    public static BufferedImage getImage(User user){
        try {
            
            byte[] imageBytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(user.getPicture());
            BufferedImage img = ImageIO.read(new ByteArrayInputStream(imageBytes));
            return img;
        } catch (IOException ex) {
            return null;
        }
    }
}
