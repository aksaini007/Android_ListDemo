package com.example.listdemo2;

public class NoteItems {

    String heading;
    String description;

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getHeading() + "\n" + getDescription();
    }
}
