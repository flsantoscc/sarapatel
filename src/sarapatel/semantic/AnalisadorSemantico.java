package sarapatel.semantic;

import sarapatel.analysis.DepthFirstAdapter;
import sarapatel.node.ABoolExp;
import sarapatel.node.ACadeiaExp;
import sarapatel.node.ADecConst;
import sarapatel.node.ADecFunc;
import sarapatel.node.ADecProc;
import sarapatel.node.AIdAtribuicao;
import sarapatel.node.AIdAtribuicaoDecVar;
import sarapatel.node.AIdDecVar;
import sarapatel.node.AIdValor;
import sarapatel.node.AIntExp;
import sarapatel.node.AMinusExp;
import sarapatel.node.AMultExp;
import sarapatel.node.ARealExp;
import sarapatel.node.ASomaExp;
import sarapatel.node.PExp;
import sarapatel.table.Simbolo;
import sarapatel.table.TabelaSimbolos;
import sarapatel.table.Operacao.OPERACAO;

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
            tabela.inserir(id, new Simbolo(id, tipo[0], OPERACAO.VAR));
        } else {
            System.out.println("Variável `" + id + "` já declarada.");
            System.exit(1);
        }

        System.out.println(tabela.getTabela());
    }

    @Override
    public void outAIdAtribuicaoDecVar(AIdAtribuicaoDecVar node) {
        String id = ((AIdValor) ((AIdAtribuicao) node.getIdAtribuicao()).getValor()).getId().toString();
        String[] tipo = node.getTipo().toString().split(" ");

        tabela.inserir(id, new Simbolo(id, tipo[0], OPERACAO.VAR));
    }

    @Override
    public void outADecConst(ADecConst node) {
        String id = ((AIdValor) ((AIdAtribuicao) node.getIdAtribuicao()).getValor()).getId().toString();
        String[] tipo = node.getTipo().toString().split(" ");

        tabela.inserir(id, new Simbolo(id, tipo[0], OPERACAO.CONST));
    }

    @Override
    public void outAIdAtribuicao(AIdAtribuicao node) {
        String id = ((AIdValor) node.getValor()).getId().getText();
        Simbolo simbolo = tabela.encontrar(id);
        String tipo = simbolo.getTipo();

        if (simbolo != null && simbolo.getOp() != OPERACAO.CONST) {
            PExp exp = node.getExp();
            if (tabela.encontrar(id) == null) {
                if (!((tipo.equals("inteiro") && (exp instanceof AIntExp))
                        || (tipo.equals("real") && (exp instanceof ARealExp))
                        || (tipo.equals("cadeia") && (exp instanceof ACadeiaExp))
                        || (tipo.equals("booleano") && (exp instanceof ABoolExp)))) {
                    System.out.println("Tipos incompatíveis.");
                    System.exit(1);
                }
            } else {
                System.out.println("Não é possível modificar uma constante.");
                System.exit(1);
            }
        }
    }

    @Override
    public void outADecProc(ADecProc node) {
        String id = node.getId().getText();

        if (tabela.encontrar(id) == null) {
            tabela.inserir(id, new Simbolo(id, null, OPERACAO.PROC));
        } else {
            System.out.println("Procedimento já declarado.");
        }
    }

    @Override
    public void outADecFunc(ADecFunc node) {
        String[] tipo = node.getTipo().toString().split(" ");
        String id = node.getId().getText();

        if (tabela.encontrar(id) == null) {
            tabela.inserir(id, new Simbolo(id, tipo[0], OPERACAO.FUNC));
        } else {
            System.out.println("Funcao já declarada.");
        }
    }

    @Override
    public void outASomaExp(ASomaExp node) {
        if (((node.getLeft() instanceof ACadeiaExp) || (node.getRight() instanceof ACadeiaExp))) {
            System.out.println("Não é possível somar expressões de tipo `cadeia`");
            System.exit(1);
        } else if (((node.getLeft() instanceof ABoolExp)) || (node.getRight() instanceof ABoolExp)) {
            System.out.println("Não é possível somar expressões de tipo `booleano`");
            System.exit(1);
        }
    }

    @Override
    public void outAMinusExp(AMinusExp node) {
        if ((node.getLeft() instanceof ACadeiaExp) || (node.getRight() instanceof ACadeiaExp)) {
            System.out.println("Não é possível somar expressões de tipo `cadeia`");
            System.exit(1);
        } else if ((node.getLeft() instanceof ABoolExp) || (node.getRight() instanceof ABoolExp)) {
            System.out.println("Não é possível somar expressões de tipo `booleano`");
            System.exit(1);
        }
    }

    @Override
    public void outAMultExp(AMultExp node) {

    }
}
