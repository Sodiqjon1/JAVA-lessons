import java.util.Scanner;

public class test{
    public static void main(String[] args) {
////        test alfa
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("yoshni yoz: ");
//        int alfa=  scanner.nextInt();
//        if (alfa >= 7 && alfa <=18) {
//            System.out.println("Oqisen boladi");
//        } else {
//            System.out.println("Mk ga kiromisan");
//        }

////        beta
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Boy: ");
//        int beta=  scanner.nextInt();
//        System.out.println("ves: ");
//        int gama=  scanner.nextInt();
//        System.out.println("pul: ");
//        int delta= scanner.nextInt();
//        if (beta >= 180 && gama>=70 && gama<90 && delta==3000) {
//            System.out.println("Ishka olindin.");
//            System.out.println("Vashe zvaniya:Redavoy");
//        } if (delta>3000) {
//            System.out.println("Assalomu alaykum orto general.");
//            System.out.println("Vashe zvaniya:General");
//
//        } else {
//            System.out.println("Boshqa ish qidir.");
//            System.out.println("'Nishi'");
//        }

////        gama
////        (% qoldiq topadi)
//        int a=5;
//        int b=6;
//        int c=9;
//        int d=10;
//        int f=11;
//        System.out.println(a*b-c/d+a-f);

////        delta
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Son: ");
//        int alfa=  scanner.nextInt();
//        int beta=alfa%10;
//        int gama=alfa/10%10;
//        int delta=alfa/100;
//        System.out.println(beta+gama+delta);

////        epsilont
//
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Son: ");
//        int alfa=  scanner.nextInt();
//        int beta=alfa%10;
//        int gama=alfa%100/10;
//        int delta=alfa/100;
//        System.out.println(beta*100+gama*10+delta);

////        zeta
//
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Son: ");
//        int alfa = scanner.nextInt();
//        if (alfa > 999 && alfa <= 9999) {
//            int beta = alfa%10;
//            int gama = alfa%100/10;
//            int delta = alfa%1000/100;
//            int epsilont = alfa/1000;
//            System.out.println(beta*1000+gama*100+delta*10+epsilont);
//        }
//        else {
//            System.out.println("Error");
//        }

//        eta

        int alfa=123456789;
        int beta=0;
        while (alfa>0){
            int beta=alfa%10;
            beta=beta*10+beta;
            alfa=alfa/10;
        }
    }
}

