// Calculator class that will conataine methodes that implement basic calculator methodes like : + , - , * , / , % 

public class  Calculator {

    // methode that will return the addtion result of two number 

    public int addition( int a , int b ){

        return a + b ; 

    }

    // main methode to teste manually the e=above methodes 
    public static void main( String args[] ){
        Calculator calculator = new Calculator() ; 

        System.out.println(calculator.addition(4, -3));
    }

}