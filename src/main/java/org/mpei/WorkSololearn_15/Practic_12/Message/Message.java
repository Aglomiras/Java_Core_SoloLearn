package org.mpei.WorkSololearn_15.Practic_12.Message;

import java.util.Objects;

public class Message {
    private final String date;

    public Message(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (this.getClass() != object.getClass()) return false;
        final Message message = (Message) object;
        return Objects.equals(date, message.date);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(date);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [date=" + this.date + "]";
    }
}
