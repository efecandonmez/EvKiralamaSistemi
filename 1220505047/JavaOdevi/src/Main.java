public class Main {
    public static void main(String[] args) {

        Kiraci kiraci= new Kiraci("Huseyin ", "Gokturk");
        EvSahibi evSahibi1= new EvSahibi("Yasar ", "Kocaman");
        evSahibi1.setKiraci(kiraci);
        kiraci.setEvSahibi(evSahibi1);

        Konut konut = new Konut("Akalar Mah. Zambak Sokak No :7", evSahibi1);
        konut.displayInfo();

        Daire daire = new Daire("Akalar Mah. Zambak Sokak No :7", 642, evSahibi1);
        daire.displayInfo();

        Bina bina = new Bina("Anadolu Cad. 567 Sk. No: 10", 11, evSahibi1);
        bina.displayInfo();

    }
}
