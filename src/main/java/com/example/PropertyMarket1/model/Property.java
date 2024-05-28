package com.example.PropertyMarket1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Property {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String address;
    private int area;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private String nearbyHospitals;
    private String nearbyColleges;
    private Long sellerId;
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Property(Long id, String title, String description, String address, int area, int numberOfBedrooms,
			int numberOfBathrooms, String nearbyHospitals, String nearbyColleges, Long sellerId) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.address = address;
		this.area = area;
		this.numberOfBedrooms = numberOfBedrooms;
		this.numberOfBathrooms = numberOfBathrooms;
		this.nearbyHospitals = nearbyHospitals;
		this.nearbyColleges = nearbyColleges;
		this.sellerId = sellerId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}
	public int getNumberOfBathrooms() {
		return numberOfBathrooms;
	}
	public void setNumberOfBathrooms(int numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}
	public String getNearbyHospitals() {
		return nearbyHospitals;
	}
	public void setNearbyHospitals(String nearbyHospitals) {
		this.nearbyHospitals = nearbyHospitals;
	}
	public String getNearbyColleges() {
		return nearbyColleges;
	}
	public void setNearbyColleges(String nearbyColleges) {
		this.nearbyColleges = nearbyColleges;
	}
	public Long getSellerId() {
		return sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}
	@Override
	public String toString() {
		return "Property [id=" + id + ", title=" + title + ", description=" + description + ", address=" + address
				+ ", area=" + area + ", numberOfBedrooms=" + numberOfBedrooms + ", numberOfBathrooms="
				+ numberOfBathrooms + ", nearbyHospitals=" + nearbyHospitals + ", nearbyColleges=" + nearbyColleges
				+ ", sellerId=" + sellerId + "]";
	}

}
