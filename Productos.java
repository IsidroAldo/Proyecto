class Productos{
    String marca, producto;
    int id, precio;

    public Productos(){
    }

    public Productos(int id, String marca, int precio, String producto){
        this.marca = marca;
        this.id = id;
        this.precio = precio;
        this.producto = producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Productos [marca=" + marca + ", id=" + id + ", precio=" + precio + ", producto=" + producto + "]";
    }
}