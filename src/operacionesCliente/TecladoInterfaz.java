package operacionesCliente;

import java.awt.event.KeyEvent;
import javax.swing.JComponent;

/**
 * @author Hasper Franco
 */
public class TecladoInterfaz {

    public void desplazar(KeyEvent evt, JComponent arriba, JComponent abajo) {
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_DOWN:
                abajo.grabFocus();
                break;
            case KeyEvent.VK_UP:
                arriba.grabFocus();
                break;
            case KeyEvent.VK_ENTER:
                abajo.grabFocus();
        }
    }

    public void desplazarBox(KeyEvent evt, JComponent abajo) {
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                abajo.grabFocus();
        }
    }

    public void desplazarBtn(KeyEvent evt, JComponent arriba, JComponent derecha, JComponent abajo, JComponent izquierda) {
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_DOWN:
                abajo.grabFocus();
                break;
            case KeyEvent.VK_LEFT:
                izquierda.grabFocus();
                break;
            case KeyEvent.VK_RIGHT:
                derecha.grabFocus();
                break;
            case KeyEvent.VK_UP:
                arriba.grabFocus();
                break;
            case KeyEvent.VK_ENTER:
                abajo.grabFocus();
        }
    }

}
