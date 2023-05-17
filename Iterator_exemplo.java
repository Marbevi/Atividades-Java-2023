import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_exemplo {

    public String Exemplo_Iterator(){
        String resultado ;

        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Mazda");

        Iterator<String> atual = carros.iterator();
        resultado = atual.next();
        System.out.println(atual.next());
        return resultado;

    }
}
