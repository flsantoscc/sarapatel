package sarapatel.table;

/**
 * TipoIdent
 */
public class TipoIdent extends Tipo implements hasTipo {
    private Tipo tipo;

    public TipoIdent(String name, Tipo tipo) {
        super(name);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

}
