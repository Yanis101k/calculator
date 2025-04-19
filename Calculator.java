import java.lang.Math ; 
// Calculator class that will conataine methodes that implement basic calculator methodes like : + , - , * , / , % 

public class  Calculator {

    // methode that will return the addtion result of two number 

    public double addition( double a ,  double b ){

        return a + b ; 

    }

    
    // methode that will return the  result of two number 

    public double substraction( double a , double b ){
        return a - b ; 
    }

    // methode that will return the multiplication reslt of two number  
    public Double multiplication( double a , double b ){
        return a * b ; 
    } 

    // methode that will return the devision methode 
    public Double division( double nomirator, double denominator){

        try{
            return nomirator / denominator ;  
        }

        catch ( ArithmeticException e ){
            e.getMessage() ; 
        }

        return null ; 

    } 
    // methode that return reste of division 
    public Double modulo( double nomirator , double denominator ){

        try {
            return nomirator % denominator ; 
        }
        catch ( ArithmeticException e ){
            e.getMessage() ; 
        }

        return null ; 
    }
    
    // methode that return a square of number
    public double square( double number ) {
            return Math.pow( number , 2 ) ; 
    }

    // methode that return squre root of number 
    public Double squareRoot( double number ){
        try {
            return Math.sqrt( number ) ; 
        }
        catch( ArithmeticException e ){
            e.getMessage() ; 
            
        }
        
    // main methode to teste manually the above methodes 
    public static void main( String args[] ){
        Calculator calculator = new Calculator() ; 

        System.out.println(calculator.addition(4, -3));

        System.out.println( calculator.substraction(5.9, 9.12 ));

        System.out.println( calculator.multiplication(0, 2.2));

        System.out.println( calculator.division(3, 0));

        System.out.println( calculator.modulo(1, 1));

        System.out.println( calculator.square(4) ) ;

        System.out.println( calculator.squareRoot(-4)) ; 
       

    }

}
