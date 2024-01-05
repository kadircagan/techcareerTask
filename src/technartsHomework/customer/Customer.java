package technartsHomework.customer;

import java.util.List;

import technartsHomework.car.Car;
import technartsHomework.car.Hatchback;
import technartsHomework.car.Sedan;

public  class  Customer implements Rental {

    private String email;
    private String phone;

	public Customer( String email, String phone) {
		super();
		this.email = email;
		this.phone = phone;
	}
    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public  void rentalService(Car car) {
		System.out.println("default Rental Service");
	}
	
    public  void getAvilableCars(List<Car> carList) {
    	System.out.println("default get Avilable Cars");

    }

}
