package greencity.repository;

import greencity.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.*;

public interface AuthorityRepo extends JpaRepository<Authority, Long> {
    /**
     * Gets all Employee authorities by employee id.
     *
     * @return Set of {@link String}.
     */
    @Query(value = "SELECT DISTINCT name from employee_authorities"
        + " inner join employee_authorities_mapping eam on employee_authorities.id = eam.authority_id "
        + "where user_id = :userId", nativeQuery = true)
    Set<String> getAuthoritiesByEmployeeId(@Param(value = "userId") Long employeeId);

    /**
     * Method that find {@link Authority} by name.
     *
     * @param name {@link String} values
     * @return {@link Authority}
     */
    Optional<Authority> findByName(String name);
}
