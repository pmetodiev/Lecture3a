public class CarDemo {

    public static void main(String[] args) {
//values = стойности
        Car toyota = new Car();
        Car nissan = new Car();
        Car honda = new Car();

// викам обекта към съответните полета

        toyota.color= "silver";
        toyota.maxSpeed= 220;
        toyota.currentSpeed=50;
        toyota.currentGear=3;



        nissan.color="black";
        nissan.maxSpeed=100;
        nissan.currentSpeed=80;
        nissan.currentGear=5;

        System.out.println(toyota.currentSpeed);
        //Change the gear and current speed of one of
       // the cars
        toyota.currentSpeed=30;
        System.out.println(toyota.currentSpeed);

        System.out.println(toyota.currentGear);
        toyota.currentGear= nissan.currentGear-1;
        System.out.println(nissan.currentGear-1);

        Person ivan = new Person();
        ivan.name = "Ivan Ivanov";
        toyota.owner=ivan;
        System.out.println(toyota.owner.name );

        Person maria = new Person();
        maria.name="Maria Ivanova";
        nissan.owner=maria;
        System.out.println(nissan.owner.name);
        honda.currentGear=5;
        honda.changeGearUp(6);
        System.out.println(honda.currentGear);



    }
}
