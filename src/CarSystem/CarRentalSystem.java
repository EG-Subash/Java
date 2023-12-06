package CarSystem;

import java.util.*;

public class CarRentalSystem extends Car{

    private List<Car> cars;
    private List<Customer>customers;
    private List<Rental>rentals;
    public CarRentalSystem(){
        super(Car);
        cars= new ArrayList<>();
        customers= new ArrayList<>();
        rentals= new ArrayList<>();
    }
   public void addCar(Car car){
        cars.add(car);
   }
   public void addCustomer(Customer customer){
        customers.add(customer);
   }
   public void rentCar(Car cars,Customer customer, int days){
        Scanner scan = new Scanner(System.in);
       System.out.println("Enter the day you want to rent");
       days=scan.nextInt();
      if(cars.getIsAvailable()){
          cars.rent();
          rentals.add(new Rental(cars,customer,days ));
      }else {
          System.out.println("No Cars available");
      }


      //Method for return car
       public void returnCar(Car car){

       }
   }
}
