public class cls_registro_finca{

    private String str_nombre, str_extension, str_propietario, str_direccion, str_ubicacion,
    str_actividad, str_codigo, str_produccion;
    

    public cls_registro_finca(String nombre, String extension, String propietario, String direccion, 
    String ubicacion, String codigo, String produccion, String actividad) {

        this.str_nombre = nombre;
        this.str_extension = extension;
        this.str_propietario = propietario;
        this.str_direccion = direccion;
        this.str_ubicacion = ubicacion;
        this.str_codigo = codigo;
        this.str_produccion = produccion;
        this.str_actividad = actividad;


    }


    //Getters

    public String getNombre(){return str_nombre;}
    public String getExtension(){return str_extension;}
    public String getPropietario(){return str_propietario;}
    public String getDireccion(){return str_direccion;}
    public String getUbicacion(){return str_ubicacion;}
    public String getCodigo(){return str_codigo;}
    public String getProduccion(){return str_produccion;}
    public String getActividad(){return str_actividad;}

    //Setters

    public void setNombre(String nombre){this.str_nombre = nombre;}
    public void setPropietario(String propietario){this.str_propietario = propietario;}
    public void setDireccion(String direccion){this.str_direccion = direccion;}
    public void setUbicacion(String ubicacion){this.str_ubicacion = ubicacion;}
    public void setProduccion(String produccion){this.str_produccion = produccion;}
    public void setActividad(String actividad){this.str_actividad = actividad;}
    

}