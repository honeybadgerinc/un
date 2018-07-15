package united_nations_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import united_nations_app.entity.CountryOrArea;

@Repository
public interface CountryOrAreaRepository extends JpaRepository<CountryOrArea, Integer> {

    @Query
    CountryOrArea findByalpha2Code(Integer alpha2Code);

}
