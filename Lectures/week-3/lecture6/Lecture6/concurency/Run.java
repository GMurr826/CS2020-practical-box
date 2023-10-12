public class Run { 
    public static void main(String args[]){  
        final Print obj = new Print();
  
        Thread t1=new Thread(){  
            public void run(){  
                obj.printNumb(5);  
            }  
        };

        Thread t2=new Thread(){  
            public void run(){  
                obj.printNumb(100);  
            }  
        };
  
        t1.start();  
        t2.start();  
    }  
}  