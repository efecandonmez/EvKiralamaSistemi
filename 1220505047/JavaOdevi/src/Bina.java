public class Bina extends Konut{ //konuta inherit ediyoruz
    private int numberOfFloors;

    public Bina(String address, int numberOfFloors, EvSahibi evSahibi) { //parametreli constructor
        super(address, evSahibi);
        this.numberOfFloors=numberOfFloors;
    }

    @Override
    public void displayInfo() { //yine ciktilari yazan method, konut classindaki methodtan override edildi
        super.displayInfo();
        System.out.println("Kat sayısı: "+ numberOfFloors);
    }
}
