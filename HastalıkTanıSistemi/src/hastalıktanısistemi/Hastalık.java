package hastalıktanısistemi;

import java.util.List;

public abstract class Hastalık {

    private String hastalıkAdi;
    private Ilac ilac;
    private List<Semptom> semptom;

    private class Semptom {

        private final String SemptomAdi;  
        private final boolean SemptomVar;

        public Semptom(String SemptomAdi, boolean SemptomVar) {
            this.SemptomAdi = SemptomAdi;
            this.SemptomVar = SemptomVar;
        }

        public String getSemptomAdi() {
            return SemptomAdi;
        }

        public boolean isSemptomVar() {
            return SemptomVar;
        }
    }

    public Hastalık() {

    }

    public Hastalık(String hastalıkAdi, Ilac ilac) {
        this.hastalıkAdi = hastalıkAdi;
        this.ilac = ilac;
    }

    public Ilac getIlac() {
        return ilac;
    }

    public void setIlac(Ilac ilac) {
        this.ilac = ilac;
    }

    public String getHastalıkAdi() {
        return hastalıkAdi;
    }

    public void setHastalıkAdi(String hastalıkAdi) {
        this.hastalıkAdi = hastalıkAdi;
    }

    public void HastalikBilgileriniListele() {
        System.out.println(this.hastalıkAdi + "hastaligina sahipsiniz.");
        System.out.println(this.ilac.getIlacAdi() + "ilacini kullanmalisiniz:");
    }
    
    public void SemptomEkle(String SemptomAdi, boolean SemptomVar){
        semptom.add(new Semptom(SemptomAdi,SemptomVar));
    }
}
