//criar a classe simulador com um array que vai suportar 10 veiculos
public class Simulador implements Desenhavel{
    private Veiculo[] veiculos = new Veiculo[10];
    private int quantidadeVeiculos = 0;
    //criar um metodo para adicionar veiculos ao array
    public void adicionarVeiculo(Veiculo veiculo){
        if(quantidadeVeiculos < 10){
            veiculos[quantidadeVeiculos] = veiculo;
            quantidadeVeiculos++;
        }
    }
    //criar um metodo para mover todos os veiculos
    public void moverVeiculos(double distancia){
        for(int i = 0; i < quantidadeVeiculos; i++){
            veiculos[i].mover(distancia);
        }

    }
    //criando um metodo string para mover os veiculos e desenhar
    public String moverDesenharVeiculos(double distancia){
        String desenho = "";
        for(int i = 0; i < quantidadeVeiculos; i++){
            veiculos[i].mover(distancia);
            desenho += veiculos[i].desenhar();
        }
        return desenho;
    }
    //criar um metodo para remover um veiculo do array
    public void removerVeiculo(int id){
        for(int i = 0; i < quantidadeVeiculos; i++){
            if(veiculos[i].getId() == id){
                veiculos[i] = veiculos[quantidadeVeiculos - 1];
                quantidadeVeiculos--;
            }
        }
    }   
}
