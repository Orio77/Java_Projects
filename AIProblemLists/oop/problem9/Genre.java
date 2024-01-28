package oop.problem9;

public enum Genre {
    FICTION("Stories that involve imaginary events and characters"), 
    NONFICTION("Stories that don't involve any supernatural elements and are based o reality"), 
    SCIENCE("Stories that are science based and can be trusted to be true"),
    CLASSIC("Stories that are classic");

    private String description;

    private Genre() {}

    private Genre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
