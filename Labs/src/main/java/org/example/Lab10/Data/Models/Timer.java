package org.example.Lab10.Data.Models;

public class Timer {
    private long ID;
    private long TriggerTime;
    private long CurrentTime;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getTriggerTime() {
        return TriggerTime;
    }

    public void setTriggerTime(long triggerTime) {
        TriggerTime = triggerTime;
    }

    public long getCurrentTime() {
        return CurrentTime;
    }

    public void setCurrentTime(long currentTime) {
        CurrentTime = currentTime;
    }
}
