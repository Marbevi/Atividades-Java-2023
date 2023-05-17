
/*1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
     mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
     (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/

public class Calcular_Idade {

    public Integer Calcular_Idade(int idade, int meses_de_vida, int dias_de_vida) {

        int total_dias;

        idade = idade * 365;
        meses_de_vida = meses_de_vida * 30;
        total_dias = idade + meses_de_vida + dias_de_vida;
        System.out.println("Você tem " + total_dias + " dias de vida");
        return total_dias;
    }
}
