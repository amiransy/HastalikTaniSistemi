package hastalıktanısistemi;

public class ErgenAknesi extends Hastalık{

    public ErgenAknesi() {
        this.setHastalıkAdi("Ergen aknesi");
        this.setIlac(new Zoretanin(this));
    }
    
}
