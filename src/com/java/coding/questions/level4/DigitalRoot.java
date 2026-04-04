public class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int number = sc.nextInt();

        while (number >= 10) {
            int sum = 0;
            int temp = number;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            number = sum;
        }

        System.out.println("Digital Root = " + number);
        sc.close();
    }
}
