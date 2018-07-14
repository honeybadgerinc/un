package united_nations_app.entity;

import jdk.nashorn.internal.ir.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class CountryOrArea {

    @Id
    @NotNull
    @Immutable
    @Column(unique = true)
    private Integer m49Code;

    @Column(unique = true)
    @Length(max = 3, min = 3)
    private String alpha3Code;

    @Column(unique = true)
    @Length(max = 2, min = 2)
    private String alpha2Code;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "developing_status")
    private DevelopingStatus developingStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "small_island_developing_status")
    private SmallIslandDevelopingStates smallIslandDevelopingStates;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_region_code")
    private SubRegion subRegion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "landlocked_developed_countries")
    private LandLockedDevelopedCountries landLockedDevelopedCountries;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "least_developed_countries")
    private LeastDevelopedCountries leastDevelopedCountries;

    public LeastDevelopedCountries getLeastDevelopedCountries() {
        return leastDevelopedCountries;
    }

    public void setLeastDevelopedCountries(LeastDevelopedCountries leastDevelopedCountries) {
        this.leastDevelopedCountries = leastDevelopedCountries;
    }

    public LandLockedDevelopedCountries getLandLockedDevelopedCountries() {
        return landLockedDevelopedCountries;
    }

    public void setLandLockedDevelopedCountries(LandLockedDevelopedCountries landLockedDevelopedCountries) {
        this.landLockedDevelopedCountries = landLockedDevelopedCountries;
    }

    public SmallIslandDevelopingStates getSmallIslandDevelopingStates() {
        return smallIslandDevelopingStates;
    }

    public void setSmallIslandDevelopingStates(SmallIslandDevelopingStates smallIslandDevelopingStates) {
        this.smallIslandDevelopingStates = smallIslandDevelopingStates;
    }

    public DevelopingStatus getDevelopingStatus() {
        return developingStatus;
    }

    public void setDevelopingStatus(DevelopingStatus developingStatus) {
        this.developingStatus = developingStatus;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public SubRegion getSubRegion() {
        return subRegion;
    }

    public void setSubRegion(SubRegion subRegion) {
        this.subRegion = subRegion;
    }

    public Integer getM49Code() {
        return m49Code;
    }

    public void setM49Code(Integer m49Code) {
        this.m49Code = m49Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }
}
