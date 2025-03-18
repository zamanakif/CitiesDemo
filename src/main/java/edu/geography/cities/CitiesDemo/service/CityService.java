package edu.geography.cities.CitiesDemo.service;

import edu.geography.cities.CitiesDemo.model.City;
import edu.geography.cities.CitiesDemo.model.CityList;

import java.util.List;

public interface CityService {

    List<City> getAllCities();
    City getCityByZipCode(String zipCode);
    City addCity(City newCity);
    City updateCity(String zipCode, City modifiedCity);
    CityList getNCitiesFromState(String stateCode, Integer size);
    CityList getCitiesFromState(String stateCode);
    //String deleteCity(String zipCode);
}
