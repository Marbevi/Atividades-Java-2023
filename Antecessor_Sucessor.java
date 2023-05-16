import java.util.Arrays;
public class Antecessor_Sucessor {
   public int[] Calcular(int numero){
       int sucessor = numero + 1;
       int antecessor = numero - 1 ;
       int[] resultado = new int[]{antecessor, sucessor};

       System.out.println(Arrays.toString(resultado));
       return  resultado;
   }
}
