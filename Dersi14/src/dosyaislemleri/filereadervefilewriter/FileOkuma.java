package dosyaislemleri.filereadervefilewriter;

import java.io.*;

public class FileOkuma {

    private final static String ROOT = "C:\\DosyaIslemler\\";

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(ROOT, "Java.txt")))) {

            String data = "";
            while ((data = reader.readLine()) != null) {
                System.out.println(data);
            }

        } catch (IllegalStateException | IOException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
