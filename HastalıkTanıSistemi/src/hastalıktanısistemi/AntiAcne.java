package hastalıktanısistemi;

public class AntiAcne extends Ilac{

    public AntiAcne(Hastalık hastalik) {
        this.setIlacAdi("AntiAcne");
        this.setDoz((float) 0.5);
        this.setHastalık(hastalik);
    }
    
    
}
