package src.com.vio.pattern.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class NamingStrategyService {

    private List<NamingStrategy> namingStrategyList;

    public NamingStrategyService() {
        namingStrategyList = new ArrayList<>();
        namingStrategyList.add(new FirstNameFirstStrategy());
        namingStrategyList.add(new LastNameFirstStrategy());
    }

    public String returnFormattedName(String firstName, String lastName, NamingStrategies namingStrategyType) {
        return namingStrategyList.stream()
                .filter(namingStrategy -> namingStrategy.applicable(namingStrategyType))
                .map(namingStrategy -> namingStrategy.fullNameFormatted(firstName, lastName))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("namingStrategyType not found"));
    }


}
