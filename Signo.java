import java.util.Scanner;
public class Signo
{
    public static void main(String[]args){
     double num;
     Scanner SC=new Scanner(System.in);
     System.out.println("INTRODUCE UN NUMERO");
     num=SC.nextDouble();
     if (num==0){System.out.println("EL NUMERO ES CERO");}
     else if (num>0){System.out.println("EL NUMERO ES POSITIVO");}
     else {System.out.println("EL NUMERO ES NEGATIVO");}
     SC.close();  
    }
}
   