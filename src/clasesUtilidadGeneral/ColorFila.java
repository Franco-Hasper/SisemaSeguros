package clasesUtilidadGeneral;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import principal.PrincipalAdministrador;

/**
 * @author Hasper Franco
 */
public class ColorFila extends DefaultTableCellRenderer {

    Color foreground;

    public ColorFila(Color foreground) {
        this.foreground = foreground;
    }

    Color rojoClaro = new Color(237, 199, 199);
    Color celesteClaro = new Color(204, 217, 255);
    Color verdeClaro = new Color(219, 255, 230);

    /**
     * Se utiliza para cambiar el color a una fila con el valor dado
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        //la columna con el valor de referencia
        try {
            String valor = table.getValueAt(row, 1).toString();
         
            if (valor.equals("vencido")) {
                setBackground(rojoClaro);
                setForeground(foreground);
            } else if (valor.equals("pendiente")) {
                setBackground(celesteClaro);
                setForeground(foreground);
            } else if (valor.equals("pagado")) {
                setBackground(verdeClaro);
                setForeground(foreground);
            } else {
                setBackground(Color.WHITE);
                setForeground(foreground);

            }

        } catch (NullPointerException e) {
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}

//
// try {
//            String valorAnterior = table.getValueAt(row, 7).toString();
//            String valorActual = table.getValueAt(row, 8).toString();
//            if (valorAnterior.equals("vencido") || valorActual.equals("vencido")) {
//                setBackground(rojoClaro);
//                setForeground(foreground);
//            } else if (valorActual.equals("pendiente")) {
//                setBackground(celesteClaro);
//                setForeground(foreground);
//            } else if (valorActual.equals("pagado")) {
//                setBackground(verdeClaro);
//                setForeground(foreground);
//            } else {
//                setBackground(Color.WHITE);
//                setForeground(foreground);
//
//            }
//
//        } catch (NullPointerException e) {
//        }
