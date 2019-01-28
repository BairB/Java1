package Urok7;

import java.awt.*;

public class CatG extends Cat {
    public CatG(String name, int jor) {
        super(name, jor);
    }
    public void paint(Graphics g, int y, int dx, int dy) {
        if(sytost) {
            g.setColor(Color.blue);
            g.fill3DRect(20, y, jor * dx + 1, dy + 1, true);
        }
    }
}
