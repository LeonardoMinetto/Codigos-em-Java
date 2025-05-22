//criando a classe veiculo que implementa interface desenhavel
public class Veiculo implements Desenhavel, Calibravel{
    private int id;
    private int distanciaPercorrida;
    private int quantidadeRodas;
    //construtor padrão pra veiculo
    public Veiculo(int id, int quantidadeRodas, int distanciaPercorrida) {
        this.id = id;
        this.distanciaPercorrida = distanciaPercorrida;
        this.quantidadeRodas = quantidadeRodas;
    }
    //getters e setters
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getDistanciaPercorrida() {
        return this.distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public int getQuantidadeRodas() {
        return this.quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }
    //metodo para mover o veiculo
    public abstract void mover(double distancia) {
        this.distanciaPercorrida += distancia;
    }
    //metodo para resetar a distancia percorrida
    public void resetarDistancia() {
        this.distanciaPercorrida = 0.0;
    }
    //metodo para desenhar o veiculo pela distancia percorrida
    public  abstract void desenhar() {
        for (int i = 0; i < distanciaPercorrida; i++) {
            System.out.print(" ");
        }
        System.out.println("X");
    }
    //metodo toString
    public String toString() {
        return "Veiculo{" + "id='" + id + ", distanciaPercorrida=" + distanciaPercorrida + ", quantidadeRodas=" + quantidadeRodas +'}';
    }
}