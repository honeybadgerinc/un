package united_nations_app.entity;

import javax.persistence.*;

@Entity
public class SmallIslandDevelopingStates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(unique = true)
    private boolean isSmallIslandDeveloping;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isSmallIslandDeveloping() {
        return isSmallIslandDeveloping;
    }

    public void setSmallIslandDeveloping(boolean smallIslandDeveloping) {
        isSmallIslandDeveloping = smallIslandDeveloping;
    }
}
