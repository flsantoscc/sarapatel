package sarapatel;

import sarapatel.lexer.Lexer;
import sarapatel.node.Start;
import sarapatel.parser.Parser;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    sucesso();
    // erro();
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
      tree.apply(new TypeAnalyzer());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
