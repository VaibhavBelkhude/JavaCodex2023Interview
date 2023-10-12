package com.btclinet.interview2023;

public class Country {
private Integer countryId;
private String countryName;
public Country(Integer countryId, String countryName) {
	super();
	this.countryId = countryId;
	this.countryName = countryName;
}
public Integer getCountryId() {
	return countryId;
}
public void setCountryId(Integer countryId) {
	this.countryId = countryId;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
@Override
public String toString() {
	return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
}

}
