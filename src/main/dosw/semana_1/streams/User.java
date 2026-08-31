package main.dosw.semana_1.streams;
public class User {
    private Long id; private String name; private int age; private boolean active;
    public User(Long id, String name, int age, boolean active) { this.id = id; this.name = name; this.age = age; this.active = active; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isActive() { return active; }
}