package mx.edu.utez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        double resultado = 0;
        do{
            System.out.println("Elige entre las 4 opciones");
            System.out.println("1.- Kilómetros a millas");
            System.out.println("2.- Litros a galones");
            System.out.println("3.- Gramos a onzas");
            System.out.println("4.- Centímetros a pulgadas");
            System.out.println("5.- Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Introduce los km");
                    double km = sc.nextInt();
                    resultado = kmAmillas(km);
                    System.out.println("Millas: " + resultado);
                    break;
                case 2:
                    System.out.println("Introduce los litros");
                    double litros = sc.nextInt();
                    resultado =  litrosAGalones(litros);
                    System.out.println("Galones: " + resultado);
                    break;
                case 3:
                    System.out.println("Introduce los gramos");
                    double gramos = sc.nextInt();
                    resultado = gramosAOnzas(gramos);
                    System.out.println("Onzas: " + resultado);
                    break;
                case 4:
                    System.out.println("Introduce los centimetros");
                    double centimetros = sc.nextInt();
                    resultado = centimetrosAPulgadas(centimetros);
                    System.out.println("Pulgadas: " + resultado);
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != 5);
    }

    public static double kmAmillas(double km){
        double millas = km * 0.621371;
        return millas;
    }

    public static double litrosAGalones(double litros){
        double galones = litros * 0.8684;
        return galones;
    }

    public static double gramosAOnzas(double gramos){
        double onzas = gramos * 0.03527396;
        return onzas;
    }

    public static double centimetrosAPulgadas(double centimetros){
        double pulgadas = centimetros * 0.393701;
        return pulgadas;
    }
}