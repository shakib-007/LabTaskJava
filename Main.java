
package LABTASK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("1.Square\n2.Circle\n3.Triangle\n");
        System.out.print("Choose any Shape:");
        int n=input.nextInt();
        switch(n){
            case 1:
                double length;
                System.out.print("Enter length:");
                length=input.nextDouble();
                Square s= new Square(length);
                System.out.println("Boundary length of area:"+s.boundarylength());
                System.out.println("area of square:"+s.area());
                break;
               
            case 2:
                double redius;
                System.out.print("Enter redius:");
                redius=input.nextDouble();
                Circle cir= new Circle(redius);
                System.out.println("Boundary length of area:"+cir.boundarylength());
                System.out.println("area of circle:"+cir.area());
                break;
            case 3:                
                double a,b,c;
                System.out.print("Enter three arms of triangle:");
                a=input.nextDouble();
                b=input.nextDouble();
                c=input.nextDouble();
                Triangle t= new Triangle(a,b,c);
                System.out.println("Boundary length of area:"+t.boundarylength());
                System.out.println("area of triangle:"+t.area());  
                break;
        }
    }
}
