public class Road_toll {
    String type;
    int tiresCount;

    public void calculateToll() {
        if (tiresCount == 2)
            System.out.println("Your toll amount is 20");
        else if (tiresCount == 4)
            System.out.println("Your toll amount is 40");
        else if (tiresCount > 4)
            System.out.println("Your toll amount is 60");
        else
            System.out.println("Incorrect tire count");
    }

        public Road_toll()
        {
            System.out.println("Constructor is executed");
        }
        public Road_toll(String type, int tiresCount)
        {
            this.type=type;
            this.tiresCount=tiresCount;
        }
}



