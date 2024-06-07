package producto;

import java.text.DecimalFormat;

public class Frutas extends Producto{

    public Frutas(Medida medida, String name, Double precio, Double cantidad) {
        super(medida, name, precio, cantidad);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return "Nombre: "+ super.getNombre()+ " /// " + "Precio: $" + decimalFormat.format(super.getPrecio()) +" /// Unidad de venta: "+super.getMedida().getMedida().toLowerCase();
    }
}
