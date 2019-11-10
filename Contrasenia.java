    import java.util.Scanner;
    public class Contrasenia
    {
    public static void main(String[]args){
     String contra;
     String intro;
     Scanner CR=new Scanner(System.in);
     System.out.println("DEFINE UNA CLAVE:");
     contra=CR.nextLine();
     for (int i=1;i<=3;i++){
         System.out.println("(INTENTO "+i+") INTRODUCE LA CLAVE:");
         intro=CR.nextLine();
         if (intro.equals(contra)){
         System.out.println("CLAVE CORRECTA");
         i=4;
            }
            else if (i==3){System.out.println("TUS 3 INTENTOS FUERON ERRONEOS, NO PUEDES ACCEDER");}
        }
        CR.close();
    }
}

   
  

