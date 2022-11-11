package sarapatel.table;

/**
 * Var
 */
public class Var extends Entry implements hasEndereco {
    private Tipo tipo;
    private int endereco;

    public Var(String name, Tipo tipo) {
        super(name);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

}
