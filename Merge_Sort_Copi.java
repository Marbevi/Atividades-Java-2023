import java.util.Arrays;

public class Merge_Sort_Copi {
    public int[] Start_Merge_Sort(int[] array_numeros) {

        int[] array_auxiliar = new int[array_numeros.length];  /* serve para ter o mesmo tamanho do array que passarmos
        por parametro */

        Funcao_Merge_Sort(array_numeros, array_auxiliar, 0, array_numeros.length - 1);

        return array_numeros;
    }

    /* logo abaixo está o metodo do merge sorte, ele usa a recursividade , que significa que ele chama o metodo dentro
    dele mesmo .
     */
    private static void Funcao_Merge_Sort(int[] array_numeros, int[] array_auxiliar, int inicio, int fim) {
        /* essa função é responsável pela divisão do array ,
           O INICIO DO ARRAY É ZERO E O FIM E O TAMANHO DO ARRAY
           SERVE PARA DIVIDIR O ARRAY ATÉ QUE A CONDIÇÃO IF NÃO SEJA VERDADEIRA
         */
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            /* AS FUNÇÕES SÃO CHAMADAS DENTRO DESTA CONDIÇÃO IF  */

            Funcao_Merge_Sort(array_numeros, array_auxiliar, inicio, meio);// 1° CHAMADA ,array da esquerda ATÉ NÃO SATISFAZER MAIS O IF
            Funcao_Merge_Sort(array_numeros, array_auxiliar, meio + 1, fim);// 2° CHAMADA , array da direita ATÉ NÃO SATISFAZER MAIS O IF
            Intercalar(array_numeros, array_auxiliar, inicio, meio, fim); // aqui é chamado o metodo intercalar
        }
    }

    /* aqui em baixo estão os atributos do metodo INTERCALAR, este metodo intercalar serve para mesclar os dois arrays que foraM divididos
     se um dos lados do array chegar ao fim o restante que faltar de valores do outro lado é copiado para o final do array .
      os valores dos dois arrays são comparados e o ARRAY PRINCIPAL vai recebendo o menor valor entre eles até acabar os indices */
    private static void Intercalar(int[] array_numeros, int[] array_auxiliar, int inicio_do_array, int meio_do_array, int fim_do_array) {

        /* ESTE LAÇO É RESPONSAVEL POR FAZER O ARRAY AUXILIAR RECEBER CADA VALOR DO ARRAY PRINCIPAL , E O ARRAY AUXILIAR
        VAI SERVIR PARA AS COMPARAÇÕES ENTRE OS DINDICES QUE FORAM SEPARADOS E AGORA SERÃO JUNTADOS NOVAMENTE
        */
        for (int i = inicio_do_array; i <= fim_do_array; i++) {
            array_auxiliar[i] = array_numeros[i];
        }

        int esquerda_do_array = inicio_do_array; // serve para comparar na primeira metade do array
        int direita_do_array = meio_do_array + 1; // serve para comparar a segunda metade do array

        /* este LAÇO SERVE PARA FAZER AS COMPARAÇÕES DA CONDIÇÕES DENTRO DELE ATÉ A ULTIMA POSIÇÃO
        * DO ARRAY  */

        for (int i = inicio_do_array; i <= fim_do_array; i++) {

            /* aqui é feita a comparação entre os dois arrays , e se algum dos dois arrays chegar até o fim, os valores
             que faltar é copiado para o final do ARRAY PRINCIPAL */

            // se chegar até o fim do array da esquerda o array recebe os valores que faltar da direita
            if (esquerda_do_array > meio_do_array) {
                array_numeros[i] = array_auxiliar[direita_do_array++];
            }
            // se não , se  chegar até o fim do array da direita ,  o array recebe os valores que faltar da esquerda
            else if (direita_do_array > fim_do_array) {
                array_numeros[i] = array_auxiliar[esquerda_do_array++];
            }
            /* se o valor da posição do lado esquerdo for menor que a posição do lado direito ,
            o ARRAY PRINCIPAL recebe na posição I o valor da esquerda */
            else if (array_auxiliar[esquerda_do_array] < array_auxiliar[direita_do_array]) {
                array_numeros[i] = array_auxiliar[esquerda_do_array++];
            }
            /* se o valor da posição do lado direito for menor que a posição do lado esquerdo ,
            o ARRAY PRINCIPAL recebe na posição I o valor da direito */
            else {
                array_numeros[i] = array_auxiliar[direita_do_array++];
            }
        }
    }
}
