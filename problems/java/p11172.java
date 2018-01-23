
import java.io.*;
import java.util.*;


public class p11172{
    
    public static void main(String args[]) throws IOException{
        p11172 m = new p11172();
        m.relationOperator();
    }
    
    public p11172() throws IOException{
        
    }
    
    void relationOperator(){
        int curr = 0;
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        
        int sets = sc.nextInt();
        
        
        
        while(curr < sets){
            int compX = sc.nextInt();
            int compY = sc.nextInt();
            
            if(compX < compY){
                System.out.println("<");
            }
            else if(compX > compY){
                System.out.println(">");
            }
            else{
                System.out.println("=");
            }
            curr++;
        }
    }
    
}
