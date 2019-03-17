package dosyaislemleri.nesneyazma;

import java.io.*;

public class NesneOku {

    private final static String ROOT = "C:\\DosyaIslemler\\personel.txt";

    public static void main(String[] args) {

        ObjectInputStream objectInputStream = null;
        File file = new File(ROOT);
        Personel personel = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(file);

            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {
                personel = (Personel) objectInputStream.readObject();
                System.out.println(personel);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamamıştır.");
        } catch (EOFException e) {
            return;
        } catch (IOException e) {
            System.out.println("Dosyadaki nesne okunamadı.");
        } catch (ClassNotFoundException e) {
            System.out.println("Personel sınıfı bulunamadı");
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Personel adı : " + personel.getAd());
        }
    }
}
