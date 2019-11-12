public class Usuario{

    int id;
    String psw, name, username;

    Usuario(){

    }
    Usuario( String username, String name, String psw){
        this.id = 0;
        this.username = username;
        this.name = name;
        this.psw = psw;    
        
    }
}