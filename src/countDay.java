import java.util.Scanner;

public class countDay {
    public static void main(String[] args) {
        int dayNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap thang can dem");
        dayNumber = scanner.nextInt();
        switch (dayNumber) {
            case 2 :
                System.out.println("Thang " + dayNumber + " co 28 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("Thang " + dayNumber + " co 31 ngay ");
                break;
            case 4 :
            case 6 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("Thang " + dayNumber + " co 30 ngay");
                break;

        }
    }
}

