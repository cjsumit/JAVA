class Circle {
    float radius;
    static float PI = 3.14f;
    Circle(float radius){
        this.radius = radius;
    }
    public static void test(){
        System.out.println("Hello World");
    }
    public float area() {
        return (Circle.PI * this.radius * this.radius);
    }
    
}

public class GemetryMain {
    public static void main(String[] args) {
        System.out.println();
        Circle circle1 = new Circle(10);
        System.out.println("Area of Circle 1: " + circle1.area());
    }
}

