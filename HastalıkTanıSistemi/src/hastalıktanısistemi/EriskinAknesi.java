package hastalıktanısistemi;

public class EriskinAknesi extends Hastalık{

    public EriskinAknesi() {
        this.setHastalıkAdi("Eriskin Aknesi");
        this.setIlac(new Roaccutane(this));
    }
    
}
