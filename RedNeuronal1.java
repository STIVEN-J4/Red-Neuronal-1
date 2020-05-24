/*
 Implemente un algoritmo que le permita:
1). Desplegar el nombre del proyecto de su paper.
2). Defina lo que es una red neuronal.
3). Cuales son los elememtos que forman una red neuronal.
4). Cómo ulitilizaron la red neuronal en el proyecto
que usted ha seleccionado
5). Cómo utilizaria usted la red neuronal como mejoramiento al
proyecto propuesto.
6. En qué consistio el entrenamiento utilizando una red neuronal
indique el algoritmo utilizado.
 */
package red.neuronal.pkg1;

/**
 *
 * @author JULIO JIMENEZ
 */
import java.util.Scanner;
public class RedNeuronal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner objeto=new Scanner (System.in);

    System.out.println("Ingrese el nombre del Paper seleccionado:");
    String paper=objeto.nextLine();

    System.out.println("\n\nDefina lo que es una red neuronal:");
    String redneuronal=objeto.nextLine();

    System.out.println("\n\nCuales son los elementos que conforman una red neuronal:");
    String elementos=objeto.nextLine();

    System.out.println("\n\nComó utilizaron la red neuronal en el proyecto que usted ha seleccionado:");
    String utilizaronredneuronal=objeto.nextLine();

    System.out.println("\n\nComó utilizaria usted la red neuronal como mejoramiento al proyecto propuesto:");
    String mejoramientoproyecto=objeto.nextLine();

    System.out.println("\n\nEn que consistio el entrenamiento utilizando una red neuronal indique el algoritmo utilizado:");
    String algoritmoutilizado=objeto.nextLine();

            }

}
