public class Aluno implements Comparable<Aluno> {
    public String nome;
    public String genero;

    public Aluno(String nome) {
        this.nome = nome;
   }

    public Aluno(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;

       }

    @Override
    public String toString() {
        return this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }    

    public String getGenero() {
       return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
