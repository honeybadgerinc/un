package united_nations_app.entity;

import javax.persistence.*;

@Entity
public class LeastDevelopedCountryStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(unique = true, name = "is_least_developed_country")
    private boolean isLeastDevelopedCountry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isLeastDevelopedCountry() {
        return isLeastDevelopedCountry;
    }

    public void setLeastDevelopedCountry(boolean leastDevelopedCountry) {
        isLeastDevelopedCountry = leastDevelopedCountry;
    }
}
