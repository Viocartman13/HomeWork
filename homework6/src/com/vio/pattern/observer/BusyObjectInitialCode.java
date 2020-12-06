package src.com.vio.pattern.observer;

import java.time.LocalDate;

public class BusyObjectInitialCode {
    private Integer id;
    private String name;
    private LocalDate creationDate;

    public void updateObjectAndDependencies(String name, LocalDate creationDate) {
        this.name = name;
        if (creationDate.isBefore(this.creationDate)) {
            throw new IllegalArgumentException("The date can't be set before the original creation date");
        }

        addHistoryMessage();
        updateChildren();
    }

    private void addHistoryMessage() {
        // do nothing
    }

    private void updateChildren() {
        // do nothing
    }

}

