package javaapplication2;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author USUARIO
 */
public class Cuenta {
    public int numero;
    public int clave;
    public String propietario;
    public int saldo;
   
    
 
    public void consignar(){
        int d;
        int d10;
        int cn2=500000;
        do{
        System.out.println("Seleccione la cuenta a la que quiere consignar : ");
        System.out.println("1. Magdalena Sanchez");
        System.out.println("2. Joselito Perez");
        Scanner sc10 = new Scanner(System.in);
        d10 = sc10.nextInt();
        }while ( d10!=1);
        if(d10==1){
        do{
        System.out.println("Ingre el valor a consignar : ");
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();
        }while(d<=0);
        
        this.saldo = this.saldo + d;
        System.out.println("Se han consignado : " + d + " Pesos a la cuenta de  "
        +   this.propietario);
            
         do{
        System.out.println("Ingre el valor a consignar : ");
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();
        }while(d<=0);
         if(d>this.saldo){
             System.out.println("Saldo insuficiente para realizar la consignacion.");
         }else{
             this.saldo = this.saldo - d;
             cn2 = cn2 + d;
             System.out.println("consignacion realizada exitosamente");
         }
    }
    }
    
    public void retirar (){
        int d2;
        do{
        System.out.println("Ingre el valor a retirar : ");
        Scanner sc2 = new Scanner(System.in);
        d2 = sc2.nextInt();
        } while(d2<=0);
        if(this.saldo<d2){
        System.out.println("Saldo insuficiente");
        }else{
            this.saldo = this.saldo - d2;
            System.out.println("Se han retirado : " + d2 + " Pesos de su cuenta "
               + this.propietario );
        
        System.out.println("Ahora el saldo de su cuenta es de : " + this.saldo + " Pesos " );
        }
        
    }
    public void cambioclave(){
        int d3;
        do{
            System.out.println("Ingrese su antigua contraseña : ");
            Scanner sc3 = new Scanner(System.in);
            d3 = sc3.nextInt();
        } while(d3 != this.clave);
            System.out.println("Ingrese su nueva contraseña : ");
            Scanner sc3 = new Scanner(System.in);
            this.clave = sc3.nextInt();
            System.out.println("Contraseña cambiada exitosamente  ");
                    }  
    public void consultarsaldo(){
        System.out.println(" El saldo de la cuenta " + this.propietario + " es de : "
        + this.saldo + " Pesos ");
    }
        }

