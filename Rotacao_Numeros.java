import java.util.Arrays;

public class Rotacao_Numeros {

    public int[] Rotacao(int[] array_numeros, int quantidade_rotacao) {
        int fim;
        int j;
        if (array_numeros.length <= 1) {
            System.out.println("FIM , o Array é vazio ");
            return array_numeros ;
        }
            for (int i = 0; i < quantidade_rotacao; i++) {
                fim = array_numeros[array_numeros.length - 1];

                for (j = array_numeros.length - 1; j > 0; j--) {
                    array_numeros[j] = array_numeros[j - 1];
                }
                array_numeros[j] = fim;
            }
            return array_numeros;
    }

    //////////////// XXXXXXXXXXXXXXXX CODIGO DA INTERNET XXXXXXXXXXXXXXXXXX ///////////////////////////
    public int[] Rotacao_Numeros(int[] lista_numeros, int numero_rotacao) {
        System.out.println("Array de numeros: " + Arrays.toString(lista_numeros));
        System.out.println("Quantidade de rotação: " + numero_rotacao);
        int inicio = 0;
        for (int i = 0; i < numero_rotacao; i++) {
            inicio = lista_numeros[0]; // armazena o valor do indice zero
            int j;
            for (j = 0; j < lista_numeros.length - 1; j++) { // percorre até o penúltimo indice
                lista_numeros[j] = lista_numeros[j + 1]; // cada indice recebe o valor do indice da frente dele
            }
            lista_numeros[j] = inicio; // o ultimo indice recebe o valor que ficou gravado na variavel inicio
        }
        return lista_numeros;
    }
}
