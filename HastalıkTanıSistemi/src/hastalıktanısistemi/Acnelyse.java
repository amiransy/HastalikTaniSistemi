package hastalıktanısistemi;

public class Acnelyse extends Ilac{

    public Acnelyse(Hastalık hastalik) {
        this.setIlacAdi("Acnelyse");
        this.setDoz(450);
        this.setHastalık(hastalik);
    }
    
}
