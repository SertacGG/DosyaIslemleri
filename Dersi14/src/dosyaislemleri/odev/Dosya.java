package dosyaislemleri.odev;

import java.io.*;
import java.util.Scanner;

public class Dosya {

    private final static String ROOT = "C:\\DosyaIslemler\\Odev.txt";

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Dosyaya yazmak istediğin nedir ?");
        String data = myObj.nextLine();
        write(data);
        String okunanData = read();
        System.out.println("Okunan veri : " + okunanData);
        tersCevir(okunanData);
    }

    public static void write(String p_data) {
        File file = new File(ROOT);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file.createNewFile();
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(p_data);
            System.out.println("Yazılan veri : " + p_data);
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

    public static String read() {
        String g_data = "";
        String tmp = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(ROOT)))) {
            while ((g_data = reader.readLine()) != null) { // en son null kalıyor g_data
                tmp = g_data;
            }
        } catch (IllegalStateException | IOException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
        return tmp;
    }

    public static void tersCevir(String p_data) {
        String yeni = "";
        char[] charDeger = p_data.toCharArray();
        for (int i = charDeger.length - 1; i >= 0; i--) {
            yeni += charDeger[i];
        }
        System.out.println("Ters çevrilen veri : " + yeni);
    }

}
