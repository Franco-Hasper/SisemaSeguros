package lanzarAplicacion;

import clasesUtilidadGeneral.ComandosCmd;
import operacionesConfiguracion.ConfiguracionTxt;
import principal.PrincipalAdministrador;

/**
 *
 * @author TELCOM MPC
 */
public class InterfazGraficaPrincipal {

    public static void main(String[] args) {
        new InicarAplicacion().run();
    }

    public static class InicarAplicacion implements Runnable {

        @Override
        public void run() {
            
//            ComandosCmd comando=new ComandosCmd();
//            comando.iniciarApacheMySqlPhp();

            exceptionNativa();
            PrincipalAdministrador principalAdministrador = new PrincipalAdministrador();

            principalAdministrador.setVisible(true);

            ConfiguracionTxt configuracion = new ConfiguracionTxt();
            configuracion.leerArchivoConfig();
            configuracion.setPrincipalAdministrador(principalAdministrador);
            configuracion.setTema();
        }

        private void exceptionNativa() {
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }

    }

}
