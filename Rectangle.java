
package question05;
class Rectangle {
    int length;
    int breadth;
    int height;
    Rectangle() {
        length = 1;
        breadth = 1;
       
    }
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
        
    }
    int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Area (default): " + rect1.area());
        Rectangle rect2 = new Rectangle(5, 10);
        System.out.println("Area (5,10): " + rect2.area());
    }
}

