package Oops;

public class Car {
    String color;
    String type;
    int seats;
    float speed;

    void display(){
        System.out.println("This is a Blueprint (class) of a Car");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.display();

    }

}
