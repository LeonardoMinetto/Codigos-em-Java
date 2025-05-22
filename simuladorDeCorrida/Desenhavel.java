//criando a interface de desenhavel
public interface Desenhavel{
    //metodo para desenhar a bicicleta com os dois pneus calibrados 
    public String desenharBicicleta(){
        String[] bike= new String[3];
        bike[0]="   __o\n";
        bike[1]=" _`\\<,_\n";
        bike[2]="(*)/ (*)\n\n";
    }
}   