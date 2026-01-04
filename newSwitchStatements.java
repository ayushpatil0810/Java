public class newSwitchStatements {
    public static void main(String[] args) {
        int n = 5;

        // switch(n) {
        //     case 1 -> System.out.println("Sunday");
        //     case 2 -> System.out.println("Monday");
        //     case 3 -> System.out.println("Tuesday");
        //     case 4 -> System.out.println("Wednesday");
        //     case 5 -> System.out.println("Thursday");
        //     case 6 -> System.out.println("Friday");
        //     case 7 -> System.out.println("Saturday");
        //     default -> System.out.println("Invalid Number"); 
        // }
        
        String result = "";
        result = switch(n) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid Number";
        };

        System.out.println(result);

        result = switch(n) {
            case 1 : yield "Sunday";
            case 2 : yield "Monday";
            case 3 : yield "Tuesday";
            case 4 : yield "Wednesday";
            case 5 : yield "Thursday";
            case 6 : yield "Friday";
            case 7 : yield "Saturday";
            default : yield "Invalid Number";
        };
    }
}
