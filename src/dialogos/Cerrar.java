package dialogos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author maryse
 */
public class Cerrar extends WindowAdapter {

    Dialogo otroDialogo;

    Cerrar(Dialogo unDialogo) {

        otroDialogo = unDialogo;
    }

    Cerrar() {
        otroDialogo = null;
    }

    public void windowclosing(WindowEvent evt) {

        if (otroDialogo != null) {
            otroDialogo.dispose();
            System.out.println("Programa");
        } else {
            System.exit(0);
        }
    }
}
