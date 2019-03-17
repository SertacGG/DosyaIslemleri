package dosyaislemleri.filereadervefilewriter;

import java.io.*;

public class FileYazici {
    private final static String ROOT = "C:\\DosyaIslemler\\";

    public static void main(String[] args) {
        File file = new File(ROOT + "Java.txt");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file.createNewFile();
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Java 1995 yılında Jasmes Gosling tarafından yazılmıştır");
            bufferedWriter.newLine();
            bufferedWriter.write("END");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
