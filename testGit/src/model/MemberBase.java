package model;

public class MemberBase {

    private String id;

    private String name;

    private String kanaName;

    public String getKanaName() {
        return kanaName;
    }

    public void setKanaName(String kanaName) {
        this.kanaName = kanaName;
    }

    public MemberBase(String id, String name, String kanaName) {
        this.id = id;
        this.name = name;
        this.kanaName = kanaName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Hello " + this.name;
    }
}
