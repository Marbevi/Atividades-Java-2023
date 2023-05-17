public class Excessao_Exemplo {

    public void Tratar_excessao(){

        String resposta = "" ;

        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[10]);
        } catch (Exception e) {
            resposta = "Algo errado no código";
            System.out.println(resposta);
        }
    }

    public void Exemplo_Finally(){
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[10]);
        } catch (Exception e) {
            System.out.println("Algo errado no código");
        } finally {
            System.out.println("Pegamos o erro mas finalizamos ");
        }
    }

    static void Exemplo_Throw(int idade) {
        if (idade < 18) {
            throw new ArithmeticException("Acesso negado - Você deve ter pelo menos 18 anos.");
        }
        else {
            System.out.println("Acesso concedido - Você tem idade suficiente!");
        }
    }

    public static void main(String[] args) {
        Exemplo_Throw(15);
        Exemplo_Throw(20);
    }


}
