public class Konut {
    public String address;
    private EvSahibi evSahibi;

    public Konut(String address, EvSahibi evSahibi) { //constructor method
        this.address=address;
        this.evSahibi = evSahibi;
    }

    public void displayInfo() {  //bilgileri cikti yaptigimiz method
        System.out.println("Address: "+ address);
        evSahibi.displayInfo();
    }
}
