public class Merge_Sort_While {

    public int[] Merge_Sorte_While(int[] numeros){

        int[] auxiliar = new int[numeros.length];
        int inicio = 0;
        int fim = numeros.length -1 ;
        int meio = (inicio + fim) / 2 ;

        for (int i = inicio ; i <= fim ; i++){
            auxiliar[i] = numeros[i];
        }
        int esquerda = inicio;
        int direita = meio + 1 ;
        int auxiliar_2 = inicio;

        while (esquerda <= meio && direita <= fim){

            if (auxiliar[esquerda] <= auxiliar[direita]){
                numeros[auxiliar_2] = auxiliar[esquerda];
                esquerda++ ;
            } else {
                numeros[auxiliar_2] = auxiliar[direita];
                direita++ ;
            }
            auxiliar_2++;
        }

        while (esquerda <= meio){
            numeros[auxiliar_2] = auxiliar[esquerda];
            auxiliar_2++;
            esquerda++;
        }

        return numeros;
    }
}
