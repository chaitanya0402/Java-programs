public class practise {
    public static void main(String[] args){
        int n1 = 44;
        int n2 = 60;
        int n3 = 30;
        if (n1 > n2 && n1 > 3) {
            System.out.println(n1 + "is bigger");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is bigger");
        } else {
            System.out.println(n3 + " is bigger");
        }

        int n4 = 44;
        float n5 = 120.55f;
        if (n4 > n5 ) {
            System.out.println(n4 + "is bigger");

        } else {
            System.out.println(n5 + " is bigger");
        }
        int k=0;
        System.out.println("Printing 10 values");
        do{
            System.out.println(k);
            k=k+2;
        }
        while(k<=10);




    }
}
