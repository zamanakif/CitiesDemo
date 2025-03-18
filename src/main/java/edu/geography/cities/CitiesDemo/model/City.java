package edu.geography.cities.CitiesDemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;


@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode
//@Getter
//@Setter
@ToString
@Table(name="cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="zp_cd")
    private String zipCode;

    @Column(name="city_name")
    private String name;

    @Column(name="st_cd")
    private String stateCode;

    @Column(name="airport_code")
    private String airportCode;

    @Column(name="incrp_date")
    private LocalDate incorporatedDate;

    @Column(name="nick_name")
    private String nickName;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public LocalDate getIncorporatedDate() {
        return incorporatedDate;
    }

    public void setIncorporatedDate(LocalDate incorporatedDate) {
        this.incorporatedDate = incorporatedDate;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
