public class cls_parcelacion {
    
        private String str_codigo;
        private String str_nombre;
        private String str_codigoFinca;
        private int int_stock;
        private String str_produccion;
        private String str_ganancia;
       
    
        public cls_parcelacion(String cod, String nom, String codF, int stock, String prod, String ganancia) {
            this.str_codigo = cod;
            this.str_nombre = nom;
            this.str_codigoFinca = codF;
            this.int_stock = stock;
            this.str_produccion = prod;
            this.str_ganancia = ganancia;
        }
        //seters
        public void setStock(int stock) { this.int_stock = stock; }
        //geters
        public String getNombre() { return str_nombre; }
        public String getCodigoFinca() { return str_codigoFinca;}
        public String getCodigo() { return str_codigo; }
        public int getStock() { return int_stock; }
        public String getGanancia(){ return str_ganancia; }
        public String getProduccion() { return str_produccion; }


}
