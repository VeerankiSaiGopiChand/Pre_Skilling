package Day4;


interface Operation {
 double value(double a, double b);
}

public class Lamda {
 public static void main(String[] args) {

     
	 Operation add = new Operation() {
         @Override
         public double value(double a, double b) {
             return a + b;
         }
	 };
	 
     Operation sub = (a, b) -> a - b;
     Operation mul = (a, b) -> a * b;
     Operation div = (a, b) -> a / b;

     
     double x = 10, y = 2;

     
     System.out.println("Addition: " + add.value(x, y));      
     System.out.println("Subtraction: " + sub.value(x, y));   
     System.out.println("Multiplication: " + mul.value(x, y));
     System.out.println("Division: " + div.value(x, y));       
 }
}
