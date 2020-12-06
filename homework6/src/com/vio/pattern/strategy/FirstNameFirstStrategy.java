package src.com.vio.pattern.strategy;

public class FirstNameFirstStrategy implements NamingStrategy {

    @Override
    public boolean applicable(NamingStrategies type) {
        return type.equals(NamingStrategies.FIRST_NAME_FIRST);
    }

    @Override
    public String fullNameFormatted(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
