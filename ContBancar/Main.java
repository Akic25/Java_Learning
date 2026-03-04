public class Main {
  public static void main(String[] args){
    ContBancar contulMeu = new ContBancar("Andrei Popescu", 500.0, "RO12345BNC");

    System.out.println("Titular: " + contulMeu.getTitular());

    contulMeu.depunere(200);

    contulMeu.retragere(150);
  }
}
