public class ComplexNumber {
//    Write a class with the name ComplexNumber.
//    The class needs two fields (instance variables) with name real and imaginary of type double. It represents the Complex Number.

    private double real;
    private double imaginary;

//  The class needs to have one constructor.
//  The constructor has parameters real and imaginary of type double, and it needs to initialize the fields.

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

//    Write the following methods (instance methods):

//    Method named getReal without any parameters, it needs to return the value of real field.

    public double getReal(){
        return real;
    }

//    Method named getImaginary without any parameters, it needs to return the value of imaginary field.

    public double getImaginary(){
        return imaginary;
    }

//    Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields.
//    In other words, it needs to do a complex number add operation as described above.

    public double add(double real, double imaginary){
        double total;
        this.real += real;
        this.imaginary += imaginary;
        total = this.real + this.imaginary;
        return total;
    }
//    Method named add with one parameter of type ComplexNumber.
//    It needs to add the ComplexNumber parameter to the corresponding instance variables.

    public double add(ComplexNumber complexNumber){
        double total;
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
        total = this.real + this.imaginary;
        return total;
    }

//    Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters from fields,
//    in other words, it needs to do a complex number subtract operation as described above.

    public double subtract(double real, double imaginary){
        double total;
        this.real -= real;
        this.imaginary -= imaginary;
        total = this.real + this.imaginary;
        return total;
    }

//    Method named subtract with one parameter of type ComplexNumber. It needs to subtract the other parameter from this complex number.

    public double subtract(ComplexNumber complexNumber){
        double total;
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
        total = this.real + this.imaginary;
        return total;
    }

}
