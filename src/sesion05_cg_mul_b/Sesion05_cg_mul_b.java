package sesion05_cg_mul_b;

import java.util.Scanner;

public class Sesion05_cg_mul_b 
{
    static int Tras1, Tras2;

    public static void main(String[] args) 
    {
        //defina y asigne dos objetos, un cuadrado y una circunferencia
        Circunferencia circulo = new Circunferencia(new Coordenada(0,0),4.0f);
        Cuadrado cuadrado = new Cuadrado(new Coordenada(3,3),5);
        //Solicite al usuario ingresar el valor de un vector de traslación
        Scanner lec = new Scanner(System.in);
        System.out.println("Bienvenido\n Por favor Ingrese el vector de traslación ");
        System.out.println("Ingrese el primer valor del vector de traslación: ");
        Tras1= lec.nextInt();
        System.out.println("Ingrese el segundo valor del vector de traslación: ");
        Tras2= lec.nextInt();
        //Aplique el vector de traslación anterior a los objetos referidos
        cuadrado.Traslacion(Tras1, Tras2);
        //Mostrar las posiciones originales y finales de cada uno de los objetos
        
    }
    
}

