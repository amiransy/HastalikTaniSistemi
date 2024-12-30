package hastalıktanısistemi;

public class Roaccutane extends Ilac{

    public Roaccutane(Hastalık hastalik) {
        this.setIlacAdi("Roaccutane");
        this.setDoz(150);
        this.setHastalık(hastalik);
    }
    
}
