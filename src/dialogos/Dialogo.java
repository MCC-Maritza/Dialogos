package dialogos;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Graphics;

/**
 *
 * @author maryse
 */
class Dialogo extends Dialog {

    Dialogo(Frame ventana, String titulo, boolean modo) {
        super(ventana, titulo, modo);
    }

    public void paint(Graphics g) {

        if (super.isModal()) {
            System.out.println("Ejemplo de Graphics");
            g.drawString("Ciérreme para poder acceder" + "a otras ventanas", 10, 40);
        } else {
            g.drawString("Desde este cuadro puede acceder" + "a otras Ventanas", 10, 40);
        }
    }
}
