package ua.hillel.lessons.lesson14.initilizationblock.classes.inner;

public class launch {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.showInner();

        StaticOuter.InnerStaticDemo staticOuter = new StaticOuter.InnerStaticDemo();
        staticOuter.my_method();

        LocalMethodOuter localMethodOuter= new LocalMethodOuter();
        localMethodOuter.myLocalMethod();
    }
}
