package united_nations_app.entity;

import javax.persistence.*;

@Entity
public class DevelopingStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(unique = true)
    private boolean isDeveloped;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isDeveloped() {
        return isDeveloped;
    }

    public void setDeveloped(boolean developed) {
        isDeveloped = developed;
    }
}
