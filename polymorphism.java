
/*public class polymorphism
{
    /*static int add(int a,int b)
    {
        int c=a+b;
        return c;
    }
    static int add(int a,int b,int c)       //method overloading:same class name bt different parameters
    {
        int d=a+b+c;
        return d;
    }
    public static void main(String[] args)
    {
        System.out.println(polymorphism.add(10,22));
        System.out.println(polymorphism.add(10,22, 33));
    }*/

/*static String animal(String a,String b)
{
   String c=a+b;
   return c;
}
static String animal(String a,String b,String c,String d)
{
    String e=a+b+c+d;
    return e;
}
public static void main(String[] args)
{
    System.out.println(polymorphism.animal("Hii" ,"World"));
    System.out.println(polymorphism.animal("Hii" ,"World" ,"hello", "world"));
}*/
class india
{
    void country() {
        System.out.println("India is my county");
    }

      }
class AP
{
    void country()
    {
        System.out.println("AP in India");    //fuction overridding
    }
}
public class polymorphism
{
public static void main(String[] args)
{
    AP a1=new AP();
    a1.country();
    india i1=new india();
    i1.country();


}

}
