package src.com.vio.pattern.strategy;

public class LastNameFirstStrategy implements NamingStrategy {

    @Override
    public boolean applicable(NamingStrategies type) {
        return type.equals(NamingStrategies.LAST_NAME_FIRST);
    }

    @Override
    public String fullNameFormatted(String firstName, String lastName) {
        return lastName + " " + firstName;
    }
}
