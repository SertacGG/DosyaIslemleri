package dosyaislemleri;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaOkuna {
    public static void main(String[] args) {
        File file = new File("C:\\DosyaIslemler\\deneme.txt");
        if (file.exists()) {
            Scanner okuma = null;
            try {
                okuma = new Scanner(file);
                while (okuma.hasNext()) {
                    System.out.println(okuma.next());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Dosya bulunamadı");
                System.exit(1);
            } finally {
                okuma.close();
            }

        } else {
            System.out.println("Dosya Bulunamadı");
        }

    }
}
