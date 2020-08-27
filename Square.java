
package LABTASK;

public class Square implements MyShape{
    double length;
    Square(double length){
        this.length=length;
    }
    @Override
    public double boundarylength(){
        return 4*length;
    }
    @Override
    public double area(){
        return length*length;
    }
    
}
