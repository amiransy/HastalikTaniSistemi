package hastalıktanısistemi;

public class Acnegen extends Ilac{

    public Acnegen(Hastalık hastalik) {
        this.setIlacAdi("Acnegen");
        this.setDoz((float) 0.06);
        this.setHastalık(hastalik);
    }
    
}
