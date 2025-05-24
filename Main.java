/*=================================================================================
Study Center....: Universidad Técnica Nacional
Campus..........: Sede del Pacífico (JRMP)
College career..: Ingeniería en Tecnologías de Información
Period..........: 2-2025
Course..........: ITI-221 - Programación I
Document........: Practica_21525.java
Professor.......: Jorge Ruiz (york)
Student.........: Josue Quesada Hodgson, Jose Javier Hernandez Ocampo
                  Juan Daniel Venegas Tellez, Luis Angel Diaz
                  Marco Soto Castro
=================================================================================*/

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;
//import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int opc = 0;
        while(opc!=8){
            opc = Integer.parseInt(JOptionPane.showInputDialog("digite la operacion que desea realizar \n 1. deteccion de pares e impares \n 2. determinar si a es divisible entre b \n 3. mostrar numero mayor y menor \n 4. devolver mes \n 5. simulacion de division de enteros \n 6. simulacion de multiplicacion de enteros \n 7. votacion sobre el deporte mas popular \n 8. Salir"));
            switch(opc) {
                case 1:
                    System.out.println("DETECTA PARES E IMPARES");
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                    if (num % 2 == 0) {
                        System.out.println("El numero ingresado es par");
                    } else {
                        System.out.println("El numero ingresado es impar");
                    }
                    System.out.println(" ");
                    System.out.println("===========================================================");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("DETECTA SI A ES DIVISIBLE ENTRE B");
                    int Var_a = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                    int Var_b = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                    if (Var_a % Var_b == 0) {
                        System.out.println("El primer valor es divisible entre el segundo");
                    } else {
                        System.out.println("No divisible");
                    }
                    System.out.println(" ");
                    System.out.println("===========================================================");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("DETECTA NUMERO MAYOR Y MENOR");
                    int imp_may1 = Integer.parseInt(JOptionPane.showInputDialog("Digite  un valor"));
                    int imp_may2 = Integer.parseInt(JOptionPane.showInputDialog("Digite  un valor"));
                    int imp_may3 = Integer.parseInt(JOptionPane.showInputDialog("Digite  un valor"));
                    if (imp_may1 > imp_may2 && imp_may1 > imp_may3) {
                        System.out.println("Variable 1 es mayor a 2 y 3");
                    } else if (imp_may2 > imp_may1 && imp_may2 > imp_may3) {
                        System.out.println("Variable 2 es mayor a 1 y 3");
                    } else if (imp_may3 > imp_may1 && imp_may3 > imp_may2) {
                        System.out.println("Variable 3 es mayor a 1 y 2");
                    }

                    if (imp_may1 < imp_may2 && imp_may1 < imp_may3) {
                        System.out.println("Variable 1 es menor a 2 y 3");
                    } else if (imp_may2 < imp_may1 && imp_may2 < imp_may3) {
                        System.out.println("Variable 2 es menor a 1 y 3");
                    } else if (imp_may3 < imp_may1 && imp_may3 < imp_may2) {
                        System.out.println("Variable 3 es menor a 1 y 2");
                    }
                    System.out.println(" ");
                    System.out.println("===========================================================");
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("DEVUELVE MES");
                    int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 1 al 12"));
                    switch (mes) {
                        case 1:
                            System.out.println("Enero");
                            break;
                        case 2:
                            System.out.println("Febrero");
                            break;
                        case 3:
                            System.out.println("Marzo");
                            break;
                        case 4:
                            System.out.println("Abril");
                            break;
                        case 5:
                            System.out.println("Mayo");
                            break;
                        case 6:
                            System.out.println("Junio");
                            break;
                        case 7:
                            System.out.println("Julio");
                            break;
                        case 8:
                            System.out.println("Agosto");
                            break;
                        case 9:
                            System.out.println("Septiembre");
                            break;
                        case 10:
                            System.out.println("Octubre");
                            break;
                        case 11:
                            System.out.println("November");
                            break;
                        case 12:
                            System.out.println("Diciembre");
                            break;
                        default:
                            System.out.println("Mes no valido");
                            break;
                    }
                    System.out.println(" ");
                    System.out.println("===========================================================");
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("DIVIDE ENTEROS");
                    int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a dividir"));
                    int divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor entre el que quiere dividir"));
                    if (divisor == 0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        boolean esNegativo = false;
                        if ((dividendo < 0 && divisor > 0) || (dividendo > 0 && divisor < 0)) {
                            esNegativo = true;
                        }
                        dividendo = Math.abs(dividendo);//Math.abs devuelve valor absoluto, si es negativo lo invierte
                        divisor = Math.abs(divisor);
                        int cociente = 0;
                        int residuo = dividendo;
                        while (residuo >= divisor) {
                            residuo -= divisor;
                            cociente++;
                        }
                        if (esNegativo) {
                            cociente = -cociente;
                        }
                        System.out.println("Cociente: " + cociente);
                        System.out.println("Residuo: " + residuo);
                    }
                    System.out.println(" ");
                    System.out.println("===========================================================");
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println("Hola usuario porfavor digite 2 numeros enteros para multiplicarlos ");

                    Scanner entrada = new Scanner(System.in);
                    int num1,num2,result;

                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();

                    result =num1*num2;

                    System.out.println("El resultado de: " +result);
            break;
                case 7:
                    System.out.println("VOTACION SOBRE EL DEPORTE MAS POPULAR");
                    HashMap<Integer, String> Votacion_Deportes = new HashMap<>();
                    int contador_1 = 0;
                    int contador_2 = 0;
                    int contador_3 = 0;
                    int opc_dep=0;
                    int cont=0;
                    while (cont<10){
                        opc_dep = Integer.parseInt(JOptionPane.showInputDialog("Elija el deporte por el que va a votar \n 1. Basket \n 2. Futbol \n 3. Ciclismo"));
                        switch (opc_dep){
                            case 1:
                                contador_1++;
                                System.out.println("Se agrego el voto");
                                cont++;
                                break;
                            case 2:
                                contador_2++;
                                System.out.println("Se agrego el voto");
                                cont++;
                                break;
                            case 3:
                                contador_3++;
                                System.out.println("Se agrego el voto");
                                cont++;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    }
                    String ast_1 = "";
                    String ast_2 = "";
                    String ast_3 = "";
                    int cuenta_espacios_1 = 10-contador_1;
                    int cuenta_espacios_2 = 10-contador_2;
                    int cuenta_espacios_3 = 10-contador_3;
                    for(int i = 0; i<contador_1; i++){
                        ast_1 += "*";
                    }
                    for(int i = 0; i<contador_2; i++){
                        ast_2 += "*";
                    }
                    for(int i = 0; i<contador_3; i++){
                        ast_3 += "*";
                    }

                    for(int i = 0; i<cuenta_espacios_1; i++){
                        ast_1 += " ";
                    }
                    for(int i = 0; i<cuenta_espacios_2; i++){
                        ast_2 += " ";
                    }
                    for(int i = 0; i<cuenta_espacios_3; i++){
                        ast_3 += " ";
                    }
                    Votacion_Deportes.put(contador_1, "Basket");
                    Votacion_Deportes.put(contador_2, "Futbol");
                    Votacion_Deportes.put(contador_3, "Ciclismo");
                    System.out.println("DISTRIBUICION DE VOTOS DE DEPORTES");
                    System.out.println("DATOS    ESCALA       ABSOLUTO PORCENTUAL\n"+"         12345678910                   \n"+Votacion_Deportes.get(contador_1)+"   "+ast_1+"   "+contador_1+"        "+contador_1+"0%"+"\n"+Votacion_Deportes.get(contador_2)+"   "+ast_2+"   "+contador_2+"        "+contador_2+"0%"+"\n"+Votacion_Deportes.get(contador_3)+" "+ast_3+"   "+contador_3+"        "+contador_3+"0%\n"+"TOTAL:                10       100%");
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}