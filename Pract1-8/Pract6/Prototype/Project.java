package Pract6.Prototype;

public class Project implements Prototype {
    private int id;
    private String name;
    private String code;

    public Project(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }
    @Override
    public Object copy() {
        Project copy = new Project(id,name,code);
        return copy;
    }

    @Override
    public String toString() {
        return "Project {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
