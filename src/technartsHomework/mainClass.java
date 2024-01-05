package technartsHomework;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import technartsHomework.car.Car;
import technartsHomework.car.Hatchback;
import technartsHomework.car.SUV;
import technartsHomework.car.Sedan;
import technartsHomework.customer.CorporateCustomer;
import technartsHomework.customer.Customer;
import technartsHomework.customer.IndividualCustomer;

public class mainClass {
	
	
	
	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>();
		Car suv = new SUV("suv1", "black", 100, "gas", 23);
		Car suv1 = new SUV("suv2", "black", 100, "gas", 23);
		Car suv2 = new SUV("suv3", "black", 100, "gas", 23);
		Car hatchback = new Hatchback("hatchback1", "black", 100, "gas", 23);
		Car hatchback1 = new Hatchback("hatchback2", "black", 100, "gas", 23);
		Car hatchback2 = new Hatchback("hatchback3", "black", 100, "gas", 23);
		Car sedan = new Sedan("sedan1", "black", 100, "gas", 23);
		Car sedan1 = new Sedan("sedan2", "black", 100, "gas", 23);
		Car sedan2 = new Sedan("sedan3", "black", 100, "gas", 23);
		carList.add(suv);
		carList.add(suv1);
		carList.add(suv2);
		carList.add(hatchback);
		carList.add(hatchback1);
		carList.add(hatchback2);
		carList.add(sedan);
		carList.add(sedan1);
		carList.add(sedan2);

		Customer indCust = new IndividualCustomer("cagan", "eren", "sadasd@gc.com", "05412223142");
		Customer corpCust = new CorporateCustomer( "sadasd@gc.com", "05412223142","CorporateMock");
        Scanner scanner = new Scanner(System.in);
        Customer customer = null;

		while(true) {
						try {
							
							
							if(customer ==null) {
								System.out.println("0: IndividualCustomer\n1: CorporateCustomer");
								int choice = scanner.nextInt();
								if(choice==0)customer = indCust;
								else if(choice==1)customer = corpCust;
								else continue;
								System.out.println();
							}
							
							System.out.println("0: See all cars\n1: change customer\n2: rent a car");
							int choice = scanner.nextInt();
							if(choice==0) {
								customer.getAvilableCars( carList);
							}else if(choice ==1) {
								customer = null;
							}else if(choice ==2) {
								scanner.nextLine();
								System.out.println("which car name you want to rent ? ");
								String carName = scanner.nextLine();
								Car carToRent = null;
								for(Car car: carList) {
									if(car.getModel().equals(carName)) {
										carToRent = car;
										break;
									}
									
								}
								customer.rentalService(carToRent);
							}else {
								continue;
							}	
							
						}catch(InputMismatchException e) {
							System.out.println("please give reasonable answers");
							scanner.nextLine();
						}
			
			
		}
		
		
	}


}
