import java.io.File;
import java.io.IOException;

public class SableCCSetup {
    public static void deleteDir(File file) {
        File[] contents = file.listFiles();
        if (contents != null) {
            for (File f : contents) {
                deleteDir(f);
            }
        }
        file.delete();
    }

    public static void clean(){
        File file = new File("src/sarapatel").getAbsoluteFile();
        deleteDir(file);
    }

    public static void execute(){
        String cmd = "/usr/lib/jvm/java-8-openjdk-amd64/bin/java" +
                " -classpath" +
                " /home/aluno/workspace/sablecc-3.7/lib/sablecc.jar" +
                " org.sablecc.sablecc.SableCC " +
                "/home/aluno/workspace/Compiladores-2022.1-Projeto/src/sarapatel.sable";

        Runtime rt = Runtime.getRuntime();

        try {
            Process pr = rt.exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
