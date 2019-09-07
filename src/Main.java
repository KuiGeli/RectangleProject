import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);


        System.out.println("Enter height");
        while (!userInput.hasNextInt()){
            System.out.println("Please enter an integer");
            userInput.nextLine();
        }
         int height = userInput.nextInt();


        System.out.println("Enter length");

        while (!userInput.hasNextInt()) {
            System.out.println("Please enter an integer");
            userInput.next();
        }
        int length = userInput.nextInt();
//asdasdasdasdasdasdasdasdasdasdasdasdasdasdsadsadsadsad
       Rectangle r = new Rectangle(height, length);
        System.out.println(r.rectangleArea());





        }












//        Rectangle rectangle1 = new Rectangle(15, 16);
//        Rectangle rectangle2 = new Rectangle(16, 20);
//        Rectangle rectangle3 = new Rectangle(2, 5);
//        Rectangle rectangle4 = new Rectangle(8, 2);
//        Rectangle rectangle5 = new Rectangle(5, 3);
//
//
//        Rectangle[] rectangles = {rectangle1, rectangle2, rectangle3, rectangle4, rectangle5};
//
//        for(Rectangle r: rectangles ){
//
//            System.out.println(r.rectangleArea());
//
//        }
//


}
