package hastalıktanısistemi;

public class AkneTrent extends Ilac{

    public AkneTrent(Hastalık hastalik) {
        this.setIlacAdi("Aknetrent");
        this.setDoz(20);
        this.setHastalık(hastalik);
    }
    
}
