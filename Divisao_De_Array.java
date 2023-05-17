public class Divisao_De_Array {
    // Subtrair a primeira parte do array pela segunda parte e mostrar o menor valor
    public int Diferenca_Menor_Valor(int[] numeros) { // numeros = { 3, 1, 2, 4, 3, 5 } resultado tem que ser 2
        int resultado = 99999, temporario;
        int primeira_parte = 0, segunda_parte;

        for (int i = 0; i < numeros.length - 1; i++) {
            primeira_parte = primeira_parte + numeros[i];
            segunda_parte = 0;

            for (int j = i + 1; j < numeros.length; j++) {

                segunda_parte = segunda_parte + numeros[j];
            }
            temporario = primeira_parte - segunda_parte;

            if (temporario < 0) {
                temporario = temporario * -1;
            }
            if (temporario <= resultado) {
                resultado = temporario;
            }
        }
        System.out.println(resultado);
        return resultado;
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    // Subtrair a primeira parte do array pela segunda parte e mostrar o menor valor
    public int Menor_valor(int[] numeros) {
        int resultado = 999999, diferenca;
        int primeira_parte = numeros[0], segunda_parte = 0;

        for (int i = 0; i < numeros.length - 1; i++) {

            segunda_parte = segunda_parte + numeros[i + 1];
        }
        for (int j = 0; j < numeros.length - 1; j++) {

            diferenca = primeira_parte - segunda_parte;

            if (diferenca < 0) {
                diferenca = diferenca * -1;
            }

            if (diferenca < resultado) {
                resultado = diferenca;
            }
            primeira_parte = primeira_parte + numeros[j + 1];
            segunda_parte = segunda_parte - numeros[j + 1];
        }
        System.out.println(resultado);
        return resultado;
    }
}
