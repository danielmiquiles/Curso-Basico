
import java.util.Scanner;
public class Exercicios_Professor {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        double a,b;
        
        System.out.print("entre com o valor do lado A: ");
        a = input.nextDouble();
        System.out.print("entre com o valor do lado B: ");
        b = input.nextDouble();
        if (a == b)
        {
            System.out.println("É um quadrado.");
        }
        else
        {
            System.out.println("É um retângulo");
        }
    }
}
        
        
       
