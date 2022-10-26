public class Animal
{
   String color;
   String noOfLegs;
   
   public Animal(){
       
   }
   
   public Animal(String color, String noOfLegs){
       this.color = color;
       this.noOfLegs = noOfLegs;
       
   }
   
   public String getColor(){
       return color;
   }
   
   public void setColor(String newColor){
       this.color = color;
   }
   
   public String getNoOfLegs(){
       return noOfLegs;
   }
   
   public void setNoOfLegs(String newNoOfLegs){
       this.noOfLegs = noOfLegs;
   }
   
   public void showInfo(){
      System.out.println(color);
      System.out.println(noOfLegs);
    }
}
