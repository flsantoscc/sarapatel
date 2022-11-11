package sarapatel.table;

/**
 * Const
 */
public class Const extends Entry implements hasTipo {
    private String valor;
    private Tipo tipo;

    public Const(String name, Tipo tipo, String valor) {
        super(name);
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public Tipo getTipo() {
        return tipo;
    }
}
