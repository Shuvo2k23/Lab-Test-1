package LabTest1;

import java.util.Scanner;

public class Numeric {
    public static double intPower(double x,int n){
        double ans = 0;
        if(n<0){
            ans = Math.pow(x,-n);
            ans = Math.pow(ans,-1);
        }
        else if(n>0 && n%2!=0){
            ans = Math.pow(x,n-1);
            ans = ans * x;
        }
        else {
            ans = Math.pow(x,n/2);
            ans = ans * ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter x and n : ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double ans = intPower(x,n);
        System.out.printf("Answer : %.4f" , ans);
    }
}
