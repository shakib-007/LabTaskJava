
package LABTASK;

public class Circle implements MyShape{
    double redius;
    final double PI=3.1416;
    Circle(double redius){
        this.redius=redius;
    }
    @Override
    public double boundarylength(){
        return 2*PI*redius;
    }
    @Override
    public double area(){
        return PI*redius*redius;
    }
}
