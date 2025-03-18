package edu.geography.cities.CitiesDemo.service.serviceImpl;

import edu.geography.cities.CitiesDemo.model.City;
import edu.geography.cities.CitiesDemo.model.CityList;
import edu.geography.cities.CitiesDemo.repository.CityRepository;
import edu.geography.cities.CitiesDemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public City getCityByZipCode(String zipCode) {
        Optional<City> optionalCity = cityRepository.findById(zipCode);
        return optionalCity.orElse(null);
    }

    public City addCity(City newCity) {
        return cityRepository.saveAndFlush(newCity);
    }

    public City updateCity(String zipCode, City modifiedCity) {
        City city = getCityByZipCode(zipCode);
        city.setStateCode(modifiedCity.getStateCode());
        city.setZipCode(modifiedCity.getZipCode());
        city.setAirportCode(modifiedCity.getAirportCode());
        city.setNickName(modifiedCity.getNickName());
        city.setIncorporatedDate(modifiedCity.getIncorporatedDate());
        city.setName(modifiedCity.getName());
        return cityRepository.save(city);
    }

    public CityList getNCitiesFromState(String stateCode, Integer size) {
        CityList cityList = new CityList();
        cityList.setStateCode(stateCode);
        List<City> listOfCities = cityRepository.findAll().stream().filter(x -> x.getStateCode().equals(stateCode)).limit(size).collect(Collectors.toList());
        cityList.setListOfCities(listOfCities);
        return cityList;
    }

    public CityList getCitiesFromState(String stateCode) {
        CityList cityList = new CityList();
        cityList.setStateCode(stateCode);
        List<City> listOfCities = cityRepository.findAll().stream().filter(x -> x.getStateCode().equals(stateCode)).collect(Collectors.toList());
        cityList.setListOfCities(listOfCities);
        return cityList;
    }

    public CityList getFirstNCitiesInState(String stateCode, Integer size) {
        CityList cityList = new CityList();
        cityList.setStateCode(stateCode);
        List<City> listOfCities = cityRepository.findAll().stream().filter(x -> x.getStateCode().equals(stateCode)).limit(size).collect(Collectors.toList());
        cityList.setListOfCities(listOfCities);
        return cityList;
    }

}
