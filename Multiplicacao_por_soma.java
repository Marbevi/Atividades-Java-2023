/* 7. Crie um algoritmo que recebe 2 números e multiplica o num1 pelo num2 através de
        somas repetidas. (ex: 2 e 3 = 2 * 3 que é igual á 6 sendo o mesmo que 2 + 2 + 2) */

public class Multiplicacao_por_soma {
    public int Multiplicacao_por_Soma(int numero_1, int numero_2) {
        int resultado = 0;
        for (int i = 0; i < numero_2; i++) {
            resultado = resultado + numero_1;
        }
        return resultado;
    }
}
