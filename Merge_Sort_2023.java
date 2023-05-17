public class Merge_Sort_2023 {
    public int[] Merge_2023(int[] numeros) {

        int[] auxiliar = new int[numeros.length];

        Function_Merge(numeros, auxiliar, 0, numeros.length - 1);

        return numeros;
    }

    public static void Function_Merge(int[] numeros, int[] auxiliar, int inicio, int fim) {

        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            Function_Merge(numeros, auxiliar, inicio, meio);
            Function_Merge(numeros, auxiliar, meio + 1, fim);
            Unir_Array(numeros, auxiliar, inicio, meio, fim);
        }
    }

    public static void Unir_Array(int[] numeros, int[] auxiliar, int inicio, int meio_do_array, int fim) {
        for (int i = inicio; i <= fim; i++) {
            auxiliar[i] = numeros[i];
        }
        int lado_esquerdo = inicio, lado_direito = meio_do_array + 1;

        for (int i = inicio; i <= fim; i++) {

            if (lado_esquerdo > meio_do_array) {
                numeros[i] = auxiliar[lado_direito];
                lado_direito++;
            } else if (lado_direito > fim || auxiliar[lado_esquerdo] < auxiliar[lado_direito]) {
                numeros[i] = auxiliar[lado_esquerdo];
                lado_esquerdo++;
            } else {
                numeros[i] = auxiliar[lado_direito];
                lado_direito++;
            }
        }
    }
}

