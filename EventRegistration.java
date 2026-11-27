package edu.college;

public class EventRegistration {
    private final String eventName;
    private final int seatLimit;
    private int registeredStudents;

    public EventRegistration(String eventName, int seatLimit) {
        if (eventName == null || eventName.isBlank()) throw new IllegalArgumentException("Event name is required");
        if (seatLimit <= 0) throw new IllegalArgumentException("Seat limit must be positive");
        this.eventName = eventName;
        this.seatLimit = seatLimit;
        this.registeredStudents = 0;
    }

    public boolean registerStudent() {
        if (registeredStudents >= seatLimit) return false;
        registeredStudents++;
        return true;
    }

    public int getAvailableSeats() { return seatLimit - registeredStudents; }
    public String getEventName() { return eventName; }
    public int getRegisteredStudents() { return registeredStudents; }
}
