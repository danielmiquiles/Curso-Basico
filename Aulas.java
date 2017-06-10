
import java.util.Scanner;
public class Aulas {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        double A;
        
        System.out.print("Entre com a Nota do aluno: ");
        A = input.nextDouble();
        
        if (A == 10){
            System.out.println("A nota do aluno é A");
        }
            else if (A <= 9 && A >=8){
        System.out.println("A nota do aluno é B");
    }
            else if (A <= 7 && A>=6){
        System.out.println("A nota do aluno é C");
    }
            else if (A <= 5 && A >=4){
        System.out.println("A nota do aluno é D");
    }
            else if (A <= 3 && A >= 2){
               System.out.println("A nota do aluno é E");
            }
            else {
                System.out.println("A nota do aluno é F");
            }
            
    }
    }
    


