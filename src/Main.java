/* Create an AST, then invoke our interpreter. */
//import sarapatel.interpret.Interpreter;
//import sarapatel.parser.* ;
import sarapatel.lexer.* ;
import sarapatel.node.* ;

import java.io.* ;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                // AST Setup

                int test_number = 0;
                Lexer lexer;
                Token token;

                for(String arg : args){
                    File file = new File("src/" + arg).getAbsoluteFile();

                    lexer = new Lexer(new PushbackReader(
                            new FileReader(file), 1024));


                    System.out.println("Test #" + (++test_number));
                    while (!((token = lexer.next()) instanceof EOF)) {
                        System.out.println(token.getClass());
                        System.out.println(" ( " + token.toString() + ")");
                    }
                    System.out.println();
                }

                /*
                Parser parser = new Parser(lexer);
                Start ast = parser.parse() ;

                // Interpreter Setup
                Interpreter interp = new Interpreter () ;
                ast.apply(interp) ;
                 */
            }
            catch (Exception e) {
                System.out.println (e) ;
                e.printStackTrace();
            }
        } else {
            System.err.println("usage: java sarapatel inputFile");
            System.exit(1);
        }
    }
}