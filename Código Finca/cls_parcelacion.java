public class cls_parcelacion {
    
        private String str_codigo;
        private String str_nombre;
        private String str_codigoFinca;
        private int int_stock;
        private float flt_produccion;
        private float flt_ganancia;
       
    
        public cls_parcelacion(String cod, String nom, String codF, int stock, float prod, float ganancia) {
            this.str_codigo = cod;
            this.str_nombre = nom;
            this.str_codigoFinca = codF;
            this.int_stock = stock;
            this.flt_produccion = prod;
            this.flt_ganancia = ganancia;
        }
        //seters
        public void setStock(int stock) { this.int_stock = stock; }
        //geters
        public String getNombre() { return str_nombre; }
        public String getCodigoFinca() { return str_codigoFinca;}
        public String getCodigo() { return str_codigo; }
        public int getStock() { return int_stock; }
        public float getGanancia(){ return flt_ganancia; }
        public float getProduccion() { return flt_produccion; }


}
