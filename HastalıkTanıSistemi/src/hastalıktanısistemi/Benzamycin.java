package hastalıktanısistemi;

public class Benzamycin extends Ilac{

    public Benzamycin(Hastalık hastalik) {
        this.setIlacAdi("Benzamycin");
        this.setDoz(160);
        this.setHastalık(hastalik);
    }
    
    
}
