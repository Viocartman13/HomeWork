package src.com.vio.pattern.strategy;

public interface NamingStrategy {

    boolean applicable(NamingStrategies type);

    String fullNameFormatted(String firstName, String lastName);
}
