public class Road_Toll_mainpage {
    public static void main(String[] args)
    {
        Road_toll rt1=new Road_toll();
        rt1.type="BMW";
        rt1.tiresCount=4;
        rt1.calculateToll();
        Road_toll rt2= new Road_toll("truck", 6);
        rt2.calculateToll();



    }
}

