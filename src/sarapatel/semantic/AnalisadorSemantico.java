package sarapatel.semantic;

import sarapatel.analysis.DepthFirstAdapter;
import sarapatel.node.ABlocoExpressoes;
import sarapatel.node.ABoolExp;
import sarapatel.node.ACadeiaExp;
import sarapatel.node.AIdAtribuicao;
import sarapatel.node.AIdAtribuicaoDecVar;
import sarapatel.node.AIdDecVar;
import sarapatel.node.AIdValor;
import sarapatel.node.AIntExp;
import sarapatel.node.ARealExp;
import sarapatel.node.ASomaExp;
import sarapatel.node.PExp;
import sarapatel.node.PIdAtribuicao;
import sarapatel.table.Simbolo;
import sarapatel.table.TabelaSimbolos;

/**
 * AnalisadorSemantico
 */
public class AnalisadorSemantico extends DepthFirstAdapter {
    private TabelaSimbolos tab; // Tabela de simbolos global
    private TabelaSimbolos tabela; // Tabela de simbolos de escopos internos

    public AnalisadorSemantico() {
        tab = new TabelaSimbolos();
        tabela = tab;
    }

    @Override
    public void outAIdDecVar(AIdDecVar node) {
        String id = node.getId().getText();
        String[] tipo = node.getTipo().toString().split(" ");

        if (tabela.encontrar(id) == null) {
            tabela.inserir(id, new Simbolo(id, tipo[0]));
        } else {
            System.out.println("Variável `" + id + "` já declarada.");
        }

        System.out.println(tabela.getTabela());
    }

    @Override
    public void outAIdAtribuicaoDecVar(AIdAtribuicaoDecVar node) {
        String id = ((AIdValor) ((AIdAtribuicao) node.getIdAtribuicao()).getValor()).getId().toString();
        String[] tipo = node.getTipo().toString().split(" ");

        PExp exp = ((AIdAtribuicao) node.getIdAtribuicao()).getExp();

        if (tabela.encontrar(id) == null) {
            if ((tipo[0].equals("inteiro") && (exp instanceof AIntExp))
                    || (tipo[0].equals("real") && (exp instanceof ARealExp))
                    || (tipo[0].equals("cadeia") && (exp instanceof ACadeiaExp))
                    || (tipo[0].equals("booleano") && (exp instanceof ABoolExp))) {
                tabela.inserir(id, new Simbolo(id, tipo[0]));
            } else {
                System.out.println("Tipos incompatíveis");
                System.exit(1);
            }
        }

        System.out.println(tabela.getTabela());
    }

    @Override
    public void outASomaExp(ASomaExp node) {
        if (!(((node.getLeft() instanceof AIntExp) && (node.getRight() instanceof AIntExp))
                || ((node.getLeft() instanceof ARealExp) && (node.getRight() instanceof ARealExp)))) {
            System.out.println("Tipos incompatíveis");
            System.exit(1);
        }
    }

}
