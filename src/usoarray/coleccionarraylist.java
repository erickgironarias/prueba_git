
package usoarray;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import static java.util.Spliterators.iterator;

public class coleccionarraylist 
{
    
public static void main(String[] args) 
{
    ArrayList Milista = new ArrayList();
    String Nombre;
    String Apellido;
    String Cedula;
    int edad;
    System.out.println(">+++++INGRESE LOS SIGUIENTES DATOS+++++<");
     do
     {
         Scanner Leer = new Scanner(System.in);
         try
         {
             System.out.println("INGRESE EL NOMBRE");
             Nombre =Leer.next();
             System.out.println("INGRESE EL APELLIDO");
             Apellido =Leer.next();
             System.out.println("INGRESE LA CEDULA");
             Cedula =Leer.next();
             System.out.println("INGRESE LA EDAD");
             Object Edad = Leer.nextInt();
             
             Milista.add(Nombre);
             Milista.add(Apellido);
             Milista.add(Cedula);
             Milista.add(Edad);
             break;
         }
         
         catch(InputMismatchException e)
         {
             System.out.println("ERROR DE LECTURA");
         }
             
             
         catch(InputMismatchException e)
         {
        
         }
     }
     while(true);
     
     System.out.println("\n >+++++DATOS INGRESADOS+++++<");
     
     for(int i=0; i<Milista.size(); i++)
     {
         System.out.println(Milista.get(i));
     }
     
     for (Object indice : Milista)
     {
         System.out.println("Milista.get(indice)");
     }
     Iterator i= Milista.iterator();
     while(i.hasNext())
     {
         System.out.println(i.next());
     }
}
    
}

