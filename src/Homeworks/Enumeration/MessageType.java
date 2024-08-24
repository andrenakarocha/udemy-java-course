package Homeworks.Enumeration;

import static Homeworks.Enumeration.Priority.*;

public enum MessageType {
    A(HIGH), B(MEDIUM), C(LOW), D(LOW);

    private Priority priority;

    private MessageType (Priority priority){
        this.priority = priority;
    }

    public Priority getPriority() {
        return this.priority;
    }
}
