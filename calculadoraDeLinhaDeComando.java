public class calculadoraDeLinhaDeComando {
    public static void main(String[] argumentos){
        if(argumentos.length != 3){
            System.out.println("Este programa que tres argumentos sejam passados pela linha de comando.");
            System.exit(1);
        }
        int primeiroValor = Integer.parseInt(argumentos[0]);
        char operador = argumentos [ 1 ].charAt ( 0 );
        int segundoValor = Integer.parseInt( argumentos [ 2 ] ) ;
        int resultado = 0;
        switch ( operador )
        {
            case '+' : resultado = primeiroValor + segundoValor ; break ;
            case '-' : resultado = primeiroValor - segundoValor ; break ;
            case 'x' : resultado = primeiroValor * segundoValor ; break ;
            case '/' : resultado = primeiroValor / segundoValor ; break ;
        }
        for( int indice=0; indice<argumentos.length;indice++)   
            System.out.print( argumentos [indice]+" " );

        System.out.println( "="  +resultado);
    }

    public static void DizerOi() {
        System.out.println("oi")
    }
}
