package hastalıktanısistemi;
public class Ilac {
    private String ilacAdi;
    private Hastalık hastalık;
    private float doz;

    public Ilac() {
        
    }

    public Ilac(String ilacAdi) {
        this.ilacAdi = ilacAdi;
    }

    public Ilac(String ilacAdi, Hastalık hastalık) {
        this.ilacAdi = ilacAdi;
        this.hastalık = hastalık;
    }

    public Ilac(String ilacAdi, Hastalık hastalık, String dozBirim, float doz) {
        this.ilacAdi = ilacAdi;
        this.hastalık = hastalık;
        this.doz = doz;
    }

    public String getIlacAdi() {
        return ilacAdi;
    }

    public void setIlacAdi(String ilacAdi) {
        this.ilacAdi = ilacAdi;
    }

    public Hastalık getHastalık() {
        return hastalık;
    }

    public void setHastalık(Hastalık hastalık) {
        this.hastalık = hastalık;
    }

    public float getDoz() {
        return doz;
    }

    public void setDoz(float doz) {
        this.doz = doz;
    }
    
    public void IlacBilgileriniListele(){   //İlaç bilgilerini listeleyen fonksiyon
        System.out.println("Ilacin adi: "+this.ilacAdi);
        System.out.println("Ilacin dozu: "+this.doz);
        System.out.println("Ilacin kullanildigi hastalik: "+this.hastalık.getHastalıkAdi());
    }
    
}
