package sarapatel;

import java.util.Arrays;
import java.util.Hashtable;

import sarapatel.analysis.DepthFirstAdapter;
import sarapatel.node.ADecConst;
import sarapatel.node.ADecVar;
import sarapatel.node.AIdAtribuicao;

public class TypeAnalyzer extends DepthFirstAdapter {
    private Hashtable<String, String> symbtab = new Hashtable<>();
    private Hashtable<String, Boolean> initialized = new Hashtable<>();

    @Override
    public void caseADecVar(ADecVar node) {
        String tipo = node.getTipo().toString().toLowerCase().trim();
        String id = node.getId() != null ? node.getId().toString().toLowerCase() : null;
        String id_atribuicao = node.getIdAtribuicao() != null ? node.getIdAtribuicao().toString().toLowerCase() : null;

        if (id != null) {
            if (!symbtab.containsKey(id)) {
                symbtab.put(id, tipo);
                initialized.put(id, false);
            } else {
                System.out.println("# Erro: Variável '" + id + "' já declarada como '" + tipo + "'.");
                System.exit(1);
            }
        } else {
            if (!symbtab.containsKey(id_atribuicao)) {
                symbtab.put(id_atribuicao, tipo);
                initialized.put(id_atribuicao, false);
            } else {
                System.out.println("# Erro: Variável '" + id_atribuicao + "' já declarada como '" + tipo + "'.");
                System.exit(1);
            }
        }

        System.out.println(symbtab);
    }

    @Override
    public void caseADecConst(ADecConst node) {
        String tipo = node.getTipo().toString().toLowerCase().trim();
        String[] id_atribuicao = node.getIdAtribuicao().toString().split(" ");

        if (!symbtab.containsKey(id_atribuicao[0])) {
            symbtab.put(id_atribuicao[0], tipo);
            initialized.put(id_atribuicao[0], false);
        } else {
            System.out.println("# Erro: Variável '" + id_atribuicao[0] + "' já declarada como '" + tipo + "'.");
            System.exit(1);
        }

        System.out.println(symbtab);
    }

    @Override
    public void caseAIdAtribuicao(AIdAtribuicao node) {
        String[] valor = node.getValor().toString().split(" ");

        String tipo = symbtab.get(valor[0]);
        String exp = node.getExp().getClass().getSimpleName();

        node.getExp().apply(this);

        // Check if arithmetic expressions are
        if (exp.equals("ASomaExp") || exp.equals("AMinusExp") || exp.equals("AMultExp") || exp.equals("ADivExp")
                || exp.equals("AModExp")) {
            if (!(tipo.equals("inteiro") || tipo.equals("real"))) {
                System.out.println("# Erro: Tipo errado do '" + valor[0] + "'. Um '" + tipo + "' esperado.\n");
                System.exit(1);
            }
            initialized.put(valor[0], true);
        }
        // Check if those comparisons and boolean arithmetic are assigned to booleans
        if (exp.equals("AOuExp") || exp.equals("AEExpr") || exp.equals("ANotExp")) {
            if (!tipo.equals("booleano")) {
                System.out.println("# Erro: Tipo errado do '" + valor[0] + "'. Um '" + tipo + "' esperado.\n");
                System.exit(1);
            }
        }
        // If on the right side of := is only a number, check the type of the identifier
        if (exp.equals("AIntExp") || exp.equals("ERealExp")) {
            if (!(tipo.equals("inteiro") || tipo.equals("real"))) {
                System.out.println("# Erro: Tipo errado do '" + valor[0] + "'. Um '" + tipo + "' esperado.\n");
                System.exit(1);
            }
            System.out.println("Deu pau aqui");
        }
        // If there was only true or false found
        if (exp.equals("ABoolExp")) {
            if (!tipo.equals("booleano")) {
                System.out.println("# Erro: Tipo errado do '" + valor[0] + "'. Um '" + tipo + "' esperado.\n");
                System.exit(1);
            }
        }
        // If on the right side of := is only an identifier, check both types
        if (exp.equals("AIdentifierExpr")) {
            String matchIdentifier = node.getValor().toString().toLowerCase().replaceAll(" ", "");
            checkDeclared(matchIdentifier);
            if (!symbtab.get(valor[0]).equals(symbtab.get(valor[0])))
                System.out.println(
                        "# Erro: Tipo errado do identificador. '" + valor + "' é do tipo'" + symbtab.get(valor[0])
                                + "' e '" + matchIdentifier + "' é do tipo '" + symbtab.get(matchIdentifier) + "'.\n");
        }
    }

    private void checkDeclared(String identifier) {
        if (!symbtab.containsKey(identifier)) {
            System.out.println("# Erro: Variavel '" + identifier + "' não declarada.\n");
            System.exit(1);
        }
    }

    private boolean checkInitialized(String identifier) {
        if (initialized.get(identifier))
            return true;
        else
            return false;
    }
}
