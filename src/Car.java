public class Car {

    double maxSpeed;
    double currentSpeed;
    String color;
    int currentGear;

    //We want every car to have owner
    //така че създаваме поле от тип Person

    Person owner;

    void changeGearUp(int maxGear) {
        if (currentGear == maxGear) {
            System.out.println("You already are");
        }
        else {
            currentGear++;
        }

    }
}







