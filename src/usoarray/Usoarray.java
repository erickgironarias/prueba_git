
package usoarray;

import java.util.Arrays;

public class Usoarray 
{

    private int arregloInt[]={1,2,3,4,5,6};
    private double arreglodoble[]={8.4,9.3,0.2,7.9,3.4};
    private int arregloIntLleno[],copiaArregloInt[];
    
    //el constructor inicializa los arreglos
    public Usoarray()
    {
        arregloIntLleno=new int[10]; //crea arreglo int con 10 elementos
        copiaArregloInt=new int[arregloInt.length];
        
        Arrays.fill(arregloIntLleno,7);//llena con 7s
        Arrays.sort(arreglodoble);//ordena arreglodoble en forma ascendente
        //copia el arregloarregloint en el arreglo copiaarrgloint
        System.arraycopy(arregloInt, 0,copiaArregloInt,0,arregloInt.length);
    }
    
    //imprime los valores en cada arreglo
    public void imprimirArreglos()
    {
        System.out.println("arregloDoble");
        for(double valordoble : arreglodoble)
            System.out.println(valordoble);
        
        System.out.println("\n arregloInt");
        for(int valorInt : arregloInt)
            System.out.println(valorInt);
        
        System.out.println("\n arregloIntLleno");
        for(int valorInt : arregloIntLleno)
            System.out.println(valorInt);
        
        System.out.println("\n acopiaAregloInt");
        for(int valorInt : copiaArregloInt)
            System.out.println(valorInt);
        
        System.out.println("\n");
    }
    
    //buscarun valor en el arreglo arregloInt
    public int buscarUnInt(int valor)
    {
        return Arrays.binarySearch(arregloInt,valor);
    }
    
    //compara el contenido del arreglo
    public void imprimirigualdad()
    {
        boolean b=Arrays.equals(arregloInt, copiaArregloInt);
        System.out.printf("arregloInt %s copiaArregloInt\n " ,(b? "==" : "!")) ;
        
        b=Arrays.equals(arregloInt, arregloIntLleno);
        System.out.printf("arregloInt %s arregloIntLleno ",(b? "==" : "!")) ;  
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Usoarray usoArreglos=new Usoarray();
        
        usoArreglos.imprimirArreglos();
        usoArreglos.imprimirigualdad();
        
        int ubicacion = usoArreglos.buscarUnInt(5);
        if(ubicacion>=0)
            System.out.printf("se encontro el 5 en el elemento %d de arregloInt\\n", ubicacion);
        else
            System.out.printf("no encontro el 5 en el arregloInt\\n");
            
    }
    
}
