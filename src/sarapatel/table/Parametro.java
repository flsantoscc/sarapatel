package sarapatel.table;

/**
 * Parametro
 */
public class Parametro extends Entry implements hasEndereco {
    private Tipo tipo;
    private int endereco;

    public Parametro(String name, Tipo tipo) {
        super(name);
        this.tipo = tipo;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public int getEndereco() {
        return endereco;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
