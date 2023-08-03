public class Main {
    public static void main(String[] args) {

        int numberOfkids = 0;
        int numberOfadults = 0;
        int numberOfretired = 0;

        int[] ageOfvisitors = {25, 18, 31, 61, 52, 14, 10, 11, 13, 70, 34, 21};

        for (int i = 0; i < ageOfvisitors.length; i++) {
            int categoryOfvisitors = ageOfvisitors[i];
            if (categoryOfvisitors <= 15) {
                numberOfkids++;
            }
            if (categoryOfvisitors >= 16 && categoryOfvisitors < 60) {
                numberOfadults++;
            }
            if (categoryOfvisitors >= 60) {
                numberOfretired++;
            }
        }
        System.out.println("Counted number of visitors for category: ");
        System.out.println("Number of kids: " + numberOfkids);
        System.out.println("Number of adults: " + numberOfadults);
        System.out.println("Number of retired: " + numberOfretired);
    }
}
