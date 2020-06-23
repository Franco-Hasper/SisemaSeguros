package operacionesConfiguracion;

import java.awt.Color;

/**
 *
 * @author Hasper Franco
 */
public class ColorTema {

    private Integer principalBlue;
    private Integer principalRed;
    private Integer principalGreen;
    private Integer secundarioRed;
    private Integer secundarioGreen;
    private Integer secundarioBlue;
    private Color colorPrimario;
    private Color colorSecundario;

    /**
     * Retorna uno de los 3 valores necesarios para generar un color en base a
     * RGB, en este caso Blue para Color Primario.
     *
     * @return
     */
    public Integer getPrincipalBlue() {
        return principalBlue;
    }

    /**
     * Permite guardar uno de los 3 valores necesarios para generar un color en
     * base a RGB, en este caso Blue para Color Primario.
     *
     * @param principalBlue
     */
    public void setPrincipalBlue(Integer principalBlue) {
        this.principalBlue = principalBlue;
    }

    /**
     * * Retorna uno de los 3 valores necesarios para generar un color en base
     * a RGB, en este caso Red para Color Primario.
     *
     * @return
     */
    public Integer getPrincipalRed() {
        return principalRed;
    }

    /**
     * Permite guardar uno de los 3 valores necesarios para generar un color en
     * base a RGB, en este caso Red para Color Primario.
     *
     * @param principalRed
     */
    public void setPrincipalRed(Integer principalRed) {
        this.principalRed = principalRed;
    }

    /**
     * * Retorna uno de los 3 valores necesarios para generar un color en base
     * a RGB, en este caso Green para Color Primario.
     *
     * @return
     */
    public Integer getPrincipalGreen() {
        return principalGreen;
    }

    /**
     * Permite gaurdar uno de los 3 valores necesarios para generar un color en
     * base a RGB, en este caso Green para Color Primario.
     *
     * @param principalGreen
     */
    public void setPrincipalGreen(Integer principalGreen) {
        this.principalGreen = principalGreen;
    }

    /**
     * Retorna uno de los 3 valores necesarios para generar un color en base a
     * RGB, en este caso Red para Color Secundario.
     *
     * @return
     */
    public Integer getSecundarioRed() {
        return secundarioRed;
    }

    /**
     * Permite guardar uno de los 3 valores necesarios para generar un color en
     * base a RGB, en este caso Red para Color Secundario.
     *
     * @param secundarioRed
     */
    public void setSecundarioRed(Integer secundarioRed) {
        this.secundarioRed = secundarioRed;
    }

    /**
     * Retorna uno de los 3 valores necesarios para generar un color en base a
     * RGB, en este caso Green para Color Secundario.
     *
     * @return
     */
    public Integer getSecundarioGreen() {
        return secundarioGreen;
    }

    /**
     * Permite guardar uno de los 3 valores necesarios para generar un color en
     * base a RGB, en este caso Green para Color Secundario.
     *
     * @param secundarioGreen
     */
    public void setSecundarioGreen(Integer secundarioGreen) {
        this.secundarioGreen = secundarioGreen;
    }

    /**
     * Retorna uno de los 3 valores necesarios para generar un color en base a
     * RGB, en este caso Blue para Color Secundario.
     *
     * @return
     */
    public Integer getSecundarioBlue() {
        return secundarioBlue;
    }

    /**
     * permite guardar uno de los 3 valores necesarios para generar un color en
     * base a RGB, en este caso Blue para Color Secundario.
     *
     * @param secundarioBlue
     */

    public void setSecundarioBlue(Integer secundarioBlue) {
        this.secundarioBlue = secundarioBlue;
    }

    /**
     * Retorna un objeto de la clase Color con un valor definido en base a RGB
     * el cual se implementa para dar una estetica personalizada a la interfaz
     * grafica, ene ste caso es el color principal.
     *
     * @return
     */
    public Color getColorPrimario() {
        return colorPrimario;
    }

    /**
     * Crea una instancia de la clase Color con un valor definido en base a RGB
     * el cual se implementa para dar una estetica personalizada a la interfaz
     * grafica, ene ste caso es el color principal.
     *
     * @param colorPrimario
     */
    public void setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    /**
     * Retorna un objeto de la clase Color con un valor definido en base a RGB
     * el cual se implementa para dar una estetica personalizada a la interfaz
     * grafica, ene ste caso es el color secundario.
     *
     * @return
     */
    public Color getColorSecundario() {
        return colorSecundario;
    }

    /**
     * crea una instancia de la clase Color con un valor definido en base a RGB
     * el cual se implementa para dar una estetica personalizada a la interfaz
     * grafica, ene ste caso es el color secundario.
     *
     * @param colorSecundario
     */
    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

}
