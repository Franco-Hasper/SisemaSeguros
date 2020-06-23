package calsesPadre;

import java.awt.Frame;

/**
 * @author Hasper Franco
 */
public abstract class InterfazGraficaFormularioEditar extends ItemsBox {

    /**
     * Crea una nueva instancia de la clase Frame para pasarle como parametro al
     * nuevo formulario generado.
     */
    protected Frame frame = new Frame();

    /**
     * Crea una nueva instancia de un formulario editar y lo hace visible.
     */
    public abstract void nuevoFormularioEditar();

    /**
     * Añade los textos de fondo al formulario editar.
     */
    protected abstract void infoTextPrompt();

    /**
     * Proporciona al formulario editar el color equvalente al utilizado en la
     * ventana principal.
     */
    public abstract void colorTema();

    /**
     * Transfiere los datos de la fila seleccionada en la tabla del escritorio
     * al formulario editar.
     */
    public abstract void transferirDatos();

}
