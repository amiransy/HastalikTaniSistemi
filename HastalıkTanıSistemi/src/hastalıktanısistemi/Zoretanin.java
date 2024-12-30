package hastalıktanısistemi;

public class Zoretanin extends Ilac{

    public Zoretanin(Hastalık hastalik) {
        this.setIlacAdi("Zoretanin");
        this.setDoz(40);
        this.setHastalık(hastalik);
    }
    
}
