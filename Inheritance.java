/*Multi level Inheritance*/
class twowheeler
{
    void latest()
    {
        System.out.println("Latest two-wheeler");
    }
}

/* Single level Inheritance*/
//parent class
class bike extends twowheeler
{
    void ride()
    {
        System.out.println("Exclusive Bike");
    }
}
//child class
class honda extends bike
{
    void speed()
    {
      System.out.println("Honda speed bike");
    }
}

public class Inheritance {
    public static void main(String[] args)
    {
        honda h=new honda();
        h.speed();
        h.ride();
        h.latest();


    }
}
