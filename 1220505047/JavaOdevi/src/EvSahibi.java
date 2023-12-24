public class EvSahibi {
    private String firstName;
    private String lastName;
    private Kiraci kiraci; //Kiraci classina referans 1-1

    public EvSahibi(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    //kapsulleme yaptigimiz icin private degiskeni diger classlarda cagirabilmek icin boyle bir method yaziyoruz.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setKiraci(Kiraci kiraci) {
        this.kiraci = kiraci;
    }

    public void displayInfo() { //bilgileri yazdiran method
        System.out.println("Ev sahibi: "+ firstName+""+ lastName);
        if(kiraci!=null) { //kiraci bos deger degilse bu if calisir
            System.out.println("Kiraci: "+ kiraci.getFirstName()+""+kiraci.getLastName());
        }
    }



}
