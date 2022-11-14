package dialogos;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author maryse
 *
 * GUI --> AWT(Dialogos)
 *
 *
 *
 */
public class Dialogos {

    public static void main(String args[]) {

        Marco elMarco = new Marco();
        elMarco.setTitle("Marco");
        elMarco.setSize(400, 200);
        elMarco.setVisible(true);
        elMarco.addWindowListener(new Cerrar());
        Dialogo dialogoNoModal = new Dialogo(elMarco, "Dialogo no modal", false);
        dialogoNoModal.setBackground(Color.YELLOW);
        dialogoNoModal.getGraphics();
        System.out.println("Se ejecuta el programa");
        
        /* setBounds coloca la esquina superior de:
        diálogo en la posición 100, 100 con respecto a su contenedor y establece 
        su anchura en 300 pixels y su altura en 100 */
        
        dialogoNoModal.setBounds(100, 100, 300, 100);
        dialogoNoModal.addWindowListener(new Cerrar(dialogoNoModal));
        dialogoNoModal.setVisible(true);
        Dialogo dialogoModal = new Dialogo(elMarco, "Dialogo modal", true);
        dialogoModal.setSize(300, 100);
        dialogoModal.addWindowListener(new Cerrar(dialogoModal));
        dialogoModal.setVisible(true);
    }
}
