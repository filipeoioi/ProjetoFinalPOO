
package projetofinal;


public class Teste {
      public Teste(){
            iUsuario f1=new Funcionario();
            iUsuario c1 = new Cliente();
            
            Model m1=new Model();
            m1.addUsuario(c1);
            m1.addUsuario(f1);
            
            for (iUsuario i : m1) {
                System.out.println(i.getClass());
          }
            
        }
    public static void main(String[] args) {
      
        new Teste();
        
        
        
    }
    
    
    
    
}
