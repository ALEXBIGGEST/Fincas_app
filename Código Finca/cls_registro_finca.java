public class cls_registro_finca{

    private String str_nombre, str_extension, str_propietario, str_direccion, str_ubicacion,
    str_actividad, str_codigo;
    private float flt_produccion;

    public cls_registro_finca(String nombre, String extension, String propietario, String direccion, 
    String ubicacion, String codigo, float produccion, String actividad) {

        this.str_nombre = nombre;
        this.str_extension = extension;
        this.str_propietario = propietario;
        this.str_direccion = direccion;
        this.str_ubicacion = ubicacion;
        this.str_codigo = codigo;
        this.flt_produccion = produccion;
        this.str_actividad = actividad;


    }


    //Getters

    public String getNombre(){return str_nombre;}
    public String getExtension(){return str_extension;}
    public String getPropietario(){return str_propietario;}
    public String getDireccion(){return str_direccion;}
    public String getUbicacion(){return str_ubicacion;}
    public String getCodigo(){return str_codigo;}
    public float getProduccion(){return flt_produccion;}
    public String getActividad(){return str_actividad;}

}