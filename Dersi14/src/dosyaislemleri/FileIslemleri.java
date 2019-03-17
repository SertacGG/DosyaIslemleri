package dosyaislemleri;

import java.io.File;

public class FileIslemleri {
    private final static String ROOT = "C:\\DosyaIslemler";

    public static void main(String[] args) {

        File file = new File(ROOT);

        if (file.isFile()) {
            System.out.println("Bu uzantısı olan bir dosyadır");
        } else if (file.isDirectory()) {
            System.out.println("bu bir klasördür");
            System.out.println("Klasör ismi : " + file.getName());
            System.out.println("Bir önceki klasör : " + file.getParent());
            System.out.println("Klasör uzantısı : " + file.getPath());
            System.out.println("Klasör boyutu : " + file.length());

            System.out.println("İçerisindeki dosyalar : ");
            for (String dosyaIslemleri : file.list()) {
                System.out.println(dosyaIslemleri);

                if (dosyaIslemleri.equals("A")) {
                    File aFile = new File(ROOT + "\\" + dosyaIslemleri);
                    if (aFile.isDirectory()) {
                        System.out.println("A Klasörü içerisindeki dosyalar : ");
                        for (String a : aFile.list()) {
                            System.out.println(a);
                        }
                        break;
                    }
                }

            }

        } else {
            System.out.println("Dosya yada klasör bulunamadı");
        }

    }
}
