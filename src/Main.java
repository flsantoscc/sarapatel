/* Create an AST, then invoke our interpreter. */
import sarapatel.interpret.Interpreter;
import sarapatel.parser.* ;
import sarapatel.lexer.* ;
import sarapatel.node.* ;

import java.io.* ;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                // AST Setup
                File file = new File("src/" + args[0]).getAbsoluteFile();

                Lexer lexer = new Lexer (new PushbackReader(
                        new FileReader(file), 1024));
                Parser parser = new Parser(lexer);
                Start ast = parser.parse() ;

                // Interpreter Setup
                Interpreter interp = new Interpreter () ;
                ast.apply(interp) ;
            }
            catch (Exception e) {
                System.out.println (e) ;
                e.printStackTrace();
            }
        } else {
            System.err.println("usage: java simpleAdder inputFile");
            System.exit(1);
        }
    }
}