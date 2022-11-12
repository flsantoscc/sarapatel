package sarapatel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import sarapatel.lexer.Lexer;
import sarapatel.node.Start;
import sarapatel.parser.Parser;
import sarapatel.semantic.SemanticAnalyzer;

public class Main {
    public static void main(String[] args) {
        try {
            PushbackReader pr = new PushbackReader(new BufferedReader(new FileReader(args[0])), 1024);

            Lexer l = new Lexer(pr);

            System.out.println("Parsing...");
            Parser p = new Parser(l);

            Start tree = p.parse();

            System.out.println("Checking... ");
            tree.apply(new SemanticAnalyzer());

            // System.out.println("Generating P4-Code");
            // CodeGenerator gen = new CodeGenerator();
            // tree.apply(gen);

            pr.close();

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
