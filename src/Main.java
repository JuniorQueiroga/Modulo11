import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //  exemploListaSimples();
      //  exemploListaSimplesOrdemAscendente();
      //  exemploNumeros();
      //  exemploNovo();
        exemploListaSplit();
        nomeporGenero();
    }

    public static void exemploListaSplit() {
        System.out.println("* exemploListaSplit *");
        String strMain = "Antonio, Bruno, Rafael, Bruna, Cesar, Daiane";

        String[] arrSplit = strMain.split(", ");
        List<Aluno> lista = new ArrayList<>();

        for (String nome: arrSplit) {
            Aluno a = new Aluno(nome);
            lista.add(a);
        }
        Collections.sort(lista);
        for (int i=0; i < 6 ; i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void nomeporGenero() {
        // Criando uma lista de produtos
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Antonio", "Masculino"),
                new Pessoa("Cesar", "Masculino"),
                new Pessoa("Fabio", "Masculino"),
                new Pessoa("Amanda", "Feminino"),
                new Pessoa("Fernanda", "Feminino"),
                new Pessoa("Hugo", "Masculino")
        );
        System.out.println(" ");
        System.out.println("Listar nomes por genero, utilizando o MAP. ");
        // Criando um mapa para agrupar produtos por categoria
        Map<String, List<Pessoa>> listaPorGenero = new HashMap<>();

        // Iterando sobre a lista
        for (Pessoa pessoa : pessoas) {
            String categoria = pessoa.getGenero();

            // Se a categoria ainda não estiver no mapa, adicionar
            listaPorGenero.computeIfAbsent(categoria, k -> new ArrayList<>()).add(pessoa);
        }

        // Imprimindo por categoria
        for (Map.Entry<String, List<Pessoa>> entry : listaPorGenero.entrySet()) {
            String categoria = entry.getKey();
            List<Pessoa> listaDoGenero = entry.getValue();

            System.out.println("Genero: " + categoria);

            // Iterando dentro da categoria
            for (Pessoa produto : listaDoGenero) {
                System.out.println("  - " + produto);
            }
        }
    }
}



   //     String strMain = "Antonio-M, Bruno-M, Rafael-M, Bruna-F, Cesar-M, Daiane-F";
//
  //      String[] arrSplit = strMain.split(", ");
    //    List<Aluno> lista = new ArrayList<>();

      //  for (String nome: arrSplit) {
       //     Aluno a = new Aluno(nome);
     //       lista.add(a);
      //  }
     //   Collections.sort(lista);
        //for (int i=0; i < 6 ; i++) {
     //   System.out.println(lista);
     //   Map<String, Integer> separarSexo = new HashMap<>();
     //   for (String nome : lista) {
     //       separarSexo.put
      //  }

       // }



     //   System.out.println("* NomePorGenero *");
     //   Map<Integer, String> mapaNomes = new HashMap<>();
        // Masculino
     //   mapaNomes.put(1, "Antonio, Joao");
     //   mapaNomes.put(2, "Ana, Fernanda");
      //      System.out.println("Masculino: " + mapaNomes.get(1));
       //     System.out.println("Feminino: " + mapaNomes.get(2));
        //   System.out.println(lista);
            //    for (int i=0; i < arrSplit.length; i++) {
            //       System.out.println(arrSplit[i]);
//        }
//


    /**
// lista.remove (index: 0); exclui
// booleam contem = lista.contaims ("Joao"), se vai encontrar o nome

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("* exemploListaSimplesOrdemAscendente *");
        List<String> lista = new ArrayList<>();
        lista.add("Joao");
        lista.add("Maria");
        lista.add("Pedro");
        lista.add("Antonio");
        sort(lista);
        System.out.println(lista);
        System.out.println(" ");
    }
    private static void exemploListaSimples() {

        System.out.println("* exemploListaSimples *");
        List<String> lista = new ArrayList<String>();
        lista.add("Joao");
        lista.add("Maria");
        lista.add("Pedro");
        System.out.println(lista);
        System.out.println(" ");
    }
    private static void exemploNovo() {
        System.out.println("* exemploNovo *");
        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(1);
        inteiros.add(2);
        System.out.println(inteiros);
        System.out.println(" ");
    }
    private static void exemploNumeros() {
        System.out.println("* exemplonumeros *");
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista);
        System.out.println(" ");
    }

}*/