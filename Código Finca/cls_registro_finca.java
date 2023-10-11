public class cls_registro_finca{

    private String str_nombre, str_extension, str_propietario, str_direccion, str_ubicacion;
    private int int_codigo;
    private float flt_produccion;

    public cls_registro_finca(String nombre, String extension, String propietario, String direccion, 
    String ubicacion, int codigo, float produccion) {

        this.str_nombre = nombre;
        this.str_extension = extension;
        this.str_propietario = propietario;
        this.str_direccion = direccion;
        this.str_ubicacion = ubicacion;
        this.int_codigo = codigo;
        this.flt_produccion = produccion;


    }

}