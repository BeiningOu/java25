package project25;

public class SwitchPractice {

    public static void main(String[] args) {

        int choice = 2;

        switch (choice){
            case 1:
                System.out.println("You chose 1");
                break;
            case 2:
                System.out.println("You chose 2");
                break;
            default:
                System.out.println("Invalid.");
        }

        //enum here is a keyword for create Enum class

        enum Day {Mon, Tue, Wed, Thur, Fri, Sat, Sun};

        Day day = Day.Fri;


        //Enhanced switch (Java 12+ with ->):
        //In the enhanced switch syntax, the use of -> makes the break unnecessary.
        // When a case matches, the associated code runs,
        // and the switch statement automatically exits after executing that case.
        // There is no fall-through behavior, so you don't need to use break.

        switch(day) {
            case Mon -> System.out.println("Monday");
            case Tue -> System.out.println("Tuesday");
            case Wed -> System.out.println("Wednesday");
            case Thur -> System.out.println("Thursday");
            case Fri -> System.out.println("Friday");
            case Sat -> System.out.println("Saturday");
            case Sun -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }






    }
}
