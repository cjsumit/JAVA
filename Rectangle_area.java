class Rectangle {
    float length;
    float breadth;
    Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public static void test(){
        System.out.println("Hello World");
    }
    public float area() {
        return (this.length * this.breadth);
    }
    
}

public class Rectangle_area {
    public static void main(String[] args) {
        System.out.println();
        Rectangle area1 = new Rectangle(10,2);
        System.out.println("Area of Rectangle 1: " + area1.area());
        
        Rectangle area2 = new Rectangle(20,2);
        System.out.println("Area of Rectangle 2: " + area2.area());
        
        Rectangle area3 = new Rectangle(30,2);
        System.out.println("Area of Rectangle 3: " + area3.area());
        
        Rectangle area4 = new Rectangle(40,2);
        System.out.println("Area of Rectangle 4: " + area4.area());
        
        Rectangle area5 = new Rectangle(50,2);
        System.out.println("Area of Rectangle 5: " + area5.area());
    }
}

