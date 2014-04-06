package tema9.applet;

import java.awt.*;
import java.applet.*;

public class Tema9Applet extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawOval(100, 0, 150, 50);
        g.drawString(
                "Hello! My name is Taz!", 110, 25);
    }

}
