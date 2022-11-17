package sarapatel.table;

/**
 * Simbolo
 */
public class Simbolo {
    private String id;
    private String tipo;

    public Simbolo(String id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "(" + id + ", " + tipo + ")";
    }

}
