class Color{
    void Paint(){
        System.out.println("I am painting");

    }
}
class RedPaint extends Color{
    void Paint(){
        System.out.println("I am painting with red Color");

    }
}
class Bluepaint extends Color{
    void Paint(){
        System.out.println("I am painting with Blue Color");
    }
}
public class Polly {

    public static void main(String[] args) {
        Color c;
        c = new RedPaint();
        c.Paint();
        c = new Bluepaint();
        c.Paint();

    }
}