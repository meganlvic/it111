public class MyOperators {}

        public static void main (String[] args) {

            // Arithmetic operators
            //employee, wage, hours worked, overtime, the whole enchilada

            int regHours, overtimeHours;
            double overtimePay, regularPay, total;
            float wage;
            double hourlyWithOvertime;

            regHours = 40;
            overtimeHours = 5;
            wage = 25.50F;
            regularPay = regHours * wage;
            overtimePay = (wage * 1.5) * overtimeHours;
            total = overtimePay + regularPay;
            hourlyWithOvertime = total / (regHours + overtimeHours);

            System.out.println("Regular pay = $" + regularPay + "dollars");
            System.out.printf("$%.2f", hourlyWithOvertime);
            System.out.println("$%.2f" , hourlyWithOvertime);

            int number1, number2, number3;
            number1 = 2576;
            number2 = 2;
            number3 = number1 % number2;

            System.out.println(number3);

            if(number3 == 0) {

                System.out.println(number1 + ""is an even number"");

            } else {
                System.out.println(number1 + "is an odd number"");


            }

            // we are now going shopping
            double tax, priceOfItem, taxOnItem, totalPrice
            tax = .10;
            priceOfItem = 100;
            taxOnItem = priceOfItem * tax;
            totalPrice = priceOfItem + taxOnItem;

            System.out.println("Price of Item $" +priceOfItem " dollars "");
            System.out.println("Tax $" +taxOnItem" dollars "");
            System.out.println("Price including Tax $" +totalPrice " dollars "");

           double priceOfItem = 100;
            // tax is 10 percent

            double priceOfItem = 100;
         priceOfItem *= 1.10;

            System.out.println("Total price of item is " priceOfItem" dollars");
            System.out.println("Total price of item is: ");
            System.out.printf("$%.2f", priceOfItem");
            System.out.println("dollars ");

            // boolean operators

 //           boolean tuna = true;
            //boolean bread = false;
 //           if(tuna == true && bread == true) {
 //               System.out.println("We are having a sandwich!");
 //           } else {
 //               System.out.println("We are not!");

                boolean tuna = false;
                boolean bread = true;
                if(tuna == true || bread == true) {
                    System.out.println("We are having some food products");
                }  else {
            System.out.println("We will not be eating any food products today");
            }

              // age - drinking age!

        int age = 18;
        if (age >== 18) {
            System.out.println("Vippy Skippy, we can order an adult beverage");
        } else {
            System.out.println("We will have a diet coke");

            // amusement park roller coaster rider - smaller than 4 feet

            float height = 3.9f;

            if(height < 4) {
                System.out.println("You will not be able to ride the roller coaster");
            } else {
                System.out.println("You will be able to have a great time on the roller coaster");

        }
        }

