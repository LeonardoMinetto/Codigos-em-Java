import java.util.Random;
public class Motocicleta extends VeiculoHibrido{

    public Motocicleta(int id, int quantidadeRodas, int distanciaPercorrida, float cilindradaCombustao, float cilindradaEletrico){
        super(id, 2, distanciaPercorrida);
        this.motorCombustao = new motor(1.0f, "combustao");
        this.motorEletrico = new motor(1.0f, "eletrico");
    }
    //setando o tanque de combustivel como random para a motocicleta
    public setTanqueCombustivel(int tanqueCombustivel){
        Random random = new Random();
        this.tanqueCombustivel = random.nextFloat() * 100;
    }
    //setando o nivel da bateria como random para a motocicleta
    public setNivelBateria(int nivelBateria){
        Random random = new Random();
        this.nivelBateria = random.nextFloat() * 100;
    }
    //aplicando a interface Reabastecivel
    public void reabastecer(int quantidade){
       if(motorCombustao.getModo().equals("combustao")){
          tanqueCombustivel += quantidade;
            if(tanqueCombustivel > 100){
                tanqueCombustivel = 100;
            }
        }
    }
    //aplicando a interface Recarregavel
    public void carregar(int quantidade){
        if(motorEletrico.getModo().equals("eletrico")){
            nivelBateria += quantidade;
            if(nivelBateria > 100){
                nivelBateria = 100;
        }
    }
}