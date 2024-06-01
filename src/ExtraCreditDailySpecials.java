import java.util.Scanner;
public class ExtraCreditDailySpecials {




        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String day;

            do {
                System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only)");
                day = input.next();

                if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
                    System.out.println("Please enter a weekday, not weekend!");
                }
            } while (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday"));

            String coffee;
            double price;
            int quantity;

            switch (day) {
                case "monday":
                    coffee = "Latte";
                    price = 4.95;
                    break;
                case "tuesday":
                    coffee = "Frappe";
                    price = 5.95;
                    break;
                case "wednesday":
                    coffee = "Cappuccino";
                    price = 4.35;
                    break;
                case "thursday":
                    coffee = "Regular Joe";
                    price = 2.95;
                    break;
                case "friday":
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    break;
                default:
                    System.out.println("Invalid input!");
                    return;
            }

            System.out.printf("%s's coffee of the day is a %s and the price will be $%.2f%n", day, coffee, price);
            System.out.printf("How many %s would you like to order? ", coffee);
            quantity = input.nextInt();

            if (quantity == 0) {
                System.out.printf("Looks like you don't like %s! So sad!!%n", coffee);
            } else {
                double totalPrice = quantity * price;
                System.out.printf("Your total price for %d %s will be $%.2f%n", quantity, coffee.toLowerCase(), totalPrice);
            }
        }
    }
