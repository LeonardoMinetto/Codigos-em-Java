public class DieDemo{
    public static void main(String[] args){
        Die dado1 = new Die();
        Die dado2 = new Die();
        
        dado1.roll();
        dado2.roll();
        
        int soma = dado1.getSideUp() + dado2.getSideUp();
        System.out.println("Soma dos dados:"+dado1.getSideUp()+" + "+dado2.getSideUp()+" = " +soma);

    }
}