package ex_25_OOPs_Abstraction_Interface;

public class Lab198_Interface {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.getArea(3,4);

        Rectangle r1 = new Rectangle();
        r1.getArea(5, 5);
    }

}
class Square implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println(" Area of square = " + 3.14 * length * breadth);
    }
}
class Rectangle implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println(" Area of rectangle = " + length * breadth);
    }
}

// Incomplete method - by default Interface has incomplete methods
interface Polygon{
    void getArea(int length, int breadth);
}
