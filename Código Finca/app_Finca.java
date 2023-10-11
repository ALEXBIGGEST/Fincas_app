import javax.swing.JOptionPane;

public class App_Finca{
    static cls_Finca [] fincas = new cls_Finca[100];

    static int int_posiciones = 0;

    public static void main(String[] args){
        fnt_menu(true);
    }
    private static void fnt_registrar(){
        String nombre = JOptionPane.showInputDialog(null, "Nombre de la finca");
        String codigo = JOptionPane.showInputDialog(null, "Codigo de la finca");
        String extension = JOptionPane.showInputDialog(null, "Extención de la finca");
        String propietario = JOptionPane.showInputDialog(null, "Dueño de la finca");
        String direccion = JOptionPane.showInputDialog(null, "Dirección de la finca");
        String ubicacion = JOptionPane.showInputDialog(null, "Ubicación de la finca");
        float produccion = Float.parseFloat(JOptionPane.showInputDialog(null, "Producción de la finca"));
        String actividad = JOptionPane.showInputDialog(null, "Actividad económica de la finca");

        Fincas[int_posiciones] = new cls_Fincas
    }

    

}