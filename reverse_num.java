import java.util.*;
public class reverse_num{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num= sc.nextInt();
        int rev=0;
        while(num!=0){
            int remainder= num%10;
            rev=rev*10+remainder;
            num=num/10;
        }
        System.out.println("Reverse is : "+rev);
    }
}