//parent class
class teacher
{
    void specialization()
    {
        System.out.println("Teacher:Specialization");
    }
}
//child class1
class student1 extends teacher
{
    void maths()
    {
        System.out.println("Maths");
    }
}
//child class2
class student2 extends teacher
{
    void science()
    {
        System.out.println("Science");
    }
}
//main class
public class hierarchial_inheritance
{
    public static void main(String[] args) {
        student2 s2 = new student2();
        s2.science();
        s2.specialization();
        student1 s1 = new student1();
        s1.maths();
        s1.specialization();
    }

}
