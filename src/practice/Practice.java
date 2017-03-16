/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Alsaba
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int a,b ,sum,diff,p;
        System.out.println("enter value a");
        a=scan.nextInt();
        System.out.println("enter value b");
        b=scan.nextInt();
        sum=a+b;
        diff=a-b;
        p=a*b;
        System.out.println("sum is="+sum+"difference is="+diff+"product is="+p);
    }
        
    }
    
}
