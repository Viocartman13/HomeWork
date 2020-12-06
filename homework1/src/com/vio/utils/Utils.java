package src.com.vio.utils;

import src.com.vio.exercise8.Addition;
import src.com.vio.exercise8.MathematicalOperation;
import src.com.vio.exercise8.Subtraction;

import java.util.*;
import java.util.stream.Collectors;

public class Utils {

    public void testMethod() {
    }

    public static Optional<Integer> randomOptionalGenerator() {
        return Math.random() >= 0.5 ? Optional.of(1) : Optional.empty();
    }

    public static void printMessageAccordingToList(List<Integer> list) {
        if (list instanceof ArrayList<Integer> arrayList) {
            System.out.println("printed array list");
            for (Integer element : arrayList) {
                System.out.println("array list element : " + element);
            }
        } else if (list instanceof LinkedList<Integer> linkedList && !linkedList.isEmpty()) {
            System.out.println("printed linked list in reverse order");
            Iterator<Integer> reverseIterator = linkedList.descendingIterator();
            while (reverseIterator.hasNext()) {
                System.out.println("linked list element: " + reverseIterator.next());
            }
        } else {
            System.out.println("disappointing error message");
        }
    }

    public static String checkDayOfTheWeek(DaysOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "workday";
            case SATURDAY, SUNDAY -> "weekend";
        };
    }

    public static void generateViewTemplate(Map<String, String> values) {
        var htmlTemplate = """
                    <!DOCTYPE html>
                    <html>
                    <body>
                    
                    <h1>Hello ${name}. ${greeting}</h1>
                    
                    </body>
                    </html>

                """;

        var replacedHtmlTemplate = htmlTemplate.replace("${name}", values.get("name")).replace("${greeting}", values.get("greeting"));

        System.out.println("Html template: " + replacedHtmlTemplate);
    }

    public static Integer differenceCalculator(List<Integer> values) {

        return values.stream().collect(Collectors.teeing(
                Collectors.reducing(Integer::max),
                Collectors.reducing(Integer::min),
                (max, min) -> max.get() - min.get()));
    }

    public static boolean checkOperationTypes(MathematicalOperation operation1, MathematicalOperation operation2) {
        return (operation1 instanceof Addition && operation2 instanceof Addition) ||
                (operation1 instanceof Subtraction && operation2 instanceof Subtraction);
    }

}

