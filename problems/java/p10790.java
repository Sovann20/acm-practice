import java.io.*;
import java.util.*;
import java.math.BigInteger;


public class p10790{
    
    public static void main(String args[]) throws IOException{
        long timeNow = System.currentTimeMillis();
        p10790 p = new p10790();
        
        
        p.pp10790();
        long timeLater = System.currentTimeMillis();
        
        System.out.println(timeLater - timeNow);
    }
    
    public p10790(){
        
    }
    
    void pp10790() throws IOException{
        
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int count = 1;
        
        while(count <= 1200){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0){
                break;
            }
            
            int aSum = (a*(a-1))/2;
            int bSum = (b*(b-1))/2;
            
            String aString = aSum+"";
            String bString = bSum+"";
            
            BigInteger intersections = new BigInteger(aString);
            BigInteger bVal = new BigInteger(bString);
            
            System.out.println("Case "+count+": "+intersections.multiply(bVal));
            count++;
        }
    }
    
}

