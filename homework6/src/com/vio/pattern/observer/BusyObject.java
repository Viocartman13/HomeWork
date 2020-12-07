package src.com.vio.pattern.observer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BusyObject implements Subject {
    private Integer id;
    private String name;
    private LocalDateTime creationDate;
    private final List<UpdateObserver> updateObserverList = new ArrayList<>();
    private final List<HistoryObserver> historyObserverList = new ArrayList<>();

    public void updateObjectAndDependencies(String name, LocalDateTime creationDate) {
        this.name = name;
        if (creationDate.isBefore(this.creationDate)) {
            throw new IllegalArgumentException("The date can't be set before the original creation date");
        }

        addHistoryMessage(createMessage(creationDate.toString()));
        updateChildren(createMessage(creationDate.toString()));
    }

    private String createMessage(String updateDate) {
        StringBuilder messageBuilder = new StringBuilder("Object with id ");
        messageBuilder.append(this.id.toString()).append(" was updated on ").append(updateDate);

        return messageBuilder.toString();
    }

    public void addHistoryMessage(String historyMessage) {
        for (HistoryObserver observer : historyObserverList) {
            observer.subscribe(historyMessage);
        }
    }

    public void attachUpdateObserver(UpdateObserver observer) {
        updateObserverList.add(observer);
    }

    @Override
    public void detachUpdateObserver(UpdateObserver observer) {
        updateObserverList.remove(observer);
    }

    @Override
    public void updateChildren(String updateMessage) {
        for (UpdateObserver observer : updateObserverList) {
            observer.subscribe(updateMessage);
        }
    }

    @Override
    public void attachHistoryObserver(HistoryObserver observer) {
        this.historyObserverList.add(observer);
    }

    @Override
    public void detachHistoryObserver(HistoryObserver observer) {
        this.historyObserverList.remove(observer);

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

