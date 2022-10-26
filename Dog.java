public class Dog extends Animal
{
    String dogName;
    
    public Dog(){
        
    }
    
    public String getDogName(){
       return dogName;
    }
   
    public void setDogName(String newDogName){
       this.dogName = dogName;
    }
    
    
    public Dog(String noOfLegs, String color){
        super(noOfLegs, color);
        this.dogName = "Suzy";
    }
    
    public void showInfo(){
        System.out.println("My dog name is " +dogName + ".");
        System.out.println("She is color " + color + ".");
        System.out.println("It has " + noOfLegs + " legs.");
    }
    
}
