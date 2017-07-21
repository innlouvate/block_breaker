package application;

import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;

public class BlockBreakerPanel extends JPanel {
    ArrayList<Block> blocks = new ArrayList<Block>();

    BlockBreakerPanel() {
        for(int i = 0; i<8; i++) {
            blocks.add(new Block((i*60+2), 0, 60, 25, "./images/blue.png"));
        }
        for(int i = 0; i<8; i++) {
            blocks.add(new Block((i*60+2), 25, 60, 25, "./images/red.png"));
        }
        for(int i = 0; i<8; i++) {
            blocks.add(new Block((i*60+2), 50, 60, 25, "./images/green.png"));
        }
        for(int i = 0; i<8; i++) {
            blocks.add(new Block((i*60+2), 75, 60, 25, "./images/yellow.png"));
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        for(Block b: blocks)
            b.draw(g, this);

    }
}
