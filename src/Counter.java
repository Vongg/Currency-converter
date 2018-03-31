public class Counter {
    static final double bmPLN = 2.30;
    static final double bmUSD = 5.06;
    static final double bmGBP = 4.19;
    static final double bmEUR = 4.45;
    static final double bmCHF = 6.36;

    static int zm1 = 0;
    static int zm2 = 0;
    double a = 0;
    double b = 0;
    double wynik = 0;

    public static void setZm2(int zm2) {
        Counter.zm2 = zm2;
    }

    public static void setZm1(int zm1) {
        Counter.zm1 = zm1;
    }

    public void set(){
        switch(zm1) {
            case 1:
                a = bmPLN;
                break;

            case 2:
                a = bmUSD;
                break;

            case 3:
                a = bmGBP;
                break;

            case 4:
                a = bmEUR;
                break;

            case 5:
                a = bmCHF;
                break;
        }

            switch(zm2){
                case 1:
                    b = bmPLN;
                    break;

                case 2:
                    b = bmUSD;
                    break;

                case 3:
                    b = bmGBP;
                    break;

                case 4:
                    b = bmEUR;
                    break;

                case 5:
                    b = bmCHF;
                    break;
            }
        //System.out.print("A"+" " +a);
        //System.out.print("b"+ " " + b);

    }

    public void count(){
        wynik = b/a;
        System.out.format("Wynik %.2f", wynik);
    }
}
