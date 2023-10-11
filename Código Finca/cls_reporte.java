public class cls_reporte {
    
    private String str_nombre, str_extension, str_propietario, str_direccion, str_ubicacion,
    str_actividad, str_codigo, str_produccion;
    
    private String str_codigop;
    private String str_nombrep;
    private int int_stock;
    private String str_produccionp;
    private String str_ganancia;

    public cls_reporte(String nombre, String extension, String propietario, String direccion, 
    String ubicacion, String codigo, String produccion, String actividad, String cod, String nom, 
    String codF, int stock, String prod, String ganancia) {

        this.str_nombre = nombre;
        this.str_extension = extension;
        this.str_propietario = propietario;
        this.str_direccion = direccion;
        this.str_ubicacion = ubicacion;
        this.str_codigo = codigo;
        this.str_produccion = produccion;
        this.str_actividad = actividad;
        this.str_codigop = cod;
        this.str_nombrep = nom;
        this.int_stock = stock;
        this.str_produccionp = prod;
        this.str_ganancia = ganancia;


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
    public String getNombrep() { return str_nombrep; }
    public String getCodigop() { return str_codigop; }
    public int getStock() { return int_stock; }
    public String getGanancia(){ return str_ganancia; }
    public String getProduccionp() { return str_produccionp; }
    

}
