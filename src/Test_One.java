class Person {
    private String name;
    private int age;

    //Make a default constructor
    public Person() {
        //Write your code here...

    }

    //Make a Parameterized constructor
    public Person(String name, int age) {
        //Write your code here...
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class ICE {
    public static void main(String[] args) {
        // Creating objects using constructors
        //Create an object named "person1" by Default constructor.
        //Create an object named "person2" by Parameterized constructor.

        // Accessing object attributes
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
