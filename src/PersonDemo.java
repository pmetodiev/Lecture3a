public class PersonDemo {
//Обект
    public static void main(String[] args) {
        Person ivan = new Person();
        Person maria = new Person();

        ivan.name = "Ivan Ivanov";
        ivan.age = 25;
        ivan.isWoman = false;
        ivan.personalNumber = 861202528;
        ivan.weight = 80.5;
        System.out.print(ivan.name + " is " + ivan.age
                + " years old ");
        System.out.print("and his weight is " +
                ivan.weight);

        maria.name="Maria Ivanova";

        ivan.friend=maria;
        maria.friend=ivan;
        System.out.println(ivan.friend.name);
        System.out.println(maria.friend.name  );

        ivan.eat();
        maria.walk();
        ivan.growUp();
        System.out.println(ivan.age);
        ivan.drinkWater(0.5);
    }
 }

