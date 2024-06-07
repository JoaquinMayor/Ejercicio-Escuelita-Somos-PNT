package producto;

public abstract class Producto implements Comparable<Producto>{
    private String nombre;
    private Medida medida;
    private Double precio;
    private Double cantidad;

    public Producto() {
        this.nombre = "";
        this.medida = null;
        this.precio = 0.0;
        this.cantidad = 0.0;
    }

    public Producto(Medida medida, String name, Double precio, Double cantidad) {
        this.medida = medida;
        this.nombre = name;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Medida getMedida() {
        return medida;
    }

    public void setMedida(Medida medida) {
        this.medida = medida;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int compareTo(Producto producto) {
        return Double.compare(this.precio, producto.getPrecio());
    }

}
