package hastalıktanısistemi;

public class NodulerAkne extends Hastalık{

    public NodulerAkne() {
        this.setHastalıkAdi("Noduler akne");
        this.setIlac(new Benzamycin(this));
    }
    
}
