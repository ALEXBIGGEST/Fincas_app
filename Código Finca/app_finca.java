import javax.swing.JOptionPane;

public class app_finca{
    static cls_registro_finca [] fincas = new cls_registro_finca[100];
    static cls_parcelacion [] parcelas = new cls_parcelacion[100];
    static cls_reporte [] reporte = new cls_reporte[100];

    static int int_posiciones = 0;

    public static void main(String[] args){
        fnt_menu(true);
    }
    public static void fnt_registrar(){
        String nombre = JOptionPane.showInputDialog(null, "Nombre de la finca");
        String codigo = JOptionPane.showInputDialog(null, "Codigo de la finca");
        String extension = JOptionPane.showInputDialog(null, "Extención de la finca");
        String propietario = JOptionPane.showInputDialog(null, "Dueño de la finca");
        String direccion = JOptionPane.showInputDialog(null, "Dirección de la finca");
        String ubicacion = JOptionPane.showInputDialog(null, "Ubicación de la finca");
        String produccion = JOptionPane.showInputDialog(null, "Producción de la finca");
        String actividad = JOptionPane.showInputDialog(null, "Actividad económica de la finca");
        fincas[int_posiciones] = new cls_registro_finca(nombre, extension, propietario, direccion, ubicacion, codigo, produccion, actividad);
        int_posiciones ++;

        }


    public static void fnt_menu(boolean men){
        while(men == true){

            int m = Integer.parseInt(JOptionPane.showInputDialog(null, "<<<MENU PRINCIPAL >>>\n" +
            "1. Registrar finca\n"+
            "2. Consultar finca\n"+
            "3. Actualizar finca\n"+
            "4. Salir\n"));
            fnt_selector(m);
            
        }
    }
    

    public static void fnt_consultar(String codigo){
        boolean bln_sw = false;
        int int_pos = 0;
        for (int i = 0; i < int_posiciones; i++){
            if (codigo.equals(fincas[i].getCodigo())){
                bln_sw = true;
                int_pos = i;
                break;
            }
        }
        if (bln_sw == false) {
            JOptionPane.showMessageDialog(null, "No se encontraron registros");
        }else{
            JOptionPane.showMessageDialog(null, "Nombre: " + 
           fincas[int_pos].getNombre() +"\n" +  "Codigo: " + fincas[int_pos].getCodigo() + "\n" + 
           "Extension: " + fincas[int_pos].getExtension() + "\n" + "Propietario: " + fincas[int_pos].getPropietario() + "\n" + 
           "Dirección: " + fincas[int_pos].getDireccion() + "\n" + "Ubicación: " + fincas[int_pos].getUbicacion() + "\n" + 
           "Producción: " + fincas[int_pos].getProduccion() + "\n" + "Actividad: " + fincas[int_pos].getActividad());

        }
    }

    
    private static    void fnt_actualizar(String codigo){
        boolean bln_sw = false;
        int int_pos = 0;
        for(int i=0; i < int_posiciones; i++){
            if(codigo.equals(fincas[i].getCodigo())){
                bln_sw = true;
                int_pos = i;
                break;
            }
        }
        if(bln_sw == false){
            JOptionPane.showMessageDialog(null,"No se enctraron registros", "Actualizar", JOptionPane.ERROR_MESSAGE);
        }else{
            int op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "<< MENU DE OPCIONES >>\n1. Nombre\n2. Propietario\n3. Dirección\n4. Ubicación\n5.Producción\n6. Actividad"));
            if(op2 == 1){
                String nombre = JOptionPane.showInputDialog(null,"Nuevo Nombre");
                fincas[int_pos].setNombre(nombre);
            }
            if(op2 == 2){
                String propietario = JOptionPane.showInputDialog(null,"Nuevo propiertario");
                fincas[int_pos].setPropietario(propietario);
            }
            if(op2 == 3){
                String direccion = JOptionPane.showInputDialog(null,"Nueva direccion");
                fincas[int_pos].setDireccion(direccion);
            }
            if(op2 == 4){
                String ubicacion = JOptionPane.showInputDialog(null,"Nueva ubicacion");
                fincas[int_pos].setUbicacion(ubicacion);
            }
            if(op2 == 5){
                String produccion = JOptionPane.showInputDialog(null,"Ingrese produccion");
                fincas[int_pos].setProduccion(produccion);
            }
            if(op2 == 6){
                String actividad = JOptionPane.showInputDialog(null,"Ingrese actividad");
                fincas[int_pos].setActividad(actividad);
            }
    }
    }
    
    private static void fnt_selector(int opcion){
        if (opcion == 1){
            fnt_registrar();
        }
        if (opcion == 2){
            String cod = JOptionPane.showInputDialog(null, "Ingrese el codigo de la finca: ");
            fnt_consultar(cod);
        }

        if (opcion == 3){
            String cod = JOptionPane.showInputDialog(null, "Ingrese el codigo de la finca: ");
            fnt_actualizar(cod);

        }

        if (opcion == 4){  

            System.exit(0);
        
        }
    }

}