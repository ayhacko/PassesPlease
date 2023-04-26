package Resources.Images;

import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.*;

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

    public static BufferedImage toBufferedImage(Image image) {
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        Graphics2D g = bufferedImage.createGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();

        return bufferedImage;
    }
}
