package hastalıktanısistemi;

public class Test {
    private String testAdi;

    public Test() {
        
    }

    public Test(String testAdi) {
        this.testAdi = testAdi;
    }

    public String getTestAdi() {
        return testAdi;
    }

    public void setTestAdi(String testAdi) {
        this.testAdi = testAdi;
    }
    
    public void TestBilgileriniListele(){
        System.out.println("test adi:"+this.testAdi);
    }
}
