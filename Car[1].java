public class Car {

  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
  
  public void overspeed(int max, int min) {
     System.out.println("Max Spped is: " +max);
     System.out.println("Min speed is: " +min);
     System.out.println("Total Max speed is " +(min+max));
  }
  

  public static void main(String[] args) {
    Car myCar = new Car();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
    myCar.overspeed(300, 30);
  }
}
