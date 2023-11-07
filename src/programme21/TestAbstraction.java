package programme21;

public class TestAbstraction {
    public static void main(String[] args) {
        //in a real scenario, object is provided through method, e.g., getShape() method
        Shape s = new Circle();
        s.draw();
    }
}
