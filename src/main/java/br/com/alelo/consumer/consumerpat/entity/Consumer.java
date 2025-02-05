package br.com.alelo.consumer.consumerpat.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;
import java.util.Objects;

@Data
@Entity
@Table(name = "CONSUMER")
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="DOCUMENT_NUMBER")
    private int documentNumber;
    
    @Column(name="BIRTH_DATE")
    private Date birthDate;

    //contacts
    @Column(name="MOBILE_PHONE_NUMBER  ")
    private int mobilePhoneNumber;
    
    @Column(name="RESIDENCE_PHONE_NUMBER ")
    private int residencePhoneNumber;
    
    @Column(name="PHONE_NUMBER ")
    private int phoneNumber;
    
    @Column(name="EMAIL")
    private String email;

    //Address
    @Column(name="STREET")
    private String street;
    
    @Column(name="NUMBER")
    private int number;
    
    @Column(name="CITY")
    private String city;
    
    @Column(name="COUNTRY")
    private String country;
    
    @Column(name="PORTAL_CODE")
    private int portalCode;

    //cards
    @Column(name="FOOD_CARD_NUMBER")
    private int foodCardNumber;
    
    @Column(name="FOOD_CARD_BALANCE")
    private double foodCardBalance;

    @Column(name="FUEL_CARD_NUMBER")
    private int fuelCardNumber;
    
    @Column(name="FUEL_CARD_BALANCE")
    private double fuelCardBalance;

    @Column(name="DRUGSTORE_NUMBER")
    private int drugstoreNumber;
    
    @Column(name="DRUGSTORE_CARD_BALANCE")
    private double drugstoreCardBalance;

	public Consumer(String name, int documentNumber, Date birthDate, int mobilePhoneNumber, int residencePhoneNumber,
			int phoneNumber, String email, String street, int number, String city, String country, int portalCode,
			int foodCardNumber, double foodCardBalance, int fuelCardNumber, double fuelCardBalance, int drugstoreNumber,
			double drugstoreCardBalance) {
		super();
		this.name = name;
		this.documentNumber = documentNumber;
		this.birthDate = birthDate;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.residencePhoneNumber = residencePhoneNumber;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.street = street;
		this.number = number;
		this.city = city;
		this.country = country;
		this.portalCode = portalCode;
		this.foodCardNumber = foodCardNumber;
		this.foodCardBalance = foodCardBalance;
		this.fuelCardNumber = fuelCardNumber;
		this.fuelCardBalance = fuelCardBalance;
		this.drugstoreNumber = drugstoreNumber;
		this.drugstoreCardBalance = drugstoreCardBalance;
	}
	
	public Consumer(Integer id, String name, int documentNumber, Date birthDate, int mobilePhoneNumber, int residencePhoneNumber,
			int phoneNumber, String email, String street, int number, String city, String country, int portalCode,
			int foodCardNumber, double foodCardBalance, int fuelCardNumber, double fuelCardBalance, int drugstoreNumber,
			double drugstoreCardBalance) {
		super();
		this.name = name;
		this.documentNumber = documentNumber;
		this.birthDate = birthDate;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.residencePhoneNumber = residencePhoneNumber;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.street = street;
		this.number = number;
		this.city = city;
		this.country = country;
		this.portalCode = portalCode;
		this.foodCardNumber = foodCardNumber;
		this.foodCardBalance = foodCardBalance;
		this.fuelCardNumber = fuelCardNumber;
		this.fuelCardBalance = fuelCardBalance;
		this.drugstoreNumber = drugstoreNumber;
		this.drugstoreCardBalance = drugstoreCardBalance;
	}

	public Integer getId() {
		return id;
	}
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(int documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(int mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public int getResidencePhoneNumber() {
		return residencePhoneNumber;
	}

	public void setResidencePhoneNumber(int residencePhoneNumber) {
		this.residencePhoneNumber = residencePhoneNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPortalCode() {
		return portalCode;
	}

	public void setPortalCode(int portalCode) {
		this.portalCode = portalCode;
	}

	public int getFoodCardNumber() {
		return foodCardNumber;
	}

	public void setFoodCardNumber(int foodCardNumber) {
		this.foodCardNumber = foodCardNumber;
	}

	public double getFoodCardBalance() {
		return foodCardBalance;
	}

	public void setFoodCardBalance(double foodCardBalance) {
		this.foodCardBalance = foodCardBalance;
	}

	public int getFuelCardNumber() {
		return fuelCardNumber;
	}

	public void setFuelCardNumber(int fuelCardNumber) {
		this.fuelCardNumber = fuelCardNumber;
	}

	public double getFuelCardBalance() {
		return fuelCardBalance;
	}

	public void setFuelCardBalance(double fuelCardBalance) {
		this.fuelCardBalance = fuelCardBalance;
	}

	public int getDrugstoreNumber() {
		return drugstoreNumber;
	}

	public void setDrugstoreNumber(int drugstoreNumber) {
		this.drugstoreNumber = drugstoreNumber;
	}

	public double getDrugstoreCardBalance() {
		return drugstoreCardBalance;
	}

	public void setDrugstoreCardBalance(double drugstoreCardBalance) {
		this.drugstoreCardBalance = drugstoreCardBalance;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumer consumer = (Consumer) o;
        return documentNumber == consumer.documentNumber
                && mobilePhoneNumber == consumer.mobilePhoneNumber
                && residencePhoneNumber == consumer.residencePhoneNumber
                && phoneNumber == consumer.phoneNumber
                && number == consumer.number
                && portalCode == consumer.portalCode
                && foodCardNumber == consumer.foodCardNumber
                && Double.compare(consumer.foodCardBalance, foodCardBalance) == 0
                && fuelCardNumber == consumer.fuelCardNumber && Double.compare(consumer.fuelCardBalance, fuelCardBalance) == 0
                && drugstoreNumber == consumer.drugstoreNumber && Double.compare(consumer.drugstoreCardBalance, drugstoreCardBalance) == 0
                && Objects.equals(id, consumer.id) && Objects.equals(name, consumer.name) && Objects.equals(birthDate, consumer.birthDate)
                && Objects.equals(email, consumer.email) && Objects.equals(street, consumer.street) && Objects.equals(city, consumer.city)
                && Objects.equals(country, consumer.country);
    }


}
