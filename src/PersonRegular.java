public class PersonRegular {

    public static void main(String[] args) {
        // Create variables
        String firstPersonName = "Cathy";
        String secondPersonName = "Kendall";
        char firstPersonGender = 'F';
        char secondPersonGender = 'M';
        int firstPersonAge = 33;
        int secondPersonAge = 22;
        String firstPersonCar = "Volkswagen Bug";
        String secondPersonCar = "Mustang";
        boolean firstPersonViolations = false;
        boolean secondPersonViolations = false;
        int firstPersonCreditScore = 698;
        int secondPersonCreditScore = 678;

        double monthlyRate1;
        double monthlyRate2;

        double adjustedRate1;
        double adjustedRate2;

        // Calculate monthly rates based on violations and credit scores
        if (firstPersonViolations == true && firstPersonCreditScore <= 700) {
            monthlyRate1 = 500;
        } else {
            monthlyRate1 = 100;
        }

        if (secondPersonViolations == true && secondPersonCreditScore <= 700) {
            monthlyRate2 = 500;
        } else {
            monthlyRate2 = 100;
        }

        // Adjust rates based on age and gender
        if (firstPersonAge <= 25 && firstPersonGender == 'F') {
            adjustedRate1 = 100;
        } else {
            adjustedRate1 = 0;
        }

        if (secondPersonAge <= 25 && secondPersonGender == 'M') {
            adjustedRate2 = 100;
        } else {
            adjustedRate2 = 0;
        }

        // Print out the information
        System.out.println("First Person Name: " + firstPersonName);
        System.out.println("First Person Gender: " + firstPersonGender);
        System.out.println("First Person Age: " + firstPersonAge);
        System.out.println("First Person Car: " + firstPersonCar);
        System.out.println("First Person Violations: " + firstPersonViolations);
        System.out.println("First Person Monthly rate: " + monthlyRate1);
        System.out.println("First Person Credit Score: " + firstPersonCreditScore);

        System.out.println("Second Person Name: " + secondPersonName);
        System.out.println("Second Person Gender: " + secondPersonGender);
        System.out.println("Second Person Age: " + secondPersonAge);
        System.out.println("Second Person Car: " + secondPersonCar);
        System.out.println("Second Person Violations: " + secondPersonViolations);
        System.out.println("Second Person Monthly rate: " + monthlyRate2);
        System.out.println("Second Person Credit Score: " + secondPersonCreditScore);
    }
}
