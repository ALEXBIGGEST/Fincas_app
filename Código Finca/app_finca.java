import javax.swing.JOptionPane;

public class app_Finca{
    static cls_registro_finca [] fincas = new cls_registro_finca[100];
    static cls_parcelacion [] parcelas = new cls_parcelacion[100];

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
        fincas[int_posiciones] = new cls_registro_finca(nombre, extension, propietario, direccion, ubicacion, codigo, produccion, actividad);

        }


    public static void fnt_menu(boolean men){
        while(men == true){

            
        }
    }
    

}