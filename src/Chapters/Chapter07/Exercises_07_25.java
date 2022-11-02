package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_25 {
    public static void main(String[] args) {
        double [] eqn = new double[3];
        double [] roots = new double[3];
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a,b,c : ");
        for (int i = 0; i <eqn.length ; i++) {
            eqn[i]=input.nextDouble();
        }
        if(solveQuadratic(eqn,roots)==0){
            System.out.print("No real roots");
        }else{
            print(roots,solveQuadratic(eqn,roots));
        }

    }
    public static  void print(double[]roots,int number){
        for (int i = 0; i <roots.length ; i++) {
            System.out.print((i+1)+" . Roots : "+roots[i]+"\n");
        }
    }
    public static int solveQuadratic(double[] eqn, double[] roots){
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double delta = (Math.pow(b,2)) - (4 * a * c);

        if (delta > 0.0) {
            roots[0] = (-b + Math.pow(delta, 0.5)) / (2.0 * a);
            roots[1] = (-b - Math.pow(delta, 0.5)) / (2.0 * a);
            return 2;
        } else if (delta == 0.0) {
            roots[0] = -b / (2.0 * a);
            return 1;
        }

        return 0;
    }
}
