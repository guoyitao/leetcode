
public class Ractangle implements Shape {
    float chang;
    float kuan;

    public Ractangle(float c, float k) {
        this.chang = c;
        this.kuan = k;
    }

    public double getArea() {
        return chang * kuan;
    }

    public double getPerim() {
        return (chang+kuan)*2;
    }

    public void show() {
        System.out.printf("矩形的长是%f\n宽是%f\n面积是%f\n周长是%f\n",chang,kuan,getArea(),getPerim());
    }
}
