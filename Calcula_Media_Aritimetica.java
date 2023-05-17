import java.util.Arrays;

//2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
//números 4, 5 e 6. A soma das duas médias. A média das médias.
public class Calcula_Media_Aritimetica {
    int resultado;
    public Integer Calcula_Media_Aritimetica(int media_1 , int media_2) {

        media_1 = media_1 / 3;
        media_2 = media_2 / 3;
        resultado = media_1 + media_2;
        return  resultado;

    }
    public int Media_Aritimetica(int[] numeros){
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("O array não pode ser nulo ou vazio.");
        }
        int contador = 0;
        int resposta = 0 ;

        for (int i =0 ; i < numeros.length;i++){
            if (numeros[i] % 2 == 0){
                contador ++;
            }
        }
        int[] auxiliar = new int[contador];
        int j = 0 ;
        for (int i = 0 ; i < numeros.length ;i++){
            if (numeros[i] % 2 == 0){
                auxiliar[j] = numeros[i];
                j++;
            }
        }
        for (int i =0 ; i < auxiliar.length ; i++ ){
            resposta = resposta + auxiliar[i];
        }
        resposta = resposta / auxiliar.length;
        System.out.println(Arrays.toString(auxiliar));
        System.out.println(resposta);
        return resposta;
    }
}
