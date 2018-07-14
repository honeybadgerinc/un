package united_nations_app.entity;

import javax.persistence.*;

@Entity
public class LandLockedDevelopedCountries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(unique = true)
    private boolean isLandLockedDevelopingCountry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isLandLockedDevelopingCountry() {
        return isLandLockedDevelopingCountry;
    }

    public void setLandLockedDevelopingCountry(boolean landLockedDevelopingCountry) {
        isLandLockedDevelopingCountry = landLockedDevelopingCountry;
    }
}
