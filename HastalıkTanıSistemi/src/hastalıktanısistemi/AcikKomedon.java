package hastalıktanısistemi;

public class AcikKomedon extends Hastalık{

    public AcikKomedon() {
        this.setHastalıkAdi("Acik Komedon");
        this.setIlac(new AkneTrent(this));
    }
    
}
