package united_nations_app.entity;

import jdk.nashorn.internal.ir.annotations.Immutable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Region {

    @Id
    @NotNull
    @Immutable
    @Column(unique = true)
    private Integer code;

    @NotNull
    @Immutable
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "region")
    private List<SubRegion> subRegions;

    public List<SubRegion> getSubRegions() {
        return subRegions;
    }

    public void setSubRegions(List<SubRegion> subRegions) {
        this.subRegions = subRegions;
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
