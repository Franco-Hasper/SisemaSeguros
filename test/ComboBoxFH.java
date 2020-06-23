
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JComboBox;

/**
 * @author Hasper Franco
 */
public class ComboBoxFH extends JComboBox{

    public ComboBoxFH() {
        this.setBorder(null);
        
        this.setOpaque(true);
        this.setFont(new Font("tahoma",Font.BOLD,14));
        this.setBackground(Color.red);
        this.setForeground(Color.white);
        this.setPreferredSize(new Dimension(200,400));
        this.setSize(200,400);
        this.setCursor(new Cursor(12));
    }
}
