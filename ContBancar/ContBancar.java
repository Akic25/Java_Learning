public class ContBancar {
    private String titular;
    private double sold;
    private String numarCont;

    public ContBancar(String titular, double SoldInitial, String numarCont)
    {
        this.titular=titular;
        this.numarCont=numarCont;
        if(SoldInitial>=0)
        {
            this.sold= SoldInitial;
        }
        else
        {
            this.sold=0;
            System.out.println("Soldul initial nu poate fi negativ.S-a setat pe 0");
        }
    }
    public void depunere(double suma){
        if(suma >0)
        {
            sold += suma;
            System.out.println("S-a depus: " + suma + " RON. Sold nou: " + sold);
        }
        else
        {
            System.out.println("Eroare: Suma de depunere trebuie sa fie pozitiva!");
        }
    }
    public void retragere(double suma ){
        if(suma>0 && suma <=sold )
        {
            sold -=suma;
            System.out.println("S-a retras: " + suma + " RON. Sold ramas: " + sold);
        }
         else if (suma > sold) {
        System.out.println("Eroare: Fonduri insuficiente! Sold actual: " + sold);
        } else {
        System.out.println("Eroare: Suma introdusa este invalida!");
       }
    }
    public double getSold() {
        return sold;
    }

    public String getTitular() {
        return titular;
    }
}
