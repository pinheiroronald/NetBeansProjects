
package recursaojava;


public class RecursaoJava {
    
public static int sum(int k){
    if(k > 0){
    return k + sum(k - 1);
}else{
 return 0;
}
  }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int result = sum(100);
        System.out.println(result);
     
            
        }
    
    }

