package dosyaislemleri.nesneyazma;

import java.io.Serializable;

public class Personel implements Serializable {

    private static final long serialVersionUID = 903004239396722278L;

    private String ad;
    private String soyad;

    public Personel() {
    }

    public Personel(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
