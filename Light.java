//Compute distance light travels using long varaibles
class Light {
  public static void main(String args[]) {
    int lightspeed;
    long days;
    long seconds;
    long distance;

    //approximate speed of light in miles per seconds

    lightspeed = 186000;
    days = 1000; //Specify number of days here
    seconds = days * 24 * 60 * 60; //Convert to seconds
    distance = lightspeed * seconds; //Compute distance
    
    System.out.print("In " + days);
    System.out.print(" days light will travel about ");
    System.out.println(distance + " miles");
  }
}
