public class CarroEsportivo extends VeiculoHibrido{
    private motor motorCombustao;
    private motor motorEletrico;
    private float tanqueCombustivel = 0;
    private int nivelBateria = 0;
    public CarroEsportivo(int id, int quantidadeRodas, float cilindradaCombustao, float cilindradaEletrico){
        super(id, 4, distanciaPercorridax);
        motorCombustao = new motor(2.5f, "combustao");
        motorEletrico = new motor(2.5f, "eletrico");
        this.tanqueCombustivel = 0;
        this.nivelBateria = 0;
    }
    //setando o tanque de combustivel como random para o carro esportivo
    public void setTanqueCombustivel(int tanqueCombustivel){
        Random random = new Random();
        this.tanqueCombustivel = random.nextFloat() * 100;
    }
    //setando o nivel da bateria como random para o carro esportivo
    public void setNivelBateria(int nivelBateria){
        Random random = new Random();
        this.nivelBateria = random.nextInt(100);
    }
    //utilizando a interface Reabastecivel
    public void reabastecer(int quantidade){
        if(motorCombustao.getModo().equals("combustao")){
            tanqueCombustivel += quantidade;
            if(tanqueCombustivel > 100){
                tanqueCombustivel = 100;
            }
        }
    }   
    //utilizando a interface Recarregavel
    public void carregar(int quantidade){
        if(motorEletrico.getModo().equals("eletrico")){
            nivelBateria += quantidade;
            if(nivelBateria > 100){
                nivelBateria = 100;
            }
        }
    }
}