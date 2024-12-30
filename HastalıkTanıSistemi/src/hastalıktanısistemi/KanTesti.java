package hastalıktanısistemi;

public class KanTesti extends Test{
    private float ure;
    private float kreatinin;
    private float kolesterolTotal;
    private float trigliserid;
    private float HDLKolesterol;
    private float LDLKolesterol;
    private float SGOTAST;
    private float SGPTALT;
    private float CRPTurbidimetrik;
    private float WBC;
    private float RBC;
    private float HGB;
    private float HCT;
    private float MCV;
    private float MCH;

    public KanTesti() {

    }

    public KanTesti(float ure, 
            float kreatinin,
            float kolesterolTotal,
            float trigliserid,
            float HDLKolesterol,
            float LDLKolesterol,
            float SGOTAST,
            float SGPTALT,
            float CRPTurbidimetrik,
            float WBC,
            float RBC,
            float HGB,
            float HCT,
            float MCV,
            float MCH,
            String testAdi) {
        
        super("KanTesti");
        this.ure = ure;
        this.kreatinin = kreatinin;
        this.kolesterolTotal = kolesterolTotal;
        this.trigliserid = trigliserid;
        this.HDLKolesterol = HDLKolesterol;
        this.LDLKolesterol = LDLKolesterol;
        this.SGOTAST = SGOTAST;
        this.SGPTALT = SGPTALT;
        this.CRPTurbidimetrik = CRPTurbidimetrik;
        this.WBC = WBC;
        this.RBC = RBC;
        this.HGB = HGB;
        this.HCT = HCT;
        this.MCV = MCV;
        this.MCH = MCH;
    }

    public float getUre() {
        return ure;
    }

    public void setUre(float ure) {
        this.ure = ure;
    }

    public float getKreatinin() {
        return kreatinin;
    }

    public void setKreatinin(float kreatinin) {
        this.kreatinin = kreatinin;
    }

    public float getKolesterolTotal() {
        return kolesterolTotal;
    }

    public void setKolesterolTotal(float kolesterolTotal) {
        this.kolesterolTotal = kolesterolTotal;
    }

    public float getTrigliserid() {
        return trigliserid;
    }

    public void setTrigliserid(float trigliserid) {
        this.trigliserid = trigliserid;
    }

    public float getHDLKolesterol() {
        return HDLKolesterol;
    }

    public void setHDLKolesterol(float HDLKolesterol) {
        this.HDLKolesterol = HDLKolesterol;
    }

    public float getLDLKolesterol() {
        return LDLKolesterol;
    }

    public void setLDLKolesterol(float LDLKolesterol) {
        this.LDLKolesterol = LDLKolesterol;
    }

    public float getSGOTAST() {
        return SGOTAST;
    }

    public void setSGOTAST(float SGOTAST) {
        this.SGOTAST = SGOTAST;
    }

    public float getSGPTALT() {
        return SGPTALT;
    }

    public void setSGPTALT(float SGPTALT) {
        this.SGPTALT = SGPTALT;
    }

    public float getCRPTurbidimetrik() {
        return CRPTurbidimetrik;
    }

    public void setCRPTurbidimetrik(float CRPTurbidimetrik) {
        this.CRPTurbidimetrik = CRPTurbidimetrik;
    }

    public float getWBC() {
        return WBC;
    }

    public void setWBC(float WBC) {
        this.WBC = WBC;
    }

    public float getRBC() {
        return RBC;
    }

    public void setRBC(float RBC) {
        this.RBC = RBC;
    }

    public float getHGB() {
        return HGB;
    }

    public void setHGB(float HGB) {
        this.HGB = HGB;
    }

    public float getHCT() {
        return HCT;
    }

    public void setHCT(float HCT) {
        this.HCT = HCT;
    }

    public float getMCV() {
        return MCV;
    }

    public void setMCV(float MCV) {
        this.MCV = MCV;
    }

    public float getMCH() {
        return MCH;
    }

    public void setMCH(float MCH) {
        this.MCH = MCH;
    }
    
    public boolean UreNormalMi(){   //Normal değerler var mı diye kontrol eden fonksiyonlar
        return this.ure>=10&&this.ure<=50;
    }
    
    public boolean KreatininNormalMi(){
        return this.kreatinin>=0.5&&this.kreatinin<=1.2;
    }
    
    public boolean KolesterolTotalNormalMi(){
        return this.kolesterolTotal>=0&&this.kolesterolTotal<=200;
    }
    
    public boolean TrigliseridNormalMi(){
        return this.trigliserid>=0&&this.trigliserid<=200;
    }
    
    public boolean HDLKolesterolNormalMi(){
        return this.HDLKolesterol>=35&&this.HDLKolesterol<=65;
    }
    
    public boolean LDLKolesterolNormalMi(){
        return this.LDLKolesterol>=0&&this.LDLKolesterol<=160;
    }
    
    public boolean SGOTASTNormalMi(){
        return this.SGOTAST>=0&&this.SGOTAST<=40;
    }
    
    public boolean SGPTALTNormalMi(){
        return this.SGPTALT>=0&&this.SGPTALT<=40;
    }
    
    public boolean CRPTurbidimetrikNormalMi(){
        return this.CRPTurbidimetrik>=0.5&&this.CRPTurbidimetrik<=0.5;
    }
    
    public boolean WBCNormalMi(){
        return this.WBC>=3.5&&this.WBC<=10;
    }
    
    public boolean RBCNormalMi(){
        return this.RBC>=3.5&&this.RBC<=5.5;
    }
    
    public boolean HGBNormalMi(){
        return this.HGB>=12&&this.HGB<=17.4;
    }
    
    public boolean HCTNormalMi(){
        return this.HCT>=36&&this.HCT<=52;
    }
    
    public boolean MCVNormalMi(){
        return this.MCV>=76&&this.MCV<=96;
    }
    
    public boolean MCHNormalMi(){
        return this.MCH>=27&&this.MCH<=32;
    }   
    
    public Hastalık TaniKoy(){ //Kan değerlerinin normal olup olmmamsına göre tanı koyan fonksiyon
        if(!UreNormalMi()&&!RBCNormalMi()){
            return new AcikKomedon();
        }      
        if(!KreatininNormalMi()||!MCHNormalMi()){
            return new KapaliKomedon();
        }
        if(!HGBNormalMi()){
            return new Papul();
        }
        if(!SGPTALTNormalMi()&&!SGOTASTNormalMi()){
            return new NodulerAkne();
        }
        if(!HDLKolesterolNormalMi()&&!KolesterolTotalNormalMi()&&!LDLKolesterolNormalMi()){
            return new KistikAkne();
        }
        if((!MCHNormalMi()||!MCVNormalMi())||(!HCTNormalMi()||!CRPTurbidimetrikNormalMi())){
            return new EriskinAknesi();
        }
        if(!WBCNormalMi()){
            return new ErgenAknesi();
        }
        System.out.println("Hastalık tanılanamadı!!!");
        return null;
    }
}
