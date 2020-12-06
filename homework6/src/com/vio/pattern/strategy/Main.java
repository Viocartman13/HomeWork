package src.com.vio.pattern.strategy;

public class Main {

    public static void main(String[] args) {

        NamingStrategyService service = new NamingStrategyService();

        String firstNameFirstResult = service.returnFormattedName("First name", "Last name", NamingStrategies.FIRST_NAME_FIRST);

        System.out.println("Result for first name first strategy: " + firstNameFirstResult);

        String lastNameFirstResult = service.returnFormattedName("First name", "Last name", NamingStrategies.LAST_NAME_FIRST);

        System.out.println("Result for last name first strategy: " + lastNameFirstResult);
    }
}
