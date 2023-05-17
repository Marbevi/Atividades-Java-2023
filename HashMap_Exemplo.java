import java.util.*;

public class HashMap_Exemplo {
    public String Valor_Hash(Integer cidade) {
        String resultado = "";

        HashMap<Integer, String> total_populacao = new HashMap<Integer, String>();
        total_populacao.put(1, "Maringá");
        total_populacao.put(2, "Sarandi");
        total_populacao.put(3, "Astorga");

        for (Integer numero_cidade: total_populacao.keySet()) {
            resultado = total_populacao.get(cidade);
            if (resultado == null){
                resultado = "Cidade não cadastrada" ;
            }
        }
        System.out.println(resultado);
        return resultado;
    }

    public String Nome_cidade(Integer chave) {
        String resultado_valor_chave;
        HashMap<Integer, String> nome_cidades = new HashMap<Integer, String>();

        nome_cidades.put(1, "Maringá");
        nome_cidades.put(2, "Sarandi");
        nome_cidades.put(3, "Astorga");
        nome_cidades.put(4, "Maringá");

        resultado_valor_chave = nome_cidades.get(chave);

        return resultado_valor_chave;
    }

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    // USANDO HASHSET

    public String Exemplo_Hashset(){
        String resultado_carro ;

        HashSet<String> carros = new HashSet<String>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("BMW");
        carros.add("Mazda");

        System.out.println(carros.size());
        System.out.println(carros);

        carros.remove("BMW");

        System.out.println(carros);
        resultado_carro = String.valueOf(carros);

       for (int i = 1 ; i <= carros.size() ; i++ ){
           if (carros.contains("Ford")){
               carros.add("Novo Ford");
           }
       }
        System.out.println(carros);

        Iterator<String> atual = carros.iterator();
        System.out.println(atual.next());

        return resultado_carro ;
    }
}
