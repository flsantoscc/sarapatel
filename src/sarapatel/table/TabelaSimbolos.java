package sarapatel.table;

import java.util.Hashtable;

/**
 * TabelaSimbolos
 */
public class TabelaSimbolos {
    private Hashtable<String, Simbolo> tabela;
    private TabelaSimbolos parent;

    public TabelaSimbolos() {
        tabela = new Hashtable<>();
        parent = null;
    }

    public TabelaSimbolos(TabelaSimbolos parent) {
        this.tabela = new Hashtable<>();
        this.parent = parent;
    }

    public void inserir(String id, Simbolo simbolo) {
        tabela.put(id, simbolo);
    }

    public void remover(String id) {
        tabela.remove(id);
    }

    public Simbolo encontrar(String id) {
        for (TabelaSimbolos ts = this; ts != null; ts = ts.parent) {
            Simbolo encontrado = ts.tabela.get(id);
            if (encontrado != null)
                return encontrado;
        }

        return null;
    }

    public Hashtable<String, Simbolo> getTabela() {
        return tabela;
    }

    public TabelaSimbolos getParent() {
        return parent;
    }

}
