package dialogos;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

/**
 *
 * @author maryse
 */
public class Marco extends Frame {

    public void paint(Graphics g) {
        Font letrero = new Font("Courier", Font.BOLD, 12);
        g.setFont(letrero);
        g.drawString("Bienvenid0 ai AWT", 24, 70);
        System.out.println("Programa Marco");
    }
}
