class Square {
    float side;
    Square(float side){
        this.side = side;
    }
    public static void test(){
        System.out.println("Hello World");
    }
    public float area() {
        return (this.side * this.side);
    }
    
}

public class Square_area {
    public static void main(String[] args) {
        System.out.println();
        Square side1 = new Square(10);
        System.out.println("Area of Square 1: " + side1.area());
        
        Square area2 = new Square(20);
        System.out.println("Area of Square 2: " + area2.area());
        
        Square area3 = new Square(2);
        System.out.println("Area of Square 3: " + area3.area());
        
        Square area4 = new Square(15);
        System.out.println("Area of Square 4: " + area4.area());
        
        Square area5 = new Square(38);
        System.out.println("Area of Square 5: " + area5.area());
    }
}

