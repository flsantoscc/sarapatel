package sarapatel.semantic;

import java.util.Hashtable;

import sarapatel.analysis.DepthFirstAdapter;
import sarapatel.iterator.ConcreteAggregate;
import sarapatel.iterator.Iterator;
import sarapatel.node.ADecVar;
import sarapatel.node.APrograma;
import sarapatel.table.SymbolTable;
import sarapatel.table.TableFactory;
import sarapatel.table.Tipo;
import sarapatel.table.Var;

/**
 * SemanticAnalyzer
 */
public class SemanticAnalyzer extends DepthFirstAdapter {
    private SymbolTable hashtable;
    private Hashtable info;
    private Tipo tipo_inteiro, tipo_real, tipo_cadeia, tipo_booleano;
    private ConcreteAggregate error_list;

    public SemanticAnalyzer() {
        TableFactory factory = TableFactory.getInstance();
        hashtable = factory.getSymbolTable();
        info = new Hashtable<>();
        error_list = new ConcreteAggregate();
    }

    @Override
    public void inAPrograma(APrograma node) {
        hashtable.enterBlock();
        try {
            tipo_inteiro = new Tipo("inteiro");
            hashtable.enter(tipo_inteiro);

            tipo_real = new Tipo("real");
            hashtable.enter(tipo_real);

            tipo_cadeia = new Tipo("cadeia");
            hashtable.enter(tipo_cadeia);

            tipo_booleano = new Tipo("booleano");
            hashtable.enter(tipo_booleano);
        } catch (CompileError e) {
            error_list.add(e);
        }
    }

    @Override
    public void outAPrograma(APrograma node) {
        hashtable.exitBlock();
        if (error_list.getLength() > 0) {
            Iterator iterator = error_list.iterator();
            while (iterator.hasNext()) {
                System.out.println(((CompileError) iterator.next()).getMessage());
            }
        }
    }

    @Override
    public void outADecVar(ADecVar node) {
        Information id = (Information) info.get(node.getId());
        Information tipo = (Information) info.get(node.getTipo());

        System.out.println(node.getId());

        try {
            hashtable.enter(new Var(id.getString(), tipo.getTipo()));
        } catch (CompileError e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println(hashtable);
    }
}
