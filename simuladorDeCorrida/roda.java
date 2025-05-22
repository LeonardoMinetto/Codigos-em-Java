import java.util.Random;
public class roda extends Veiculo{
    private boolean calibrado;
    public roda(){
        Random random = new Random();
        this.calibrado = random.nextBoolean();
    }
    //metodos getters e setters
   public setCalibragem(boolean calibrado){
        this.calibrado = calibrado;
    }
    public boolean getCalibragem(){
        return this.calibrado;
    }
    //metodo toString
    public String toString(){
        return "Roda{" + "calibrado=" + calibrado + '}';
    }   
}