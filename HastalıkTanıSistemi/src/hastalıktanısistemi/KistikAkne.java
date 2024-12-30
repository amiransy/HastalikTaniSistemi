package hastalıktanısistemi;

public class KistikAkne extends Hastalık{

    public KistikAkne() {
        this.setHastalıkAdi("Kistik akne");
        this.setIlac(new AntiAcne(this));
    }
    
}
