public class Usuario {

    private String nome;
    private int idade;
    private String username;
    private String senha;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSenha() {
        return senha;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public Usuario(String nome, int idade, String username, String senha){
        this.nome = nome;
        this.idade = idade;
        this.username = username;
        this.senha = senha;
    }

    //Usuario usuario = new Usuario("Joao", 17, "joaogabris", "Sxe1542");
    public Usuario(){

    }

    public boolean verificaSenha(String senha){
        return this.senha.equals(senha);
    }

    public void alterarSenha(String novaSenha){
        this.senha = novaSenha; 
    }
}