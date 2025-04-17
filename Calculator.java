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
    public Double modulo( double nomirator , double denominator ){

        try {
            return nomirator % denominator ; 
        }
        catch ( ArithmeticException e ){
            e.getMessage() ; 
        }

        return null ; 
    }
    // main methode to teste manually the above methodes 
    public static void main( String args[] ){
        Calculator calculator = new Calculator() ; 

        System.out.println(calculator.addition(4, -3));

        System.out.println( calculator.substraction(5.9, 9.12 ));

        System.out.println( calculator.multiplication(0, 2.2));

        System.out.println( calculator.division(3, 0));

        System.out.println( calculator.modulo(1, 1));
       

    }

}