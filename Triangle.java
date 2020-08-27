
package LABTASK;

public class Triangle implements MyShape{
    
    double a,b,c;
    
    Triangle (double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public double boundarylength(){
        return a+b+c;
    }
    @Override
    public double area(){
        return (Math.sqrt(3)/4)*a*a;
    }
}
