package sarapatel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import sarapatel.lexer.Lexer;
import sarapatel.node.Start;
import sarapatel.parser.Parser;
import sarapatel.semantic.AnalisadorSemantico;
import sarapatel.semantic.SemanticAnalyzer;

public class Main {
    // public static void main(String[] args) {
    // try {
    // PushbackReader pr = new PushbackReader(
    // new BufferedReader(new
    // FileReader("src/tests/sucesso/01_procedimento_3_com_declaracao.srptl")),
    // 1024);

    // Lexer l = new Lexer(pr);

    // System.out.println("Parsing...");
    // Parser p = new Parser(l);

    // Start tree = p.parse();

    // System.out.println("Checking... ");
    // tree.apply(new SemanticAnalyzer());

    // // System.out.println("Generating P4-Code");
    // // CodeGenerator gen = new CodeGenerator();
    // // tree.apply(gen);

    // pr.close();

    // } catch (ArrayIndexOutOfBoundsException e) {
    // e.printStackTrace();
    // } catch (FileNotFoundException e) {
    // e.printStackTrace();
    // } catch (IOException e) {
    // e.printStackTrace();
    // } catch (Exception e) {
    // System.out.println(e.getMessage());
    // }
    // }
    public static void main(String[] args) throws IOException {
        sucesso();
        erro();
    }

    public static void sucesso() throws IOException {
        try (Stream<Path> stream = Files.list(Paths.get("./src/tests/sucesso"))) {
            stream.filter(file -> !Files.isDirectory(file)).map(Path::toString).sorted().collect(Collectors.toSet())
                    .forEach(Main::parse);
        }
    }

    public static void erro() throws IOException {
        try (Stream<Path> stream = Files.list(Paths.get("./src/tests/erro"))) {
            stream.filter(file -> !Files.isDirectory(file)).map(Path::toString).sorted().collect(Collectors.toSet())
                    .forEach(Main::parse);
        }
    }

    public static void parse(String file) {
        try {
            System.out.println(
                    "\n-------------------------------------------------------------------------------------------------\n");
            System.out.println(file + "\n");
            Parser p = new Parser(new Lexer(new PushbackReader(new FileReader(file), 1024)));
            Start tree = p.parse();
            tree.apply(new ASTPrinter());
            tree.apply(new AnalisadorSemantico());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
