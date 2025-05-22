public class VeiculoHibrido extends Veiculo implements Reabastecivel, Recarregavel{
    private motor motorCombustao;
    private motor motorEletrico;
    private float tanqueCombustivel;
    private int nivelBateria;
    public VeiculoHibrido(float cilindradaCombustao, float cilindradaEletrico, float tanqueCombustivel, int nivelBateria){
        motorCombustao = new motor(cilindradaCombustao, "combustao");
        motorEletrico = new motor(cilindradaEletrico, "eletrico");
        this.tanqueCombustivel = tanqueCombustivel;
        this.nivelBateria = nivelBateria;
    }
    public motor getMotorCombustao(){
        return motorCombustao;
    }
    public motor getMotorEletrico(){
        return motorEletrico;
    }
    //utilizando a interface Reabastecivel
    @Override
    public void reabastecer(int quantidade){
        if(motorCombustao.getModo().equals("combustao")){
            tanqueCombustivel += quantidade;
        }
    }
    //utilizando a interface Recarregavel
    @Override
    public void carregar(int quantidade){
        if(motorEletrico.getModo().equals("eletrico")){
            nivelBateria += quantidade;
        }
    }
    //metodo toString para imprimir os dados do veiculo hibrido
    public String toString(){
        return "Cilindrada do motor a combustao: " + motorCombustao.getCilindrada() + "\n" +
               "Cilindrada do motor eletrico: " + motorEletrico.getCilindrada() + "\n" +
               "Tanque de combustivel: " + tanqueCombustivel + "\n" +
               "Nivel da bateria: " + nivelBateria;
    }
}