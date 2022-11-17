package sarapatel.table;

import sarapatel.table.Operacao.OPERACAO;

/**
 * Simbolo
 */
public class Simbolo {
    private String id;
    private String tipo;
    private OPERACAO op;

    public Simbolo(String id, String tipo, OPERACAO op) {
        this.id = id;
        this.tipo = tipo;
        this.op = op;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public OPERACAO getOp() {
        return op;
    }

    @Override
    public String toString() {
        return "(" + id + ", " + tipo + ")";
    }

}
