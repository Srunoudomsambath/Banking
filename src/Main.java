import lombok.Data;

//Overidding method
class Shape {
    void draw(){
        System.out.println("Drawing Shape");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing circle");
    }
}
class Triangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Triangle");
    }
}
public class Main {
    public static void main(String[] args){
        Shape circle = new Circle();
//        Circle circle = new Circle();
        Shape triangle = new Triangle();
//        Triangle triangle = new Triangle();
        circle.draw();
        triangle.draw();


    }
}
