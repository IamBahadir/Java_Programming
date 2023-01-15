package day37_Inheritance.phoneTask;

public class Iphone extends Phone {


    public Iphone(String model, String size, double price, String color) {

        // If it makes sense , there is a possibility that we can convert instance variable to the Static variables under the sub class.
        // So, it gives you an advantage that you don't need to add the brand at all the time.

        super("Apple", model, size, price, color);

    }



    public void faceTime(long phoneNumber) {
        System.out.println(brand + " is making faceTime " + phoneNumber + ".");
    }

    public void faceTime(String mail) {
        System.out.println(brand + " is making faceTime " + mail + ".");
    }



}
