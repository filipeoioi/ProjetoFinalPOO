
package projetofinal;

import java.util.ArrayList;


public class Teste {
      public Teste(){
          
          
          
            iUsuario joao=new Funcionario("Joao",1234,"aaaa");
            iUsuario f2=new Funcionario("Filipe",4321,"bbbbb");
            iUsuario c1=new Cliente(12345,"joaopedro","213123123","21312312312","4556");
            
            
            Login l1=new Login(12345,"ccccc");
            
            Model m1=new Model();
           // ArrayList<iUsuario>lista=m1.getUsuarios();
  
            m1.addUsuario(joao);
            m1.addUsuario(f2);
            m1.addUsuario(c1);
            
            m1.buscar(joao);
            m1.buscar(c1);
             
            System.out.println(m1.confirmarlogin(l1));
         
           
            
         
        }
    public static void main(String[] args) {
      
        new Teste();
        
        
        
    }
    
    
    
    
}
