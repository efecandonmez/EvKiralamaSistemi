public class Kiraci {
    private String firstName;
    private String lastName;
    private EvSahibi evSahibi; //EvSahibi classina referans 1-1

    public Kiraci(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //kapsulleme yaptigimiz icin private degiskeni diger classlarda cagirabilmek icin boyle bir method yaziyoruz.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEvSahibi(EvSahibi evSahibi) {
        this.evSahibi = evSahibi;
    }

    public void displayInfo() { //bilgileri yazdiran method
        System.out.println("Kiraci: " + firstName + " " + lastName);
        if (evSahibi != null) { //evSahibi bos deger degilse if calisir
            System.out.println("Ev Sahibi: " + evSahibi.getFirstName() + " " + evSahibi.getLastName());
        }
    }
}
