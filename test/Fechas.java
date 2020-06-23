
import clasesUtilidadGeneral.OperacionesUtiles;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author Hasper Franco
 */
public class Fechas {

    /**
     * toma una variable de tipo Date y la convierte en un arreglo "Integer" con
     * 3 indices separando año[0] mes[1] dia[2] respectivamente.
     *
     * @param fechaDate
     * @return
     */
    public List<Integer> convertirYArreglarDateAInteger(Date fechaDate) {

        //crear formato a la fecha
        DateFormat fechaFormat = new SimpleDateFormat("yyyy-MM-dd");
        //formatear el Date y pasarlo a string
        String fechaDateFormatString = fechaFormat.format(fechaDate);
        //crear un arreglo con 3 indices separando año[0] mes[1] dia[2]
        String[] fechaDateFormatStringSplit = fechaDateFormatString.split("-");

        //pasar los 3 secciones a Integer para poder sumarle 
        Integer yearInt = Integer.valueOf(fechaDateFormatStringSplit[0]);
        Integer monthInt = Integer.valueOf(fechaDateFormatStringSplit[1]);
        Integer dayInt = Integer.valueOf(fechaDateFormatStringSplit[2]);

        List<Integer> arregloInteger = new ArrayList();
        arregloInteger.add(yearInt);
        arregloInteger.add(monthInt);
        arregloInteger.add(dayInt);

        return arregloInteger;

    }

    /**
     * retorna false si la fecha es mayor a 28, true si la fecha es 28 o menor.
     *
     * @param dia
     * @return
     */
    public boolean dia28oMenor(Integer dia) {

        //con este if hago que el dia de la fecha seleccionada sea entre el 0 y el 28
        if (dia > 28) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * si el mes recibido es 12 retorna mes 1 y año siguiente en el arreglo.
     *
     * @param arregloFecha
     * @return
     */
    public List<Integer> cambiarDeYearSielMesEs12(List<Integer> arregloFecha) {
        if (arregloFecha.get(1).equals(12)) {
            arregloFecha.set(0, arregloFecha.get(0) + 1);
            arregloFecha.set(1, 01);
        }

        return arregloFecha;
    }

    public List<Integer> sumarUnMesAFecha(List<Integer> arregloFecha) {
        arregloFecha.set(1, arregloFecha.get(1) + 1);
        return arregloFecha;
    }

//    public Date convertirArrayIntegerADate(List<Integer> arregloFecha){
//        
//        
//        
//        
//    }
    /*----------------SECCION DE PRUEBA CALENDAR*/
    public Date sumarRestarDias(Date fecha, int dias) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        return calendar.getTime();
    }

    public Date sumarRestarMeses(Date fecha, int meses) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.MONTH, meses);
        return calendar.getTime();
    }

    public Date sumarRestarAños(Date fecha, int años) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.YEAR, años);
        return calendar.getTime();
    }

    public static void main(String[] args) {
        Fechas fecha = new Fechas();
        /*---------SECCION CALENDAR-------*/

        //fecha.sumarMeses();

        /*-------------**/
//        //fecha actual
//        Date fechaActual = new Date();
//        //prueba cambiar de mes y año
//        List<Integer> arregloInteger = fecha.cambiarDeYearSielMesEs12(fecha.convertirYArreglarDateAInteger(fechaActual));
//        System.out.println(arregloInteger);
//        //prueba saber si dia es 28 o menor retornara true, si es mayor retornara false.
//        Integer dia = fecha.convertirYArreglarDateAInteger(fechaActual).get(2);
//        boolean resultado = fecha.dia28oMenor(dia);
//        System.out.println(resultado);
    }

}
