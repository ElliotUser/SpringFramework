package ru.ricksanchez;

public class Client {
    private String id;
    private String FullName;

    public Client(String id, String fullName) {
        this.id = id;
        FullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }
}
