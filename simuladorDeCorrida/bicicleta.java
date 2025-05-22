public class bicicleta extends Veiculo{
    public bicicleta(int id, int quantidadeRodas, int distanciaPercorrida){
        super(id, 2, distanciaPercorrida);
    }
    public void pedalar(double distanciaPercorrida){
        mover(distanciaPercorrida);
    }
}