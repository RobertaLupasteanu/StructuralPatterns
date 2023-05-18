package State;

public class CaracterJoc {

    String nume;
    int puncteViata;

    InterfataActiuniCaracter stareCurenta = null;

    public CaracterJoc(String nume, int puncteViata) {
        this.nume = nume;
        this.puncteViata = puncteViata;

        this.stareCurenta = new StareNormal();
    }
    private void setStareCurenta(InterfataActiuniCaracter stareCurenta) {
        this.stareCurenta = stareCurenta;
    }

    public void merge(){
        this.stareCurenta.seDeplaseaza();
    }

    public void ataca(String inamic, int puncte, CaracterJoc caracter){
        this.stareCurenta.ataca(inamic, puncte, caracter);
    }
    public void seVindeca(int puncte){
        if(this.puncteViata < 500){
            this.setStareCurenta(new StareRanit());
        }
        else
            if(this.puncteViata < 1000)
            {
                this.setStareCurenta(new StareNormal());
            }
        this.puncteViata += puncte;
    }

    public void esteLovit(int puncte){
        this.puncteViata -= puncte;
//        if(this.puncteViata < 50)
//            this.setStareCurenta(new StareRanitCritic());
//        else if(this.puncteViata < 500)
//            this.setStareCurenta(new StareRanit());
    }
}
