
public class Rectange() {

  private double height;
  private double width;

  public Rectangle(double height, double width){
      this.height = height;
      this.width = width;
  }

  public double getPerimeter() {
    return ((this.height*2) + (this.width*2));
  }

  public double getArea() {
    return (this.height * this.width);
  }

}
