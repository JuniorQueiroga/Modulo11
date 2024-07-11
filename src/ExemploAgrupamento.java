import java.util.*;

// Definição da classe Produto
class Pessoa {
    String nome;
    String genero;

    // Construtor da classe Produto
    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // Getter para obter a categoria do produto
    public String getGenero() {
        return genero;
    }

    // Método toString para criar uma representação de string legível
    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}

// Classe principal ExemploAgrupamento
 public class ExemploAgrupamento {
    public static void main(String[] args) {
        // Criando uma lista de produtos
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Antonio", "Masculino"),
                new Pessoa("Cesar", "Masculino"),
                new Pessoa("Fabio", "Masculino"),
                new Pessoa("Amanda", "Feminino"),
                new Pessoa("Fernanda", "Feminino")
        );

        // Criando um mapa para agrupar produtos por categoria
        Map<String, List<Pessoa>> listaPorGenero = new HashMap<>();

        // Iterando sobre a lista de produtos
        for (Pessoa produto : pessoas) {
            String categoria = produto.getGenero();

            // Se a categoria ainda não estiver no mapa, adiciona uma nova lista
            listaPorGenero.computeIfAbsent(categoria, k -> new ArrayList<>()).add(produto);
        }

        // Imprimindo os produtos organizados por categoria
        for (Map.Entry<String, List<Pessoa>> entry : listaPorGenero.entrySet()) {
            String categoria = entry.getKey();
            List<Pessoa> listaDoGenero = entry.getValue();

            System.out.println("Genero: " + categoria);

            // Iterando sobre os produtos dentro da categoria
            for (Pessoa produto : listaDoGenero) {
                System.out.println("  - " + produto);
            }
        }
    }
}