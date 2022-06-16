public class static_variable {
    void display()
    {
        System.out.println("A non-static function is called.");
        System.out.println("Non-Static");
    }
    //static function
    static void show()
    {
        System.out.println("The static function is called.");
    }

    public static void main(String[] args)
    {
//creating an object of the class A
        static_variable sv = new static_variable();
//calling a the non-static function by using the object of the class
        sv.display();
//calling a static function by using the class name
        static_variable.show();
    }
}
