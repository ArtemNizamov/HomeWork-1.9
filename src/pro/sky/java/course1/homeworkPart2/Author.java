package pro.sky.java.course1.homeworkPart2;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surName) {
        this.name = name;
        this.surname = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author bradberry = (Author) other;
        return name.equals(bradberry.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
