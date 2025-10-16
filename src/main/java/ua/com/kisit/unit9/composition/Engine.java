package ua.com.kisit.unit9.composition;

public class Engine {

    private Long id=1L;
    private String model="T100";

    public Engine() {
    }

    public Engine(Long id, String model) {
        this.id = id;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }
}
