
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class View {

    Avion avion = new Avion();

    public void generate() {

        int key = 0;
        int cedula = 0;
        String nombre = "";

        Pasajero pasajero = null;

        do {
            try {
                key = Integer.parseInt(JOptionPane.showInputDialog(
                        "\n"
                        + "Menu \n\n"
                        + "1. Ingresar Pasajero \n\n"
                        + "2. Ver % de Ocupacion \n\n"
                        + "3. Obtener Sillas Economicas Ocupadas \n"
                        + "4. Obtener Sillas Ejecutivas Ocupadas \n\n"
                        + "5. Desasignar Pasajero \n\n"
                        + "0. Salir \n\n"
                        + "Digite la opcion:"));

                switch (key) {
                    
                    case 1:
                        int num = 0;
                        int puesto = 0;

                        do {
                            try {
                                cedula = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Digite La Cedula del Pasajero"));
                            } catch (NumberFormatException e) {
                                JOptionPane.showConfirmDialog(null, "Por Favor Entre una opcion valida", "naughty", JOptionPane.CANCEL_OPTION);
                            }
                        } while (cedula < 1 || cedula > 1000000000);

                        nombre = JOptionPane.showInputDialog("Digite el Nombre del Pasajero:");

                        pasajero = new Pasajero(cedula, nombre);

                        do {
                            try {
                                num = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Selecctione la Clase. \n"
                                        + "Digite: \n"
                                        + "1. Clase Ejecutiva. \n"
                                        + "2. Clase Economica \n\n"));

                            } catch (NumberFormatException e) {
                                JOptionPane.showConfirmDialog(null, "Por Favor Entre una opcion valida", "naughty", JOptionPane.CANCEL_OPTION);
                            }
                        } while (num < 1 || num > 2);


                        do {
                            try {
                                puesto = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Selecciones el Ubicacion. \n"
                                        + "Digite: \n"
                                        + "1. Ventana \n"
                                        + "2. Centro \n"
                                        + "3. Pasillo \n\n"));
                            } catch (NumberFormatException e) {
                                JOptionPane.showConfirmDialog(null, "Por Favor Entre una opcion valida", "naughty", JOptionPane.CANCEL_OPTION);
                            }
                        } while (num < 1 || num > 3);

                        avion.asignarSilla(num, puesto, pasajero);
                        break;

                    case 2:
                        double d = avion.calcularPorcentajeOcupacion();
                        JOptionPane.showMessageDialog(null, d + " % de Ocupacion");
                        break;

                    case 3:
                        int sieco = avion.contarSillasEconomicasOcupadas();
                        JOptionPane.showMessageDialog(null, sieco + "  Sillas Economicas Ocupadas");
                        break;

                    case 4:
                        int sieje = avion.contarSillasEjecutivasOcupadas();
                        JOptionPane.showMessageDialog(null, sieje + "  Sillas Ejecutivas Ocupadas");
                        break;

                    case 5:
                        do {
                            try {
                                cedula = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Digite La Cedula del Pasajero"));
                            } catch (NumberFormatException e) {
                                JOptionPane.showConfirmDialog(null, "Por Favor Entre una opcion valida", "naughty", JOptionPane.CANCEL_OPTION);
                            }
                        } while (cedula < 1 || cedula > 1000000000);

                        nombre = JOptionPane.showInputDialog("Digite el Nombre del Pasajero:");

                        Pasajero pasajero2 = new Pasajero(cedula, nombre);

                        avion.desasignarSilla(pasajero2);
                        break;

                    case 6:
//                Silla[] sillaseco = avion.obtenerSillasEconomicas();
//                sillaseco.toString();
//                System.out.println( sillaseco  );
                        break;

                    case 15:
                        pasajero = new Pasajero(93390390, "Paola Reyes");
                        avion.asignarSilla(2, 1, pasajero);
                        pasajero = new Pasajero(93390391, "Juliana Bonilla");
                        avion.asignarSilla(2, 2, pasajero);
                        pasajero = new Pasajero(93390392, "Andrea Martinez");
                        avion.asignarSilla(2, 3, pasajero);
                        pasajero = new Pasajero(93390393, "Natalia Hurtado");
                        avion.asignarSilla(2, 1, pasajero);
                        pasajero = new Pasajero(93390394, "Patricia Molina");
                        avion.asignarSilla(2, 2, pasajero);
                        pasajero = new Pasajero(93390395, "Maria Gonzales");
                        avion.asignarSilla(2, 3, pasajero);
                        pasajero = new Pasajero(93390396, "Xiomara Buitrago");
                        avion.asignarSilla(2, 1, pasajero);
                        pasajero = new Pasajero(93390397, "Paula Silva");
                        avion.asignarSilla(2, 2, pasajero);
                        pasajero = new Pasajero(93390398, "Margarita Fernandez");
                        avion.asignarSilla(2, 3, pasajero);
                        pasajero = new Pasajero(93390399, "Sara Ospina");
                        avion.asignarSilla(2, 1, pasajero);
                        break;

                    case 16:
                        pasajero = new Pasajero(93390380, "Paola Reyes");
                        avion.asignarSilla(1, 1, pasajero);
                        pasajero = new Pasajero(93390381, "Juliana Bonilla");
                        avion.asignarSilla(1, 1, pasajero);
                        pasajero = new Pasajero(93390382, "Andrea Martinez");
                        avion.asignarSilla(1, 1, pasajero);
                        pasajero = new Pasajero(93390383, "Natalia Hurtado");
                        avion.asignarSilla(1, 1, pasajero);
                        pasajero = new Pasajero(93390384, "Patricia Molina");
                        avion.asignarSilla(1, 1, pasajero);
                        break;

                    case 0:
                        System.exit(0);
                        break;

                    default:
                        break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showConfirmDialog(null, "Ingreso Una Opcion No Valida", "naughty", JOptionPane.CANCEL_OPTION);
            }
            
        } while (key < 0 || key > 20);


    }
}
