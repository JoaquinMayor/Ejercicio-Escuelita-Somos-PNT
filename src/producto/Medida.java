package producto;

public enum Medida {

    LITROS("Litros"),
    KILO("Kilo"),
    CONTENIDO("Contenido");
    private final String contenido;

    Medida(String contenido) {
        this.contenido = contenido;
    }

    public String getMedida(){
        return contenido;
    }
}
