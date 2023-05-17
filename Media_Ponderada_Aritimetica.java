
/*4. Um usuário deseja um algoritmo onde possa escolher que tipo de média deseja
        calcular a partir de 3 notas. Faça um algoritmo que leia as notas, a opção escolhida
        pelo usuário e calcule a média.
        1 -aritmética
        2 -ponderada (pesos: 3,3,4) */
public class Media_Ponderada_Aritimetica {
    public int Media_Ponderada(int nota1,int nota2,int nota3,int media_escolhida,int peso1,int peso2,int peso3){
        int calculo_ponderada =0;
        int calculo_aritimetica =0 ;
        int calculo_peso;
        int resposta =0 ;

        if (media_escolhida == 1){
            calculo_aritimetica = nota1 + nota2 + nota3 ;
            calculo_aritimetica = calculo_aritimetica / 3;
            resposta = calculo_aritimetica;
        }
        if (media_escolhida == 2 ){
            calculo_ponderada = (peso1 * nota1) + (peso2 * nota2) + (peso3 * nota3);
            calculo_peso = peso1+peso2+peso3;
            calculo_ponderada = calculo_ponderada / calculo_peso;
            resposta = calculo_ponderada;
        }
        return resposta;
    }
}
