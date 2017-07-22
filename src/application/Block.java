package application;

import java.awt.*;

public class Block extends Rectangle {
    Image pic;
    int dx = 3;
    int dy = -3;
    boolean destroyed = false;

    Block(int a, int b, int w, int h, String s) {
        x = a;
        y = b;
        width = w;
        height = h;
        pic = Toolkit.getDefaultToolkit().getImage(s);
    }

    public void draw (Graphics g, Component c) {
        if(!destroyed) {
            g.drawImage(pic, x, y, width, height, c);
        }
    }
}
