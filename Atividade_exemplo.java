import java.util.Arrays;
import java.util.Random;

public class Atividade_exemplo {

    public void Condicoes(int numero) {
        // x = 2,3,4,5
        int x = numero;
        int y = 0;

        if (x == 2) {
            System.out.println("ok");
            y = 1;
        } else if (x == 3 || x == 4) {
            System.out.println("ok ok");
            y = 2;
        } else {
            System.out.println("ok");
            y = 1;
        }
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    public void condicoes_2(int numero) {
        // x = 2,3,4,5
        int x = numero;
        int y = 0;

        if (x == 2 || x > 4) {
            System.out.println("ok");
            y = 1;
        } else {
            System.out.println("ok ok");
            y = 2;
        }
    }
    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    public int Exercicios_Arrays() {
        int resultado = 0;
        int[] array_numeros = new int[]{2, 3, 4, 5, 6};

        for (int i = 0; i < array_numeros.length; i++) {
            resultado = resultado + array_numeros[i];
        }
        System.out.println(resultado);

        return resultado;
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    public int[] Numeros_Aleatorios_Par() {
        int[] array_numeros = new int[10];
        int conta_pares = 0;
        Random numeros = new Random();

        for (int i = 0; i < array_numeros.length; i++) {
            array_numeros[i] = numeros.nextInt(100) + 1;

            if (array_numeros[i] % 2 == 0) {
                conta_pares++;
            }
        }
        int[] resultado = new int[conta_pares];
        int j = 0;

        for (int i = 0; i < array_numeros.length; i++) {
            if (array_numeros[i] % 2 == 0) {
                resultado[j] = array_numeros[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(resultado));
        return array_numeros;
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    public int Numero_maior(int[] array_numeros) {
        int resultado = 0;
        int valor_maior = 0;
        int segundo_maior_valor = 0;

        if (array_numeros == null || array_numeros.length < 2) {
            return -1;
        }

        for (int i = 0; i < array_numeros.length; i++) {

            if (valor_maior < array_numeros[i]) {
                segundo_maior_valor = valor_maior;
                valor_maior = array_numeros[i];
            } else if (array_numeros[i] >= segundo_maior_valor && array_numeros[i] == valor_maior) {
                segundo_maior_valor = array_numeros[i];
            }
            resultado = segundo_maior_valor;
        }
        System.out.println(resultado);
        return resultado;
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    public int[] Numeros_par(int[] array_numeros) {
        int numeros_par = 0;

        for (int i = 0; i < array_numeros.length; i++) {
            if (array_numeros[i] % 2 == 0) {
                numeros_par++;
            }
        }
        int[] resultado = new int[numeros_par];
        int auxiliar = 0;
        for (int i = 0; i < array_numeros.length; i++) {
            if (array_numeros[i] % 2 == 0) {
                resultado[auxiliar] = array_numeros[i];
                auxiliar++;
            }
        }
        System.out.println(Arrays.toString(resultado));

        return resultado;
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    public int Menor_numero(int[] array_numeros) {
        int resultado = 0;
        int auxiliar = 0;
        int segundo_menor_valor = 0;

        if (array_numeros == null || array_numeros.length < 2) {
            throw new IllegalArgumentException("O array tem que ter pelo menos dois elementos");
        }

        for (int i = 0; i < array_numeros.length; i++) {   /// 3, 2, 8, 4, 60, 35, 1, 75

            for (int j = 0; j < array_numeros.length; j++) {

                if (array_numeros[i] < array_numeros[j]) {
                    auxiliar = array_numeros[i];
                    array_numeros[i] = array_numeros[j];
                    array_numeros[j] = auxiliar;
                }
            }
            segundo_menor_valor = array_numeros[1];
        }

        System.out.println(Arrays.toString(array_numeros));
        System.out.println(segundo_menor_valor);
        return resultado;
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    // ordena um array ne retorna o segundo menor numero , se o array for menor
    // que 2 elementos retorna um erro
    public int Menor_Numero_No_Array(int[] numeros) {
        if (numeros == null || numeros.length < 2) {
            throw new IllegalArgumentException("O array tem menor que dois elementos");
        }
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros[1]);
        return numeros[1];
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    public int Retorna_Numero_Sete(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("O array tem menor que dois elementos");
        }
        int resposta = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 7) {
                resposta = i;
                break;
            } else {
                resposta = -1;
            }
        }
        System.out.println(resposta);
        return resposta;
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    public int[] Retorna_Numero_Do_Indice(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("O array tem menor que dois elementos");
        }
        int[] indices = new int[numeros.length];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 7) {
                indices[contador++] = i;
            }
        }

        // Redimensionar o array para remover índices extras
        int[] resultado = Arrays.copyOf(indices, contador);

        System.out.println(Arrays.toString(resultado));
        return resultado;
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    public int[] Ordenacao_De_Array(int[] array_numeros) {
        int auxiliar;
        for (int i = 0; i < array_numeros.length; i++) {
            for (int j = 0; j < array_numeros.length; j++) {
                if (array_numeros[i] < array_numeros[j]) {
                    auxiliar = array_numeros[j];
                    array_numeros[j] = array_numeros[i];
                    array_numeros[i] = auxiliar;
                }
            }
        }
        System.out.println(Arrays.toString(array_numeros));
        return array_numeros;
    }

    public int[] Ordenacao_Sort(int[] numeros) {
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        return numeros;
    }
    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    public boolean Retorna_True(int[] numeros) {
        boolean resultado = false;
        int conta_numero_dez = 0;
        int conta_numero_vinte = 0;

        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("O array está vazio");
        }
        for (Integer auxiliar : numeros) {
            if (auxiliar == 10) {
                conta_numero_dez++;
            } else if (auxiliar == 20) {
                conta_numero_vinte++;
            }
            if (conta_numero_dez >= 2 || conta_numero_vinte >= 2) {
                resultado = true;
            }
        }
        System.out.println(resultado);
        return resultado;
    }
    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    public int Diferenca_Absoluta(int[] numeros) {
        if (numeros == null || numeros.length == 0){
            throw new IllegalArgumentException("O array está vazio");
        }
        int resultado ;
        Arrays.sort(numeros);
        int inicio = numeros[0];
        int fim = numeros[numeros.length - 1];
        resultado = fim - inicio;
        System.out.println(resultado);
        return resultado;
    }
    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    public int[] Ordem_Decrescente(int[] numeros){
        if (numeros == null || numeros.length < 1){
            throw  new IllegalArgumentException("O Array tem que ser maior que dois indices");
        }
        int fim = numeros.length - 1 ;
        Arrays.sort(numeros);
        int[] resultado = new int[numeros.length];
        for (int i = 0 ; i < numeros.length ; i++){
            resultado[i] = numeros[fim];
            fim--;
        }
        System.out.println(Arrays.toString(resultado));
        return resultado;
    }
}