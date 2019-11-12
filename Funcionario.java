import java.util.Date;

public class Funcionario extends Usuario{

    int id;
    double salario;
    String banco;
    Date dataAdmissao;
    
    Funcionario(String userName, String nome, String psw, double salario, String banco){
        this.is = 0;
        this.salario = salario;
        this.banco = banco;
        this.dataAdmissao = new Date();
        this.usuario = new Usuario(username, name, psw);
    }
}