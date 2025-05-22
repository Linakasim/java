package linaa;
import java.util.*;
class multiplication extends Thread{
    int i;
    public void run(){
        try {
            for(i=1;i<=10;i++){
                System.out.println(i+" * 5 : "+(i*5));
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class Prime extends Thread{
    public void run(){
        int j,limit,i,f;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit: ");
        limit=s.nextInt();

        try {
            for(i=1;i<=limit;i++){
                f=1;
                for(j=2;j<i;j++){
                    if(i%j==0){
                        f=0;
                    }
                }
                if(f==1){
                    System.out.println(i);
                }
            }
            Thread.sleep(200);

        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
} 

public class MultiPrime {

    public static void main(String[] args) {
        multiplication m=new multiplication();
        Prime p=new Prime();
        m.start();
        p.start();
    }
}