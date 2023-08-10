package entities;

public class CategoryContact {
    private String name;
    private String id;
    private String parentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "CategoryContact{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
