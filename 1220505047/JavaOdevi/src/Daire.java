public class Daire extends Konut{ //konuta inherit ediyoruz
    private int apartmentNumber;

    public Daire(String address, int apartmentNumber, EvSahibi evSahibi) { //parametreli constructor
        super(address, evSahibi);
        this.apartmentNumber=apartmentNumber;
    }

    @Override
    public void displayInfo() { //ciktilari yazan method, konut classindaki methodtan override edildi
        super.displayInfo();
        System.out.println("Daire Numarasi: "+apartmentNumber);
    }
}
