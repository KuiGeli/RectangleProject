public class Rectangle {

   private int height = 0;
   private int length = 0;


   public Rectangle(int height, int length){
       this.height = height;
       this.length = length;
   }

    public int rectangleArea (){

        return this.height * this.length;

    }









    public void setHeight(int heigth){
        this.height = heigth;
    }
    public void setLength(int length){
        this.length = length;
    }


    public int getHeigth(){
        return height;
    }
    public int getLenght(){
        return length;
    }



}
