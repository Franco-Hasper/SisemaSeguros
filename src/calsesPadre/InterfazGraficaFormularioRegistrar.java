package calsesPadre;

import java.awt.Frame;

/**
 * @author Hasper Franco
 */
public abstract class InterfazGraficaFormularioRegistrar extends ItemsBox {

    /**
     * Crea una nueva instancia de la clase Frame para pasarle como parametro al
     * nuevo formulario generado.
     */
    protected Frame frame = new Frame();

    /**
     * Crea una nueva instancia de un formulario registrar y lo hace visible.
     */
    public abstract void nuevoFormularioRegistrar();

    /**
     * Añade los textos de fondo al formulario registrar.
     */
    protected abstract void infoTextPrompt();

    /**
     * Proporciona al formulario registrar el color equvalente al utilizado en
     * la ventana principal.
     */
    public abstract void colorTema();

}
