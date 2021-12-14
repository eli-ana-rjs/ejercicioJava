
package ejerciciojavacac;

import java.util.Scanner;

/**
 *
 * @author Eliana Anabella Rojas
 */
public class EjercicioJavaCAC {

    static Scanner scanner; //variable de clase
    
    public static void main(String[] args) {
        
        scanner = new Scanner(System.in);
        
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String editorDeCodigo;
        String sistemaOperativo;
        
        
        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        
        System.out.print("Ingrese su apeliido: ");
        apellido = scanner.nextLine();
        
        
        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();
        
        scanner.nextLine(); 
        
        System.out.print("Ingrese un hobbie: ");
        hobbie = scanner.nextLine();
        
        System.out.print("Ingrese su editor de código preferido : ");
        editorDeCodigo = scanner.nextLine();
        
        System.out.print("Ingrese el Sistema Operativo que utiliza: ");
        sistemaOperativo = scanner.nextLine();
        
         System.out.println("-------------------------");
        System.out.println("Los datos ingresados son: ");
        System.out.println("-------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Hobbie: " + hobbie);
        System.out.println("Editor de código favorito: " + editorDeCodigo);
        System.out.println("Sistema operativo: " + sistemaOperativo);
        
        scanner.close();
    }
    
}
