package com.edflor.controlFlujo;
/**
 *
 * @author luis.flores.ramirez
 */
public class TablaMultiplicar {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { //Recorre i del 1 al 10
            for (int j = 1; j <= 10; j++) {//Recorre j del 1 al 10
                System.out.printf("\t" + i*j);//En cada iteracion multiplica i X j; ejemplo 1X1, 1X2 1X3
            }
        System.out.println("\n");//Cuando el flujo de las iteraciones termine dar un salto de linea
        }
    }
}
