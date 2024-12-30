package hastalıktanısistemi;

public class Papul extends Hastalık{

    public Papul() {
        this.setHastalıkAdi("Papul");
        this.setIlac(new Acnegen(this));
    }
    
}
