public class Soma_Consecutiva {
    public Integer Soma(int a, int b) {
        int valor_esperado = 0;

        for (int i = 0; i < a; i++) {
            valor_esperado = valor_esperado + b;
        }
        return valor_esperado;
    }
}
