public class Child extends Person {
    int height = 0; 
    String prefix = "Child's name is:";
    
    public Child (String name) {   
        super (name);  
    }
    
    public void setHeight (int height) {
        this.height = height;
    }
    
    public int getHeight () {
       return  height;
    }
    
    @Override
    public void printName() {
        System.out.println (prefix+super.name);
    }
    
}