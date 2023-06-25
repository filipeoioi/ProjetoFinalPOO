
package projetofinal;

import java.util.ArrayList;


public class Teste {
      public Teste(){
            iUsuario joao=new Funcionario("Joao",1234,"aaaa");
            
            iUsuario f2=new Funcionario("Filipe",4321,"bbbbb");
           
            
            Login l1=new Login(4321,"bbbbb");
            
            Model m1=new Model();
           
     
            m1.addUsuario(joao);
            m1.addUsuario(f2);
            System.out.println(m1.confirmarlogin(l1));
            //ArrayList<iUsuario>lista=m1.getUsuarios();
            
           
            
         
        }
    public static void main(String[] args) {
      
        new Teste();
        
        
        
    }
    
    
    
    
}
