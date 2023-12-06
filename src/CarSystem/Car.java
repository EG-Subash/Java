package CarSystem;

public class Car {
    private String carId;
    private String brand;
    private String model;
    private double basePrice;
    private boolean isAvailable;
    public Car(String carId,String brand,String model,double basePrice){
        this.carId= carId;
        this.brand= brand;
        this.model=model;
        this.basePrice= basePrice;
        this.isAvailable=true;

    }
    public String getCarId(){
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public double getBasePrice(){
        return basePrice;
    }
    public void setBasePrice(){
        this.basePrice=basePrice;
    }

    public void setAvailable(boolean isAvailable){
        this.isAvailable=isAvailable;
    }

    public Boolean getIsAvailable(){
        return isAvailable;
    }
    //Calculation of Price
    public double calculatePrice(int rentalDays){
        return basePrice*rentalDays;
    }

    //method
    public void rent(){
        isAvailable=false; //when this method calls then the car will be booked to rented
    }
    public void returnCar(){
        isAvailable=true; //when car is return the car will be available
    }

}
