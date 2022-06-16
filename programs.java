public class programs {
    public static void main(String[] args) {
        /*int i,m=0,flag=0;
        int num=10;//it is the number to be checked
        m=num/2;
        if(num==0||num==1){
            System.out.println(num+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(num%i==0){
                    System.out.println(num+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                System.out.println(num+" is prime number");
            }
        }//end of else*/
        /*int n1=0,n2=1,n3,i,count=5;
         System.out.println(n1+"");       // fibonacci
        for(i=0;i<=count;++i)
        {
            n3 = n1 + n2;
            System.out.println(""+n3);
            n1 = n2;
            n2 = n3;
        }*/
        /*int i, fact = 1;
        int n = 5;// number to calculate fact
        for (i = 0; i < n; i++)
        {
            fact = fact * 1;
        }
        System.out.println("Factorial of " + n + " is: " + fact);*/
        /*int n=20;
        System.out.println("List of even numbers from 1 to "+n+" : ");
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+"");
            }*/
        int n=123,num,temp,total=0;
        num=n;
        while(num!=0)
        {
            temp=n%10;
            total=total+temp*temp*temp;
            num=num/10;
        }
        if(total==num)
        {
            System.out.println(n + " is an Armstrong number.");
        }
        else
            {
            System.out.println(n + " is not  an Armstrong number.");
            }
        /*int n=4;
        int square=n*n;
        System.out.println("The square of "+n+" is : " +square);*/  //square of number


    }

    }

