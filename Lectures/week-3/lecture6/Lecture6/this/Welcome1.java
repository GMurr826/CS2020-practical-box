public class Welcome1 {
  private  int  numberToPrint = 10;  
    public Welcome1 (){}
    
    private  void printNumber(int numberToPrint) {
        System.out.println("Method parameter:"+numberToPrint);
        System.out.println("Class attribute:"+this.numberToPrint);    
    }
    
    public static void main(String[] args) {
        new Welcome1 ().printNumber(5); 
    } 
} 