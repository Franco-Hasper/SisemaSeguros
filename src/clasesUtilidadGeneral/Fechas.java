package clasesUtilidadGeneral;

import ds.desktop.notify.DesktopNotify;
import entidades.Vencimiento;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;

/**
 * @author Hasper Franco
 */
public class Fechas {

    private long dias;
    private String casonegativo;

    public long getDias() {
        return dias;
    }

    public void setDias(long dias) {
        this.dias = dias;
    }

    public String getCasonegativo() {
        return casonegativo;
    }

    public void setCasonegativo(String casonegativo) {
        this.casonegativo = casonegativo;
    }

    /**
     * sumar x dias a la fecha pasada como parametro
     *
     * @param fecha
     * @param dias
     * @return
     */
    public Date sumarRestarDias(Date fecha, int dias) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        return calendar.getTime();
    }

    /**
     * sumar x meses a la fecha pasada como parametro
     *
     * @param fecha
     * @param meses
     * @return
     */
    public Date sumarRestarMeses(Date fecha, int meses) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.MONTH, meses);
        return calendar.getTime();
    }

    /**
     * sumar x años a la fecha pasada como parametro
     *
     * @param fecha
     * @param años
     * @return
     */
    public Date sumarRestarAños(Date fecha, int años) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.YEAR, años);
        return calendar.getTime();
    }

    /**
     * convierte una fecha Date a una lista de 3 indices con año,mes y dia
     * respectivamente
     *
     * @param fechaVencimiento
     * @return
     */
    public List<Integer> dateToListInteger(Date fechaVencimiento) {
        //crear formato a la fecha
        DateFormat fechaFormat = new SimpleDateFormat("yyyy-MM-dd");
        //formatear el Date y pasarlo a string
        String fechaDateFormatString = fechaFormat.format(fechaVencimiento);
        //crear un arreglo con 3 indices separando año[0] mes[1] dia[2]
        String[] fechaDateFormatStringSplit = fechaDateFormatString.split("-");
        //pasar los 3 secciones a Integer para poder sumarle 
        Integer yearInt = Integer.valueOf(fechaDateFormatStringSplit[0]);
        Integer monthInt = Integer.valueOf(fechaDateFormatStringSplit[1]);
        Integer dayInt = Integer.valueOf(fechaDateFormatStringSplit[2]);

        //crear Lista integer
        List<Integer> fechaDateFormatIntegerSplit = new ArrayList();

        fechaDateFormatIntegerSplit.add(yearInt);
        fechaDateFormatIntegerSplit.add(monthInt);
        fechaDateFormatIntegerSplit.add(dayInt);

        return fechaDateFormatIntegerSplit;
    }

    /**
     * compara fecha actual con otra , devuelve true si la segunda tiene 1 mes
     * menos que la actual, si es enero tambien compara el año, tambien devuelve
     * true si ambos mese coinciden...el parametro valor=-1 indica si se quiere
     * saber si es mes anterior y 0 si se quiere saber si ambos meses coinciden
     *
     * @param fecha
     */
    public boolean mesAntesOmesActual(Date fecha, Integer valor) {

        Date fechaActual = new Date();
        Calendar calendarActual = Calendar.getInstance();
        calendarActual.setTime(fechaActual);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);

        // Integer diferenceDays;
        Integer diferenceMonth;
        Integer diferenceYear;

        Integer actualDay = calendarActual.get(Calendar.DAY_OF_MONTH);
        Integer compareDay = calendar.get(Calendar.DAY_OF_MONTH);

        Integer actualMonth = calendarActual.get(Calendar.MONTH);
        Integer compareMonth = calendar.get(Calendar.MONTH);

        Integer actualYear = calendarActual.get(Calendar.YEAR);
        Integer compareYear = calendar.get(Calendar.YEAR);

        //    diferenceDays = compareDay - actualDay;
        diferenceMonth = compareMonth - actualMonth;
        diferenceYear = compareYear - actualYear;

        switch (valor) {
            case -1:
                return mesAnterior(diferenceMonth, actualMonth, diferenceYear, compareMonth);
            case 0:
                return mesActual(diferenceMonth, diferenceYear);
        }
        System.out.println("si se llega este punto es que el valor pasado como parametro no es -1 ni 0, revisar la implementacion del metodo");
        return false;
    }

    /**
     * retorna true si el mes es anterior alactual
     */
    public boolean mesAnterior(Integer diferenceMonth, Integer actualMonth, Integer diferenceYear, Integer compareMonth) {
        if (diferenceMonth.equals(-1) && diferenceYear.equals(0)) {
            return true;
        } else if (actualMonth.equals(0) && diferenceYear.equals(-1) && compareMonth.equals(11)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * retorna true si el mes es anterior alactual
     */
    public boolean mesActual(Integer diferenceMonth, Integer diferenceYear) {
        if (diferenceMonth.equals(0) && diferenceYear.equals(0)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Dados los dias,mes y año pasados como parametro,los resta de la fecha
     * actual y devuelve la diferencia en dias.
     *
     * @param dia necesario;
     * @param mes necesario;
     * @param año necesario;
     * @return diferecia de dias;
     *
     */
    public void diasRestantes(List<Integer> arregloInteger) {
        Integer yearInt = arregloInteger.get(0);
        Integer monthInt = arregloInteger.get(1);
        Integer dayInt = arregloInteger.get(2);

        Calendar inicio = Calendar.getInstance();
        inicio.set(yearInt, monthInt - 1, dayInt);
        inicio.set(Calendar.HOUR, 0);
        inicio.set(Calendar.HOUR_OF_DAY, 0);
        inicio.set(Calendar.MINUTE, 0);
        inicio.set(Calendar.SECOND, 0);

        Calendar actual = Calendar.getInstance();

        actual.set(Calendar.HOUR, 0);
        actual.set(Calendar.HOUR_OF_DAY, 0);
        actual.set(Calendar.MINUTE, 0);
        actual.set(Calendar.SECOND, 0);

        long finMs = actual.getTimeInMillis();
        long inicioMs = inicio.getTimeInMillis();

        long dias = ((Math.abs(finMs - inicioMs)) / (86400000)); //(1000 * 60 * 60 * 24));

        //para evitar que sea numero negativo si se paso de la fecha haremos que sea 0
        if (inicio.compareTo(actual) == -1) {
            this.setCasonegativo("");
            this.setDias(0);
        } else {
            this.setCasonegativo("");
            this.setDias(dias);
        }
    }
    
    /**
     * evalua el estado de la cuota actual de la lista y envia una ntificacion
     * si el estado es "pendiente y los dias restantes =0"
     *
     */

    //SI MUeSTRA HOY VENCE LA CUOTA y la feha ya paso VER EL TEMA DE DIAS RESTANTES
    public void notificarFechaVencimientoLista(List lista) {

        Integer numDiasRestantes;
        String diasRestantes;
        String estadoActual;
        String cliente;
        String nroPoliza;
        Fechas fecha = new Fechas();
        for (Object o : lista) {
            try {
                Vencimiento v = (Vencimiento) o;
            
                if (v.getPolizaId().getClienteId().getEstadoId().getId().equals(1)) {
                    fecha.diasRestantes(fecha.dateToListInteger(v.getFechaVencimieto()));
                    diasRestantes = fecha.getCasonegativo() + fecha.getDias();
                    estadoActual = (v.getEstadoId().getValor());
                    if (diasRestantes.equals("sin registros")) {
                    } else {
                        numDiasRestantes = Integer.valueOf(diasRestantes);
                        if (numDiasRestantes < 6 && numDiasRestantes > 0 && estadoActual.equals("pendiente")) {
                            cliente = v.getPolizaId().getClienteId().getNombre() + " " + v.getPolizaId().getClienteId().getApellido();
                            nroPoliza = v.getPolizaId().getNumero();
                            DesktopNotify.showDesktopMessage("      Alerta de vencimiento", diasRestantes + " dias restantes para realizar el pago" + "\nCliente: " + cliente + "\nNro Poliza: " + nroPoliza, DesktopNotify.INFORMATION);
                        } else if (numDiasRestantes == 0 && estadoActual.equals("pendiente")) {
                            cliente = v.getPolizaId().getClienteId().getNombre() + " " + v.getPolizaId().getClienteId().getApellido();
                            nroPoliza = v.getPolizaId().getNumero();
                            DesktopNotify.showDesktopMessage("      Alerta de vencimiento", "Hoy vence la cuota de " + "\nCliente: " + cliente + "\nNro Poliza: " + nroPoliza, DesktopNotify.WARNING);
                        }
                    }
                }

            } catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
            }
        }
    }

}

//    public void notificarFechaVencimiento(JTable tabla) {
//        Integer numDiasRestantes;
//        String diasRestantes;
//        String estadoActual;
//        for (int i = 0; i < tabla.getRowCount(); i++) {
//            try {
//                diasRestantes = tabla.getValueAt(i, 10).toString();
//                estadoActual = (tabla.getValueAt(i, 8).toString());
//                if (diasRestantes.equals("sin registros")) {
//                } else {
//                    numDiasRestantes = Integer.valueOf(diasRestantes);
//                    if (numDiasRestantes < 6 && numDiasRestantes > 0 && estadoActual.equals("pendiente")) {
//                        String cliente = tabla.getValueAt(i, 0).toString() + " " + tabla.getValueAt(i, 1).toString();
//                        String nroPoliza = tabla.getValueAt(i, 4).toString();
//                        DesktopNotify.showDesktopMessage("      Alerta de vencimiento", diasRestantes + " dias restantes para realizar el pago" + "\nCliente: " + cliente + "\nNro Poliza: " + nroPoliza, DesktopNotify.INFORMATION);
//                    } else if (numDiasRestantes == 0 && estadoActual.equals("pendiente")) {
//                        String cliente = tabla.getValueAt(i, 0).toString() + " " + tabla.getValueAt(i, 1).toString();
//                        String nroPoliza = tabla.getValueAt(i, 4).toString();
//                        DesktopNotify.showDesktopMessage("      Alerta de vencimiento", "Hoy vence la cuota de " + "\nCliente: " + cliente + "\nNro Poliza: " + nroPoliza, DesktopNotify.WARNING);
//                    }
//                }
//
//            } catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
//            }
//        }
//
//    }