public class array {
    public static void main(String[] args) {
       /* String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[3]);
        System.out.println(cars.length);
        cars[3]="Maruthi";
        System.out.println(cars[3]);
    }*/
        int[][] arr = new int[5][10];
        for (int i = 2; i <= 6; i++) {
            for (int j = 1; j <= 10; j++) {
                arr[i - 2][j - 1] = i * j;
            }
            for (int[] x : arr) {
                for (int y : x) {
                    System.out.print(y + " ");
                }
                System.out.print("\n");
            }
        }
    }
}


