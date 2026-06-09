package Module2.day1.FunctInterface;

public class Main1 {
    public static void main(String[] args) {
//        class GM implements
        Greeting gm = ()->{
                System.out.println("Good Morning");
        };
        gm.greet();

//        class GN implements
        Greeting gn = ()-> {
                System.out.println("Good Night");
        };
        gm.greet();

        Greeting ge = ()-> {
                System.out.println("Good Evening");
        };
        gn.greet();
        Greeting GF =()-> {
                System.out.println("Good Afternoon");
        };
        GF.greet();

    }
}
