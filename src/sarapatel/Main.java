package sarapatel;

import sarapatel.lexer.Lexer;
import sarapatel.node.Start;
import sarapatel.parser.Parser;
import java.io.FileReader;
import java.io.PushbackReader;

public class Main {
    public static void main(String[] args){
        try {
            String file = "src/tests/teste.srptl";

            Parser p = new Parser(new Lexer(new PushbackReader(new FileReader(file), 1024)));
            Start tree = p.parse();
            tree.apply(new ASTDisplay());
            tree.apply(new ASTPrinter());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}