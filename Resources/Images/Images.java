package Resources.Images;

import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import java.io.IOException;

public class Images {
    public static BufferedImage loadImage(String name) {
        BufferedImage image;
        URL imageURL = Images.class.getResource(name);
        if (imageURL != null) {
            try {
                image = ImageIO.read(imageURL);
            } catch (IOException e) {
                image = new BufferedImage(500,500, BufferedImage.TYPE_INT_ARGB);
                System.out.println("Failed to load via ImageIO");
            }
        } else {
            image = new BufferedImage(500,500,BufferedImage.TYPE_INT_ARGB);
            System.out.println("Failed to find image");
        }
        return image;
    }
}
