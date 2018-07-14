package united_nations_app.entity;

import jdk.nashorn.internal.ir.annotations.Immutable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class SubRegion {

    @Id
    @NotNull
    @Immutable
    @Column(unique = true)
    private Integer code;

    @NotNull
    @Immutable
    @Column(unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "regionCode")
    private Region region;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "subRegion")
    private List<CountryOrArea> countryOrAreas;

    public List<CountryOrArea> getCountryOrAreas() {
        return countryOrAreas;
    }

    public void setCountryOrAreas(List<CountryOrArea> countryOrAreas) {
        this.countryOrAreas = countryOrAreas;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

        public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
