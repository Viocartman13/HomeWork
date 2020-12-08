package src.com.vio.pattern.observer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BusyObject implements Subject {
    private Integer id;
    private String name;
    private LocalDateTime creationDate;
    private final List<Observer> observerList = new ArrayList<>();

    public void updateObjectAndDependencies(String name, LocalDateTime creationDate) {
        this.name = name;
        if (creationDate.isBefore(this.creationDate)) {
            throw new IllegalArgumentException("The date can't be set before the original creation date");
        }

        updateChildren(createMessage(creationDate.toString()));
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);

    }

    public void updateChildren(String message) {
        for (Observer observer : observerList) {
            observer.subscribe(message);
        }
    }

    private String createMessage(String updateDate) {
        StringBuilder messageBuilder = new StringBuilder("Object with id ");
        messageBuilder.append(this.id.toString()).append(" was updated on ").append(updateDate);

        return messageBuilder.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

}

