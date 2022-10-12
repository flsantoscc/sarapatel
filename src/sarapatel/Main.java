package sarapatel;//import sarapatel.interpret.Interpreter;
//import sarapatel.parser.* ;
import sarapatel.lexer.*;
import sarapatel.node.*;
import sarapatel.parser.Parser;

import java.io.File;
import java.io.PushbackReader;
import java.io.FileReader;

public class Main {
    public static void main(String args[]) {
        File folder = new File("src/tests").getAbsoluteFile();
        File[] listOfFiles = folder.listFiles();

        Lexer lexer;
        Token token;

        for (File file : listOfFiles) {
            if (file.isFile()) {
                try {
                    lexer = new Lexer(new PushbackReader(
                            new FileReader(file), 1024));
                    System.out.println("Test: " + file.getName());

                    while (!((token = lexer.next()) instanceof EOF)) {
                        System.out.println(token.getClass());
                        System.out.println(" ( " + token.toString() + ")");
                    }
                    System.out.println();

                    Start tree = (new Parser(lexer)).parse();
                    tree.apply(new ASTDisplay());
                } catch (Exception e) {
                    System.out.println(e);
                    e.printStackTrace();
                }
            }
        }
    }
}