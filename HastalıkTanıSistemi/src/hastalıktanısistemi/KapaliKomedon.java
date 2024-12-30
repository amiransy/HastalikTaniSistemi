package hastalıktanısistemi;

public class KapaliKomedon extends Hastalık{

    public KapaliKomedon() {
        this.setHastalıkAdi("Kapali Komedon");
        this.setIlac(new Acnelyse(this));
    }
    
}
