package united_nations_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import united_nations_app.entity.Region;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RegionRepository extends JpaRepository<Region, Integer> {

    @Query
    Region findByName(String name);
}
