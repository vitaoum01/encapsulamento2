public class Principal {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Miguel Renato Silva Campos", 17, "Migs vulgo MM", "Miguelzao5434");

        System.out.println("\n" + "Nome do Usuário: " + usuario.getNome());
        System.out.println("Idade do Usuário: " + usuario.getIdade());
        System.out.println("UserName do Usuário: " + usuario.getUsername());
        usuario.setSenha("Etec123");

        if(usuario.verificaSenha("Etec123")){
            System.out.println("senha válida");
        } else{
            System.out.println("senha inválida!");
        }
    }
}