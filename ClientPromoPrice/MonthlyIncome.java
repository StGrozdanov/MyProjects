import java.util.Scanner;

public class MonthlyIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // PREVIOUS MONTH: 242.05 LV

        System.out.println("Welcome to the program! Please enter the previous month income of Lait Capital.");
        double lastMonthlyOrder = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter the current month.");
        String month = scanner.nextLine();
        System.out.println("Please, enter the ordered product and then the quantity. When finished, write Finish.");
        String orderType = scanner.nextLine();

        double cartridge2320 = 0;
        double drum2300 = 0;
        double drum2401 = 0;
        double cartridge2421 = 0;
        double cartridge205 = 0;
        double cartridge209 = 0;
        double cartridge230X = 0;

        double totalPrice2320 = 0;
        double totalPrice2300 = 0;
        double totalPrice2401 = 0;
        double totalPrice2421 = 0;
        double totalPrice205 = 0;
        double totalPrice209 = 0;
        double totalPrice230X = 0;

        double orderPrice = 0;

        String category = "Category 1: Up to 150 lv/Month.";

        while (!"Finish".equals(orderType)) {

            int quantity = Integer.parseInt(scanner.nextLine());

            if (lastMonthlyOrder <= 150) {
                switch (orderType) {
                    case "2320":
                        cartridge2320 = 19.15;
                        totalPrice2320 = cartridge2320 * quantity;
                        break;
                    case "2300":
                        drum2300 = 32.90;
                        totalPrice2300 = drum2300 * quantity;
                        break;
                    case "2401":
                        drum2401 = 35.80;
                        totalPrice2401 = drum2401 * quantity;
                        break;
                    case "2421":
                        cartridge2421 = 29.20;
                        totalPrice2421 = cartridge2421 * quantity;
                        break;
                    case "205":
                        cartridge205 = 53.00;
                        totalPrice205 = cartridge205 * quantity;
                        break;
                    case "209":
                        cartridge209 = 40.00;
                        totalPrice209 = cartridge209 * quantity;
                        break;
                    case "230X":
                        cartridge230X = 44.40;
                        totalPrice230X = cartridge230X * quantity;
                        break;
                }
            } if (lastMonthlyOrder > 150 && lastMonthlyOrder < 250) {
                switch (orderType) {
                    case "2320":
                        cartridge2320 = 17.55;
                        totalPrice2320 = cartridge2320 * quantity;
                        break;
                    case "2300":
                        drum2300 = 30.15;
                        totalPrice2300 = drum2300 * quantity;
                        break;
                    case "2401":
                        drum2401 = 32.80;
                        totalPrice2401 = drum2401 * quantity;
                        break;
                    case "2421":
                        cartridge2421 = 27.90;
                        totalPrice2421 = cartridge2421 * quantity;
                        break;
                    case "205":
                        cartridge205 = 48.55;
                        totalPrice205 = cartridge205 * quantity;
                        break;
                    case "209":
                        cartridge209 = 40.00;
                        totalPrice209 = cartridge209 * quantity;
                        break;
                    case "230X":
                        cartridge230X = 40.65;
                        totalPrice230X = cartridge230X * quantity;
                        break;
                }
                category = "Category 2: 150-250 lv/Month.";
            }
            if (lastMonthlyOrder > 250) {
                switch (orderType) {
                    case "2320":
                        cartridge2320 = 16.75;
                        totalPrice2320 = cartridge2320 * quantity;
                        break;
                    case "2300":
                        drum2300 = 28.80;
                        totalPrice2300 = drum2300 * quantity;
                        break;
                    case "2401":
                        drum2401 = 31.30;
                        totalPrice2401 = drum2401 * quantity;
                        break;
                    case "2421":
                        cartridge2421 = 26.65;
                        totalPrice2421 = cartridge2421 * quantity;
                        break;
                    case "205":
                        cartridge205 = 46.35;
                        totalPrice205 = cartridge205 * quantity;
                        break;
                    case "209":
                        cartridge209 = 38.25;
                        totalPrice209 = cartridge209 * quantity;
                        break;
                    case "230X":
                        cartridge230X = 38.80;
                        totalPrice230X = cartridge230X * quantity;
                        break;
                }
                category = "Category 3: Above 250 lv/Month.";
            }

            orderPrice = totalPrice205 + totalPrice209 + totalPrice230X + totalPrice2300 + totalPrice2320 + totalPrice2401 + totalPrice2421;

            orderType = scanner.nextLine();
        }

        System.out.printf("The prices for Lait Capital in %s are %s%n", month, category);
        System.out.printf("Cartridge 2320 Price is %.2f lv.%n", cartridge2320);
        System.out.printf("Drum 2300 Price is %.2f lv.%n", drum2300);
        System.out.printf("Cartridge 2421 Price is %.2f lv.%n", cartridge2421);
        System.out.printf("Drum 2401 Price is %.2f lv.%n", drum2401);
        System.out.printf("Cartridge 205E Price is %.2f lv.%n", cartridge205);
        System.out.printf("Cartridge 209L Price is %.2f lv.%n", cartridge209);
        System.out.printf("Cartridge 230X Price is %.2f lv.%n", cartridge230X);
        System.out.printf("Total income from Lait Capital this month is %.2f lv.%n", orderPrice);
    }
}

