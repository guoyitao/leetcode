

public class Circle implements Shape {
    int r;
    public Circle(int r) {
        this.r=r;
    }

    public double getArea() {
        return PI*r*r;
    }

    public double getPerim() {
        return 2*PI*r;
    }

    public void show() {
        System.out.println("圆的半径是："+r+"\n面积是："+this.getArea()+"\n周长是："+this.getPerim());
    }
}
