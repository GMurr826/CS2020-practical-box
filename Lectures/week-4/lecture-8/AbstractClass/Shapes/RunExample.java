public class RunExample {
    public static void main (String [] args) {
        Shape rectangle_as_superclass = new Rectangle (23.0, 25.0); 
        //vvv   throws compilation error    vvv
        //System.out.println(rectangle_as_superclass.getWidth ());
        //fine after casting to the type that defines or inherits the method
        if (rectangle_as_superclass instanceof Rectangle) {
            Rectangle rectangle_as_subclass =  (Rectangle) rectangle_as_superclass;
            System.out.println(rectangle_as_subclass.getWidth ());
        }
        Rectangle rectangle = new Rectangle (8.0, 8.0);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.toString());
    }
}