package DTO.DeadlineBasesDto;

public class DurationDeadlineBases {
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

    public DurationDeadlineBases(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String id;
    public String name;
}
