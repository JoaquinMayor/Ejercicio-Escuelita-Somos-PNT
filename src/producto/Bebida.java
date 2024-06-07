package producto;

import java.text.DecimalFormat;

public class Bebida extends Producto{

    public Bebida(Medida medida, String name, Double precio, Double cantidad) {
        super(medida, name, precio, cantidad);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return "Nombre: "+ super.getNombre()+ " /// " + super.getMedida().getMedida()+": "+super.getCantidad()+" /// Precio: $" +decimalFormat.format(super.getPrecio());
    }
}
