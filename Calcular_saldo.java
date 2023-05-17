

// 3. Informar um saldo e imprimir o saldo com reajuste de 1%.

public class Calcular_saldo {
    public float Calcular_Saldo(float valor_usuario) {
        float resultado_reajuste;
        float resultado;

        resultado_reajuste = valor_usuario / 100;
        resultado = valor_usuario + resultado_reajuste;
        System.out.println(resultado);

        return resultado;
    }
}
