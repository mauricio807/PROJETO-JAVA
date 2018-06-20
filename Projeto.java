
package projeto;

import java.util.ArrayList;
import java.util.Scanner;


public class Projeto{
  public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);

 System.out.println("Menu\n\n"
 +"1. Cadastrar Distribuidora\n"
 +"2. Cadastrar Funcionario\n"
 +"3. Cadastrar Produto\n"
 
 +"4. Sair\n");
 
String menu=entrada.nextLine();
 switch (menu){
     case("1"):
         System.out.println("Menu\n"
 +"Cadastro de Distribuidora\n\n"
 +"1. Cadastrar Distribuidora\n"
 +"2. Alterar Dados da Distribuidora\n"
 +"3. Sair");
         String opcaod;
          opcaod=entrada.nextLine();
        switch(opcaod){
                case ("1"):
            ArrayList<Distribuidora> al = new ArrayList();        
           Distribuidora n=new Distribuidora();   
           Distribuidora cn=new Distribuidora();
           Distribuidora cep=new Distribuidora();
           Distribuidora locat=new Distribuidora();
          System.out.println("Informe o nome da Distriuidora");      
     String name= entrada.nextLine();
      n.setNomed(name);
      //n.statusname();
      
      System.out.println("Informe o CNPJ da Distriuidora");
      String namecnpj= entrada.nextLine();
      cn.setCnpj(namecnpj);
     // cn.statuscnpj();
      
      System.out.println("Informe a Localização da Distriuidora");
      System.out.println("informe o Cep");
      String ncep= entrada.nextLine();
      cep.setCep(ncep);
     // cep.statuscep();
      
      System.out.println("Informe o Endereço");
      String endereço = entrada.nextLine();
      locat.setLocate(endereço);
      //locat.statuslocate();
      
      
      
                    al.add(n);
                    al.add(cn);
                    al.add(cep);
                    al.add(locat);
                   for (int i = 0; 1 < al.size(); i++){
                    System.out.println("dados(nome) " + al.get(i).getNomed());
                    System.out.println("dados(Cnpj) " + al.get(i).getCnpj());
                    System.out.println("dados(cep)" + al.get(i).getCep());
                    System.out.println("dados (endereço)" + al.get(i).getLocate());
                    
                                       }
                                          
                case ("2"): {
                    System.out.println("Informe o nome da Distriuidora que deseja\n alterar os dados");
                    
                }
                  case ("3"): {
                    break; 
                    }    
        
                
                    }
     case ("2"): {
    
                  ArrayList<Distribuidora> ff = new ArrayList();           
           Funcionario_D namefun=new Funcionario_D();   
           Funcionario_D cpffun=new Funcionario_D();
           Funcionario_D datefun=new Funcionario_D();
           Funcionario_D salario=new Funcionario_D();
           Funcionario_D enderecof=new Funcionario_D();
         System.out.println("Informe o nome do funcionario");
         String namef= entrada.nextLine();
      namefun.setNomef(namef);
      //n.statusname();
      
      System.out.println("Informe o CNPJ da Distriuidora");
      String namecnpj= entrada.nextLine();
     cpffun.setCpfuncio(namecnpj);
    
      
      System.out.println("Informe a Data de nascimento do funcionario");
            String datef= entrada.nextLine();
      datefun.setDatanascf(datef);
     
      
      System.out.println("Informe o salario do funcionario");
      float salariof = entrada.nextFloat();
      salario.setSalariof(salariof);
      
   System.out.println("Informe o Endereço");
      String endereçof = entrada.nextLine();
      enderecof.setEnderecof(endereçof);
         
     }
 }
 case ("3"): {
 System.out.println("\n\n"
 +"Cadastro de Produto\n\n"
 +"1. Cadastrar Produto\n"
 +"2. Consultar Produto\n"
 +"3. Alterar Produto\n"
 +"4. Remover Produto\n"
 +"5. Sair");
 
      System.out.println("Escolha a opção:");
      int opcao = entrada.nextInt();
      switch (opcao){
          
          case 1:
      
          CadastrarProduto cadastro = new CadastrarProduto();
          CadastrarProduto cadt = new CadastrarProduto();
          CadastrarProduto cadvalor = new CadastrarProduto();
          CadastrarProduto quantt = new CadastrarProduto();
          System.out.println("Digite o código do produto"); 
                String ncodigo = entrada.nextLine();
                         cadastro.setCodigo(ncodigo);
                         cadastro.statuscodigo();
                         
                         System.out.println("Digite o nome do produto:");
                         String pnome = entrada.nextLine();
                         cadastro.setNome(pnome);
                         cadastro.statusnome();
                         
                         System.out.println("Digite o tipo de produto, se bebida alcoólica 1, se não 2");
                         String tipo = entrada.nextLine();
                         cadt.setTipo(tipo);
                         cadt.statustipo();
                         
                         System.out.println("Digite o valor do produto:");
                         float pvalor = entrada.nextFloat();
                         cadvalor.setValor(pvalor);
                         cadvalor.statusvalor();
                         
                         System.out.println("Digite a quantidade do produto:");
                         int quant = entrada.nextInt();
                         quantt.setQuant(quant);
                         quantt.statusquant();
          case 2:
          {
              ConsultarProduto consulta = new ConsultarProduto();
              
          }
              
          case 3:
          {
          AlterarProduto alterar = new AlterarProduto();
                  
          }
          case 4:
          case 5:{ 
              break;    
             }
  }
          

             }        
         }
}