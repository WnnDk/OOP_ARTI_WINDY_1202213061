package MODUL3_WINDY.kalkulator;
public class Calculation implements Runnable{
    private double radius;
    private double side;
    private double area;
    private final double phi = 3.14;

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getArea(){
        return area;
    }

    public void setArea(double area){
        this.area= area;
    }

    public double getPhi(){
        return phi;
    }

    public void setSquare(double side) throws IllegalArgumentException{
        if (side < 1){
            throw new IllegalArgumentException("Sisi yang ditentutkan harus lebih dari atau sama dengan 1!");
        }
        this.area = side*side;
    }

    public double getSquare(){
        return this.area;
    }

    public void setCircle(double radius) throws IllegalArgumentException{
        if (radius < 1){
            throw new IllegalArgumentException("Sisi yang ditentutkan harus lebih dari atau sama dengan 1!");
        }
        this.area= phi*radius*radius;
    }

    public double getCircle() {
        return this.area;
    }
    
    public void setTrapezoid(double s1,double s2,double t) throws IllegalArgumentException{
        if(s1<1 || s2 <1 || t <1){
            throw new IllegalArgumentException("Sisi dan tinggi yang ditentutkan harus lebih dari atau sama dengan 1!");
        }
        this.area = ((s1+s2)/t);
    }

    public double getTrapezoid(){
        return this.area;
    }

    @Override
    public void run() {
    System.out.println("\n====Program will start operatre in====\n");
    for (int i = 3; i > 0; i--) {
      try {
        System.out.println("Countdown in "+i);
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("Error just happen");
      }
    }
  }
}
