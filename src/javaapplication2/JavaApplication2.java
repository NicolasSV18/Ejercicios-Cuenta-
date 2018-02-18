package javaapplication2;
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cn1 = new Cuenta();
        cn1.clave = 1234;
        cn1.numero = 1012;
        cn1.propietario = (" Magdalena Sanchez ");
        cn1.saldo = 0;
        Cuenta cn2 = new Cuenta();
        cn2.clave = 9876;
        cn2.numero = 1013;
        cn2.propietario = (" Joselito Perez ");
        
        int d4;
        int d5;
        int d6;
        int d7;
       
        do{
        System.out.println("Seleccione la opcion correspondiente a su nombre : ");
        System.out.println("1. Magdalena Sanchez");
        System.out.println("2. Joselito Perez");
        Scanner sc6 = new Scanner(System.in);
        d6 = sc6.nextInt();
        }while ( d6!=1 && d6!=2);
        if(d6==1){
        do{
    System.out.println("Ingrese su numero de usuario : ");
    Scanner sc4 = new Scanner(System.in);
    d4 = sc4.nextInt();
    System.out.println("Ingrese su numero de clave : ");
    Scanner sc5 = new Scanner(System.in);
    d5 = sc5.nextInt();
    
    }while(d4!=cn1.numero && d5!=cn1.clave );
     do{
         System.out.println("");
      
         
         System.out.println("Seleccione la opcion que desee realizar ");
        System.out.println("1. Consignar dinero ");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Cambiar clave ");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Cambiar de cuenta");
         System.out.println("6. Salir");
         Scanner sc7 = new Scanner(System.in);
         d7 = sc7.nextInt();
     if(d7==1){
     cn1.consignar();}
     if(d7==2){
     cn1.retirar();} 
     if(d7==3){
     cn1.cambioclave();} 
     if(d7==4){
     cn1.consultarsaldo();} 
     if(d7==5){
         System.out.println("Deshabilitado por el momento.");
     }
    }while(d7!=6);    
    }
    }
    }
