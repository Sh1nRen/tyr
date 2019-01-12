public class MyFirstProgram{
public static void main (String[] args){

hello("Vyacheslav");
    Square square = new Square(5);
    System.out.println("Площадь квадрата со стороной " + square.l + " равна " + square.area());

    Rectangle rectangle = new Rectangle(7,6);
    System.out.println("Площадь прямоугольника со стороной " + rectangle.a + " и стороной " + rectangle.b + " равна " +
            rectangle.area());
}

public static void hello(String name){
    System.out.println("Greetings to you, " + name);
}



}