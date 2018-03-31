public class currency {

    public static void main(String[] arg){
        menu first = new menu();
        Counter c = new Counter();
        first.showMenu();
        c.setZm1(first.getX());
        c.setZm2(first.getY());
        c.set();
        c.count();
    }
}
