package CarSystem;

public class Customer {
    private String name;
    private int id;
    private double dateOfBirth;
    private double phoneNum;

    public Customer(String name,int id, double dateOfBirth,double phoneNum ){
        this.name= name;
        this.id=id;
        this.dateOfBirth=dateOfBirth;
        this.phoneNum= phoneNum;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }
    public double getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(double dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    public double getPhoneNum(){
        return phoneNum;
    }
    public void setPhoneNum(double phoneNum){
        this.phoneNum=phoneNum;
    }

}
