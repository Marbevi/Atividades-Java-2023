import java.util.Arrays;
import java.util.HashMap;

public class Elemento_Sem_Par { // corrigido , só recebe verdadeiro se contem par e indice for diferente
    public int Elemento_Sozinho(int[] array_numeros) {
        int resultado = 0;
        boolean existe_par;

        for (int i = 0; i < array_numeros.length; i++) {

            existe_par = false;

            for (int j = 0; j < array_numeros.length; j++) {

                if (i != j) {

                    if (array_numeros[i] == array_numeros[j]) {
                        existe_par = true;
                    }
                }
            }
            if (!existe_par) {
                resultado = array_numeros[i];
            }
        }
        System.out.println("O número que não tem par no array " + Arrays.toString(array_numeros) + " é o numero : " + resultado);
        return resultado;
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// ordena o array e encontra o numero que não tem par , USANDO MERGE SORT
    public int Elemento_So(int[] array_numeros) {
        int[] array_auxiliar = new int[array_numeros.length];
        int resultado = 0;
        int auxiliar1 = 0;

        Merge(array_numeros, array_auxiliar, 0, array_numeros.length - 1);

        for (int i = 0; i < array_numeros.length; i++) {

            if (array_numeros[i] != array_numeros[auxiliar1]) {
                resultado = array_numeros[i];
                auxiliar1 = i + 1;
            }
        }
        return resultado;
    }

    private static void Merge(int[] arrayNumeros, int[] auxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            Merge(arrayNumeros, auxiliar, 0, meio);
            Merge(arrayNumeros, auxiliar, meio + 1, fim);
            Ordenar(arrayNumeros, auxiliar, inicio, meio, fim);

        }
    }

    private static void Ordenar(int[] array_numeros, int[] array_auxiliar, int inicio, int meio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            array_auxiliar[i] = array_numeros[i];
        }

        int lado_esquerdo = inicio;
        int lado_direito = meio + 1;

        for (int i = inicio; i <= fim; i++) {

            if (lado_esquerdo > meio) {
                array_numeros[i] = array_auxiliar[lado_direito];
                lado_direito++;
            } else if (lado_direito > fim || array_auxiliar[lado_esquerdo] < array_auxiliar[lado_direito]) {
                array_numeros[i] = array_auxiliar[lado_esquerdo];
                lado_esquerdo++;
            } else {
                array_numeros[i] = array_auxiliar[lado_direito];
                lado_direito++;
            }
        }
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// transforma em (menos um -1) os numeros que tem seu par, E RETORNA O NUMERO QUE NÃO FORMA PAR
    // corrigido , usando break e o J recebe I + 1
    public int Index_Sem_Par(int[] array_numeros) {
        int resultado = 0;

        for (int i = 0; i < array_numeros.length; i++) {
            if (array_numeros[i] != -1) {
                for (int j = i + 1; j < array_numeros.length; j++) {
                    if (array_numeros[i] == array_numeros[j]) {
                        array_numeros[i] = -1;
                        array_numeros[j] = -1;
                        break;
                    }
                }
                if (array_numeros[i] != -1) {
                    resultado = array_numeros[i];
                    break;
                }
            }
        }
        System.out.println("O numero que não tem par no array : " + Arrays.toString(array_numeros) + "é : " + resultado);
        return resultado;
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    // ORDENA O ARRAY , E DEPOIS RETORNA O INDICE QUE NÃO TEM PAR , USANDO BUBLE SORT
    public int Ordenar(int[] array_numeros) {
        int index_temporario;
        int resultado = 0;
        int auxiliar = 0;

        for (int i = 0; i < array_numeros.length; i++) {

            for (int j = i + 1; j < array_numeros.length - 1; j++) { // ordena o array

                if (array_numeros[j] < array_numeros[i]) {
                    index_temporario = array_numeros[j];
                    array_numeros[j] = array_numeros[i];
                    array_numeros[i] = index_temporario;
                }
            }
        }
        System.out.println(Arrays.toString(array_numeros));
        for (int i = 0; i < array_numeros.length; i++) {

            if (array_numeros[i] != array_numeros[auxiliar]) {
                resultado = array_numeros[i];
                auxiliar = i + 1;
            }
        }
        return resultado;
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    // retorna numero sem par usando HASHMAP
    public int Numero_Sem_Par(int[] array_numeros) {
        int resultado = 0, valor_da_chave = 0; // { 9, 3, 9, 3, 9, 7, 9 }

        HashMap<Integer, Integer> numero_com_par = new HashMap<Integer, Integer>();

        for (int i = 0; i < array_numeros.length; i++) {

            if (numero_com_par.containsKey(array_numeros[i])) {
                valor_da_chave = numero_com_par.get(array_numeros[i]);

                if (valor_da_chave < 2 ) {
                    numero_com_par.put(array_numeros[i], valor_da_chave + 1);
                }
            } else {
                numero_com_par.put(array_numeros[i], 1);
            }
        }
        for (Integer recebe_chave : numero_com_par.keySet()) {

            int conta_valor_chave = numero_com_par.get(recebe_chave);

            if (conta_valor_chave % 2 != 0) {
                resultado = recebe_chave;
            }
        }
        System.out.println(numero_com_par);
        System.out.println(valor_da_chave);
        System.out.println("No array : " + Arrays.toString(array_numeros) + " o valor que não tem par é : " + resultado);
        return resultado;
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    public int Hash_Sozinho(int[] numeros){
        int resultado = 0 , valor_da_chave = 0, temporario ;

        HashMap<Integer, Integer> numero_com_par = new HashMap<Integer, Integer>();

        for (int i  =0 ; i < numeros.length;i++){

            if (numero_com_par.containsKey(numeros[i])){
                valor_da_chave = numero_com_par.get(numeros[i]);

                numero_com_par.put(numeros[i] , valor_da_chave + 1);

            }else {
                numero_com_par.put(numeros[i], 1);
            }
        }

        for (Integer keys : numero_com_par.keySet()) {

            int valor_chave = numero_com_par.get(keys);

            if (valor_chave % 2 != 0){
                resultado = numero_com_par.get(keys);
                System.out.println(keys);
            }
        }
        System.out.println(numero_com_par);

        System.out.println(resultado);
        return resultado;
    }
    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    public int NumeroSem_Par(int[] array_numeros) {
        int resultado = 0, valor_da_chave = 0; // { 9, 3, 9, 3, 9, 7, 9 }

        HashMap<Integer, Integer> numero_com_par = new HashMap<Integer, Integer>();

        for (int i = 0; i < array_numeros.length; i++) {

            if (numero_com_par.containsKey(array_numeros[i])) {// se já tem a chave com esse numero excluir a chave
                numero_com_par.remove(array_numeros[i]);
            } else {
                numero_com_par.put(array_numeros[i], 1);
            }
        }
        for (Integer recebe_chave : numero_com_par.keySet()) {
            resultado = recebe_chave;
        }
        System.out.println(numero_com_par);
        System.out.println("No array : " + Arrays.toString(array_numeros) + " o valor que não tem par é : " + resultado);
        return resultado;
    }

}