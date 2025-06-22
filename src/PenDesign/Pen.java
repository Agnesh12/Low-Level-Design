package PenDesign;


public abstract class Pen {

    protected String color;
    protected String brand;

    public Pen(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }
     public abstract void write();

    public static void main(String[] args) {
        Pen pen1 = new BallPen("Reynolds", "Blue");
        Pen pen2 = new FoundainPen("Parker", "Black");
        Pen pen3 = new GelPen("galand", "Blue");
        pen1.write();
        pen2.write();
        pen3.write();
    }

}
 class BallPen extends Pen {

    public BallPen(String color, String brand) {
        super(color, brand);
    }

    @Override
     public void write() {
        System.out.println("PenDesign.BallPen is Written : " + brand);
    }

}
class FoundainPen extends Pen {
    public FoundainPen(String color, String brand) {
        super(color, brand);
    }

    @Override
    public void write() {
        System.out.println("PenDesign.FoundainPen is Written : " + brand);
    }
}
class GelPen extends Pen {
    public GelPen(String color, String brand) {
        super(color, brand);
    }

    @Override
    public void write() {
        System.out.println("PenDesign.GelPen is Writting Smoothly :" + brand);
    }
}



