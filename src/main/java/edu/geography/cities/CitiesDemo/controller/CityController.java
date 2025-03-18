package edu.geography.cities.CitiesDemo.controller;

import edu.geography.cities.CitiesDemo.model.City;
import edu.geography.cities.CitiesDemo.model.CityList;
import edu.geography.cities.CitiesDemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello City Life";
    }

    @GetMapping("/")
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/{zipCode}")
    public City getCitiesWithZip(@PathVariable("zipCode") String zip) {
        return cityService.getCityByZipCode(zip);
    }

    /*
    @GetMapping("/state/{stCd}")
    public CityList getCitiesWithinState(@PathVariable("stCd") String stateCode, @RequestParam("size") Integer size) {
        return cityService.getCitiesFromState(stateCode, size);
    }
    */

    @GetMapping("/list/states/{stCd}")
    public CityList getCitiesInState(@PathVariable("stCd") String stateCode) {
        System.out.println("Calling endpoint in CityController mapped to URL.../cities/list/states/" + stateCode );
        return cityService.getCitiesFromState(stateCode);
    }

    @GetMapping("/list/states/firstn/{stCd}")
    public CityList getFirstNCitiesInState(@PathVariable("stCd") String stateCode, @RequestParam(value="size") Integer size) {
        return cityService.getNCitiesFromState(stateCode, size);
    }


    @PostMapping("/")
    public City createCity(@RequestBody City newCity) {
        return cityService.addCity(newCity);
    }

    @PutMapping("/{zipCode}")
    public City getCitiesWithZip(@PathVariable("zipCode") String zip, @RequestBody City city) {
        return cityService.updateCity(zip, city);
    }

}
