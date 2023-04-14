package Resources.Fonts;

import java.awt.Font;

public class Fonts {
    public static final String DEFAULT = "04B_03__.TTF";
    public static final String SPY = "5mikropix.ttf";

    public static Font loadFont(String name, float fontSize) {
        Font font;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, Fonts.class.getResourceAsStream(name));
        } catch (Exception e) {
            font = Font.getFont(Font.SERIF);
        }
        return font.deriveFont(fontSize);
    }
}
