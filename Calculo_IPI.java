/*4. Escrever um algoritmo que lê:
        - a porcentagem do IPI a ser acrescido no valor das peças
        - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
        - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
        O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
        Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

 */

public class Calculo_IPI {
    public float Calculo_Ipi(int valor_peca_1,int valor_peca_2,int quantidade_peca_1,int quantidade_peca_2,float valor_ipi){

        int codigo_peca_1 = 1030;
        int codigo_peca_2 = 1031;
        int  calcula_valor_pecas;
        float resultado;

        valor_ipi = valor_ipi / 100 + 1;
        calcula_valor_pecas = (quantidade_peca_1 * valor_peca_1) + (quantidade_peca_2 * valor_peca_2);
        resultado = calcula_valor_pecas * valor_ipi;
        System.out.println("O valor á ser pago é = " + resultado + " Reais");
        return  resultado;
    }
}
