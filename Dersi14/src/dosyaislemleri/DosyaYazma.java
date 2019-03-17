package dosyaislemleri;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DosyaYazma {

    public static void main(String[] args) {
        File file = new File("C:\\DosyaIslemler\\deneme.txt");
        //System.out.println(file.exists());
        if (file.exists()) {
            System.out.println("Dosyamız mevcuttur.");
            PrintWriter yazici = null;
            try {
                yazici = new PrintWriter(file);
                yazici.write("Merhaba Java");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                yazici.close();
            }

        }
    }
}
