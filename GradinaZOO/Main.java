public class Main{
    public static void main(String[] args){
      Animal[] gradinaMea = {
              new Caine("Azorel"),
              new Pisica("Mitzi"),
              new Papagal("Roco"),
              new Caine("Rex")
      };
      for(Animal a :gradinaMea)
          a.scoateSunet();
    }
}
