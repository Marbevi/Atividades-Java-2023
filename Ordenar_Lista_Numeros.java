import java.util.Arrays;
public class Ordenar_Lista_Numeros {
    public int[] lista_ordenada(int[] lista_numeros) {

        int numero_temporario = 0;

        for (int i = 0; i < lista_numeros.length; i++) { // este laço percorre o tamanho do array que veio por
                                                         // parametro começando em 0

            for (int j = 1; j < lista_numeros.length; j++) { // este laço percorre o tamanho do array que veio por
                                                             // parametro começando em 1

                if (lista_numeros[j] < lista_numeros[j - 1]) { // aqui é feita a comparação entre o segundo indice com o primeiro
                    numero_temporario = lista_numeros[j - 1];
                    lista_numeros[j - 1] = lista_numeros[j];
                    lista_numeros[j] = numero_temporario;
                }
            }
        }
        System.out.println(Arrays.toString(Arrays.stream(lista_numeros).toArray()));
        return lista_numeros;
    }
}
