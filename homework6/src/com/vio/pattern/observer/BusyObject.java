package src.com.vio.pattern.observer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BusyObject implements Subject {
    private Integer id;
    private String name;
    private LocalDateTime creationDate;
    private final List<MyObserver> observerList = new ArrayList<>();

    public void updateObjectAndDependencies(String name, LocalDateTime creationDate) {
        this.name = name;
        if (creationDate.isBefore(this.creationDate)) {
            throw new IllegalArgumentException("The date can't be set before the original creation date");
        }

        updateChildren(creationDate.toString());
    }

    private void addHistoryMessage(LocalDateTime creationDate) {
    }

    @Override
    public void attach(MyObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(MyObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void updateChildren(String updateDate) {
        StringBuilder updateMessageBuilder = new StringBuilder("Object with id ");
        updateMessageBuilder.append(this.id.toString()).append(" was updated on ").append(updateDate);
        for (MyObserver observer : observerList) {
            observer.subscribe(updateMessageBuilder.toString());
        }
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

