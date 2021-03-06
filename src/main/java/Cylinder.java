public class Cylinder extends Circle {
    double h;

    public Cylinder(int r, double h) {
        super(r);
        this.h = h;
    }

    @Override
    public double getArea() {
        return 2 * (PI * r * r) + (2 * PI * r) * h;
    }

    @Override
    public double getPerim() {
        return r;
    }

    @Override
    public void show() {
        System.out.printf("圆柱体的半径：%d\n周长：%f\n面积：%f\n", r, this.getPerim(), this.getArea());
    }
}
