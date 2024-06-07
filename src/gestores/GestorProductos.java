package gestores;

import Exceptions.ListaVaciaException;
import producto.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class GestorProductos {

    private ArrayList<Producto> productos;

    public GestorProductos() {
        this.productos = new ArrayList<>();
        //Carga de Lista
        this.productos.add(new Bebida(Medida.LITROS,"Coca-Cola Zero",20.0,1.5));
        this.productos.add(new Bebida(Medida.LITROS,"Coca-Cola",18.0,1.5));
        this.productos.add(new Limpieza(Medida.CONTENIDO,"Shampoo Sedal",19.0,500.0));
        this.productos.add(new Frutas(Medida.KILO,"Frutillas ",64.0,1.0));
    }

    //Muestra Final de Todo Lo Solicitado
    public void mostrarProductos() {
        try {
            mostrarListado();
            System.out.printf("=============================\n");
            mostrarProductoCaroYBarato();
        } catch (ListaVaciaException e) {
            throw new RuntimeException(e);
        }

    }

    //Muestra Listado de Productos
    //Lanza excepción en caso de que la lista no se cargue
    private void mostrarListado() throws ListaVaciaException {
        if(!productos.isEmpty()){

            this.productos.forEach(producto-> System.out.printf(producto.toString()+"\n"));

        }else{
            throw new ListaVaciaException("La lista de productos esta vacía");
        }
    }

    //Muestra de Productos Mas Caros y Baratos
    private void mostrarProductoCaroYBarato(){
        System.out.printf("Producto más caro: " + Collections.max(productos).getNombre() +"\n");
        System.out.printf("Producto más barato: " + Collections.min(productos).getNombre()+"\n");
    }



}
