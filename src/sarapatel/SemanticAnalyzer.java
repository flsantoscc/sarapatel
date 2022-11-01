package sarapatel;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import sarapatel.analysis.DepthFirstAdapter;
import sarapatel.node.*;

public class SemanticAnalyzer extends DepthFirstAdapter {
    Hashtable<String, Object> symbol_table = new Hashtable<>();

    @Override
    public void outADecVar(ADecVar node) {
        TId id = node.getId();
        AIdAtribuicao id_atribuicao = (AIdAtribuicao) node.getIdAtribuicao();
        PTipo tipo = node.getTipo();

        if (id != null && id_atribuicao == null) {
            if (symbol_table.contains(id.toString())) {
                System.out.println("Variável já declarada!");
                System.exit(1);
            } else {
                symbol_table.put(id.toString(), tipo);
            }
        } else if (id_atribuicao != null && id == null) {
            if (symbol_table.contains(id_atribuicao.toString())) {
                System.out.println("Variável já declarada!");
                System.exit(1);
            } else {
                List<Node> value = new ArrayList<>();
                value.add(tipo);
                value.add(id_atribuicao.getExp());

                symbol_table.put(id_atribuicao.getValor().toString(), value);
            }
        }

        System.out.println(symbol_table.toString());
    }

    @Override
    public void outADecConst(ADecConst node) {
        AIdAtribuicao id_atribuicao = (AIdAtribuicao) node.getIdAtribuicao();
        PTipo tipo = node.getTipo();

        if (id_atribuicao != null) {
            if (symbol_table.contains(id_atribuicao.toString())) {
                System.out.println("Variável já declarada!");
                System.exit(1);
            } else {
                List<Node> value = new ArrayList<>();
                value.add(tipo);
                value.add(id_atribuicao.getExp());

                symbol_table.put(id_atribuicao.getValor().toString(), value);
            }

            System.out.println(symbol_table.toString());
        }
    }

    @Override
    public void outADecProc(ADecProc node) {
        TId id = node.getId();
        List<PParametro> parametros = new ArrayList<>(node.getParametro());
        PComando comando = node.getComando();

        if (symbol_table.contains(id.toString())) {
            System.out.println("Variável já declarada!");
            System.exit(1);
        } else {
            List<Object> value = new ArrayList<>();
                value.add(parametros);
                value.add(comando);

                symbol_table.put(id.toString(), value);
        }
        System.out.println(symbol_table.toString());
    }

    @Override
    public void outADecFunc(ADecFunc node) {
        // TODO Auto-generated method stub
        super.outADecFunc(node);
    }
}
