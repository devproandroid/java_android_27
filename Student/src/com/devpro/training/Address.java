package com.devpro.training;

public class Address {
	public String number;
	public String alley;
	public String streetName;
	public String wardName;
	public String districtName;
	public String cityName;

	public Address() {

	}

	public Address(String number, String alley, String streetName, String wardName, String districtName,
			String cityName) {
		this.number = number;
		this.alley = alley;
		this.streetName = streetName;
		this.wardName = wardName;
		this.districtName = districtName;
		this.cityName = cityName;
	}

	public void updateAddress(String number, String alley, String streetName, String wardName, String districtName,
			String cityName) {
		this.number = number;
		this.alley = alley;
		this.streetName = streetName;
		this.wardName = wardName;
		this.districtName = districtName;
		this.cityName = cityName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAlley() {
		return alley;
	}

	public void setAlley(String alley) {
		this.alley = alley;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [number=");
		builder.append(number);
		builder.append(", alley=");
		builder.append(alley);
		builder.append(", streetName=");
		builder.append(streetName);
		builder.append(", wardName=");
		builder.append(wardName);
		builder.append(", districtName=");
		builder.append(districtName);
		builder.append(", cityName=");
		builder.append(cityName);
		builder.append("]");
		return builder.toString();
	}
}
