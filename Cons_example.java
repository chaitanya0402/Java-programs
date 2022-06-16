public class Cons_example {

        int i,j;
        String str;
        // constructor with no parameter
        public Cons_example() {

            System.out.println("Constructor is called");
        }
        //constructor with one parameter
        public Cons_example(int i)
    {
        this.i=i;
        System.out.println("Value:"+i);
    }
       // constructor with parameter
        public  Cons_example(String str,int j)
            {
               this.str=str;
               this.j=j;
               System.out.println("Value:"+str+j);

            }
            void display()
            {
                System.out.println("Value of i:"+i+"  Value of j:"+j+"  Value of str:"+str);
            }


        public static void main(String[] args) {

            //calling the constructor without any parameter
            Cons_example c1 = new Cons_example();
            //calling constructor with parameter
            Cons_example c2=new Cons_example("Hii",10);
            Cons_example c3=new Cons_example(20);
            c1.display();
            c2.display();
            c3.display();
        }
    }

