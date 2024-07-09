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

         String[] arrSplit_2 = strMain.split(", ");
        for (int i=0; i < arrSplit_2.length; i++) {
     //       System.out.println(arrSplit_2[i]);
             List<Aluno> lista = new ArrayList<Aluno>();
             Aluno a = new Aluno(arrSplit_2[i]);
            lista.add(a);
           Collections.sort(lista);
           System.out.println(lista);
     //   System.out.println(lista);
    //    for (int i=0; i < arrSplit.length; i++) {
     //       System.out.println(arrSplit[i]);
        }
//
    }
    public static void nomeporGenero() {
        System.out.println("* NomePorGenero *");
        Map<Integer, String> mapaNomes = new HashMap<>();
        // Masculino
        mapaNomes.put(1, "Antonio, Joao");
        mapaNomes.put(2, "Ana, Fernanda");
            System.out.println("Masculino: " + mapaNomes.get(1));
            System.out.println("Feminino: " + mapaNomes.get(2));
        //   System.out.println(lista);
            //    for (int i=0; i < arrSplit.length; i++) {
            //       System.out.println(arrSplit[i]);
        }
//


}

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