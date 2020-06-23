package clasesUtilidadGeneral;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * @author Hasper Franco
 */
public class ComandosCmd {

    class Comando implements Runnable {

        public Comando(InputStream istrm, OutputStream ostrm) {
            istrm_ = istrm;
            ostrm_ = ostrm;
        }

        public void run() {
            try {
                final byte[] buffer = new byte[1024];
                for (int length = 0; (length = istrm_.read(buffer)) != -1;) {
                    ostrm_.write(buffer, 0, length);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        private final OutputStream ostrm_;
        private final InputStream istrm_;
    }


    /**
     * Inica el servidor local de apache y todos sus servicios
     */
    public void iniciarApacheMySqlPhp() {
        try {
            String[] command = {"cmd",};
            Process p = Runtime.getRuntime().exec(command);
            new Thread(new Comando(p.getErrorStream(), System.err)).start();
            new Thread(new Comando(p.getInputStream(), System.out)).start();
            PrintWriter stdin = new PrintWriter(p.getOutputStream());
            stdin.println("cd C:\\wamp");
            stdin.println("wampmanager.exe");
            stdin.close();
            int returnCode = p.waitFor();
        } catch (InterruptedException ie) {
        } catch (IOException io) {
        }

    }

    /**
     * cierra el servidor local de apache
     */
    public void cerrarApacheMySqlPhp() {
        try {
            String[] command = {"cmd",};
            Process p = Runtime.getRuntime().exec(command);
            new Thread(new Comando(p.getErrorStream(), System.err)).start();
            new Thread(new Comando(p.getInputStream(), System.out)).start();
            PrintWriter stdin = new PrintWriter(p.getOutputStream());
            stdin.println("cd C:\\Windows\\system32");           
            stdin.println("TASKKILL/PID wampmanager.exe");
            stdin.close();
            int returnCode = p.waitFor();
        } catch (InterruptedException ie) {
        } catch (IOException io) {
        }

    }

}
