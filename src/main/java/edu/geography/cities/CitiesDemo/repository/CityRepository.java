package edu.geography.cities.CitiesDemo.repository;

import edu.geography.cities.CitiesDemo.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, String> {
}
