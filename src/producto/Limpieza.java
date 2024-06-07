package producto;

import java.text.DecimalFormat;

public class Limpieza extends Producto{
    public Limpieza(Medida medida, String name, Double precio, Double cantidad) {
        super(medida, name, precio, cantidad);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return "Nombre: "+ super.getNombre()+ " /// " + super.getMedida().getMedida()+": "+decimalFormat.format(super.getCantidad()) +"ml /// Precio: $" +decimalFormat.format(super.getPrecio());
    }
}
