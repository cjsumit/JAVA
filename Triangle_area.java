class Triangle {
    float length;
    float breadth;
    static float I = 0.5f;
    Triangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public static void test(){
        System.out.println("Hello World");
    }
    public float area() {
        return (Triangle.I * this.length * this.breadth);
    }
    
}

public class Triangle_area {
    public static void main(String[] args) {
        System.out.println();
        Triangle area1 = new Triangle(10,2);
        System.out.println("Area of Triangle 1: " + area1.area());
        
        Triangle area2 = new Triangle(20,3);
        System.out.println("Area of Triangle 2: " + area2.area());
        
        Triangle area3 = new Triangle(30,4);
        System.out.println("Area of Triangle 3: " + area3.area());
        
        Triangle area4 = new Triangle(40,5);
        System.out.println("Area of Triangle 4: " + area4.area());
        
        Triangle area5 = new Triangle(50,6);
        System.out.println("Area of Triangle 5: " + area5.area());
    }
}

