import java.util.Random;
//classe motor
public class motor extends VeiculoHibrido{
    private int giroAtual = 0;//atributo giroAtual inicializado com 0 pq ta parado inicialmente
    private float cilindrada;
    private String modo;
    private float tanqueCombustivel;
    private float nivelBateria;
    private static final float fatorConsumoCombustao = 0.001;
    private static final float fatorConsumoEletrico = 0.0001;
    public int motor(float cilindrada){
        this.cilindrada = cilindrada;
        this.giroAtual = 0;
        //randomizando o tanque de combustivel e nivel da bateria
        Random random = new Random();
        if(this.modo == 'combustao')
            this.tanqueCombustivel = random.nextFloat() * 100;
        else
            this.nivelBateria = random.nextFloat() * 100;
    }
    //metodos getters e setters 
    public int getGiroAtual(){
        return this.giroAtual;
    }

    public void setGiroAtual(int giroAtual){
        this.giroAtual = giroAtual;
    }   
     public float getCilindrada(){
        return this.cilindrada;
    }
    public void setCilindrada(float cilindrada){
        this.cilindrada = cilindrada;
    }
    public String getModo(){
        return this.modo;
    }
    public void setModo(String modo){
        this.modo = modo;
    }
    public float getTanqueCombustivel(){
        return this.tanqueCombustivel;
    }
    public void setTanqueCombustivel(float tanqueCombustivel){
        this.tanqueCombustivel = tanqueCombustivel;
    }
    public float getNivelBateria(){
        return this.nivelBateria;
    }
    public void setNivelBateria(float nivelBateria){
        this.nivelBateria = nivelBateria;
    }
    //metodo para acelerar o motor
    public void acelerar(int intensidade){
        giroAtual += intensidade;
    }
    //metodo para desacelerar o motor
    public void desacelerar(int intensidade){
        giroAtual -= intensidade;
        if(giroAtual < 0){
            giroAtual = 0;
        }
    }
    //metodo para parar o motor
    public void parar(){
        this.giroAtual = 0;
    }

    //metodo para consumir combustivel
    public void consumoCombustivel(){
        if(modo.equals("combustao")){
            tanqueCombustivel -= fatorConsumoCombustao * giroAtual;
            if(tanqueCombustivel < 0){
                tanqueCombustivel = 0;
            }
        }
    }
    //metodo para consumir energia
    public void consumoEnergia(){
        if(modo.equals("eletrico")){
            nivelBateria -= fatorConsumoEletrico * giroAtual;
            if(nivelBateria < 0){
                nivelBateria = 0;
            }
        }
    }
    //metodo toString
    public String toString(){
        return "Cilindrada: " + this.cilindrada + " Giro Atual: " + this.giroAtual + " Modo: " + this.modo + " Tanque de Combustivel: " + this.tanqueCombustivel + " Nivel da Bateria: " + this.nivelBateria;
    }

}