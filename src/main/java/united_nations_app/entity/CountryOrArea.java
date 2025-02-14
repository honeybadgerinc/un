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

    @NotNull
    @Immutable
    @Column(unique = true)
    private String name;

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
    private SmallIslandDevelopingStateStatus smallIslandDevelopingStateStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_region_code")
    private SubRegion subRegion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "landlocked_developed_country_status")
    private LandLockedDevelopedCountryStatus landLockedDevelopedCountryStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "least_developed_country_status")
    private LeastDevelopedCountryStatus leastDevelopedCountryStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LeastDevelopedCountryStatus getLeastDevelopedCountryStatus() {
        return leastDevelopedCountryStatus;
    }

    public void setLeastDevelopedCountryStatus(LeastDevelopedCountryStatus leastDevelopedCountryStatus) {
        this.leastDevelopedCountryStatus = leastDevelopedCountryStatus;
    }

    public LandLockedDevelopedCountryStatus getLandLockedDevelopedCountryStatus() {
        return landLockedDevelopedCountryStatus;
    }

    public void setLandLockedDevelopedCountryStatus(LandLockedDevelopedCountryStatus landLockedDevelopedCountryStatus) {
        this.landLockedDevelopedCountryStatus = landLockedDevelopedCountryStatus;
    }

    public SmallIslandDevelopingStateStatus getSmallIslandDevelopingStateStatus() {
        return smallIslandDevelopingStateStatus;
    }

    public void setSmallIslandDevelopingStateStatus(SmallIslandDevelopingStateStatus smallIslandDevelopingStateStatus) {
        this.smallIslandDevelopingStateStatus = smallIslandDevelopingStateStatus;
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
