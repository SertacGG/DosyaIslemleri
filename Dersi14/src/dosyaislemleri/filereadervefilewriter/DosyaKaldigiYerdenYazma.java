package dosyaislemleri.filereadervefilewriter;

import java.io.*;

public class DosyaKaldigiYerdenYazma {
    private final static String ROOT_FILE = "C:\\DosyaIslemler\\Java.txt";

    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(ROOT_FILE, true);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("\nasdasdasdasd");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
