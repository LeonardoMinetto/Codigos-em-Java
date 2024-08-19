porquinhoAzart porquinho(){
    int numP=0;
    int qtdJogadas=0;
    while(numP<300){
        qtdJogadas++;
        dados[0].roll();
        System.out.println(dados[0].getSideUp());
        dados[1].roll();
        System.out.println(dados[1].getSideUp());
        int dado1=dados[0].getSideUp();
        int dado2=dados[1].getSideUp();
        //regras do jogo
        if(dado1==dado2){
            if(dado1 == 1)
                numP += 30;
            else
                numP = (dado1*dado2)*2;
        
        }else
            numP += dado1 * dado2;
        System.out.println("Quantidade atual de pontos:"+ numP);//imprime a quantidade de pontos após cada rolagem

    }
    return qtdJogadas;
}