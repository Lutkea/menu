public class Cliente extends Usuario {

    int id;
    String endereco, telefone;
    Date dataCadastro;
    Usuario usuario;

    Cliente(String userName, String nome, String psw, String endereco, String telefone){
        this.id = 0;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataCadastro = new Date();
        this.usuario = new Usuario(username, name, psw);
    }
}
