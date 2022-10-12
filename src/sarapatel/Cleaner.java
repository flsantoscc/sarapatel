package sarapatel;

import java.io.File;

public class Cleaner {
    public static void deleteDir(File file) {
        File[] contents = file.listFiles();
        if (contents != null) {
            for (File f : contents) {
                deleteDir(f);
            }
        }
        file.delete();
    }

    public static void main(String args[]){
        File file = new File("src/sarapatel").getAbsoluteFile();
        deleteDir(file);
    }
}
