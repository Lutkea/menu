import java.util.Scanner;

import jdk.nashorn.internal.codegen.FunctionSignature;

public class Menu{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Menu");
        int menu;
        double i,j,total;
         do{
        
            System.out.println("Escolha uma função");
            System.out.println(" 1 - Cadastrar Cliente");
            System.out.println(" 2 - Cadastrar Funcionário");
            System.out.println(" 3 - Cadastrar Venda");
            System.out.println(" 4 - Exibir Funcionários");
            System.out.println(" 5 - Exibir Clientes");
            System.out.println(" 6 - Exibir Compra Cliente");
            System.out.println(" 7 - Exibir Venda Funcionário");
            System.out.println(" 8 - Validar Acesso");
            System.out.println(" 9 - Encerrar ");
            menu = entrada.nextInt();
        

            switch(menu){
                case 1 :
                    System.out.println("1 - Cadastrar Cliente");
                    System.out.println("Insira o Username");
                    String userName = entrada.next();
                    System.out.println("Insira uma senha");
                    String psw = entrada.next();
                    System.out.println("Insira seu nome");
                    String nome = entrada.next();
                    System.out.println("Insira seu endereço");
                    String endereco = entrada.next();
                    System.out.println("Insira seu telefone");
                    String telefone = entrada.next();
                    Cliente cliente = new Cliente(userName, psw, nome, endereco, telefone);
                    break;
                case 2 :
                    System.out.println("2 - Cadastrar Funcionário");
                    System.out.println("Insira o Username");
                    String userName = entrada.next();
                    System.out.println("Insira sua senha");
                    String psw = entrada.next();
                    System.out.println("Insira seu nome");
                    String nome = entrada.next();
                    System.out.println("Insira o salário");
                    Double salario = entrada.nextDouble();
                    System.out.println("Insira o banco");
                    String banco = entrada.next();
                    Funcionario funcionario = new Funcionario(userName, nome, psw, salario, banco);
                case 3 :
                    System.out.println("3 - Cadastrar Venda");
                    System.out.println("Insira o ID do produto");
                    int id = entrada.nextInt();
                    System.out.println("Insira a quantidade");
                    int quantidade = entrada.next();
                    
                    break;
                
                case 4 :
                    System.out.println("4 - Exibir Funcionário");
                    System.out.println("O resultado da divisão é = "+total);
                    break;
                

                    
                case 5 :
                System.exit(0);
                default :
                System.out.println("O valor informado é inválido");
                break;
                }
        }while(menu>=0);entrada.close();
    }
}