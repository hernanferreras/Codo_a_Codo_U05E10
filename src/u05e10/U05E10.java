
package u05e10;

import java.util.Scanner;
public class U05E10 {
    public static void main(String args[]) {
        Scanner entrada=new Scanner(System.in);
        int numeroMes;
        String mes;
        System.out.print("Ingrese el numero de mes: ");
        numeroMes=entrada.nextInt();
        mes=obtenerMesEnTexto(numeroMes);
        System.out.print("El mes numero "+numeroMes+" corresponde a "+mes);
    }
    static String obtenerMesEnTexto (int a){
        String z;
        switch(a){
            case 1:
                z="Enero";
                break;
            case 2:
                z="Febrero";
                break;
            case 3:
                z="Marzo";
                break;
            case 4:
                z="Abril";
                break;
            case 5:
                z="Mayo";
                break;
            case 6:
                z="Junio";
                break;
            case 7:
                z="Julio";
                break;
            case 8:
                z="Agosto";
                break;
            case 9:
                z="Septiembre";
                break;
            case 10:
                z="Octubre";
                break;
            case 11:
                z="Noviembre";
                break;
            case 12:
                z="Diciembre";
                break;
            default:
                z=" ";
                break;
        }
    return(z);
    }
}