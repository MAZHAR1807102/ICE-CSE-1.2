public class Person {
    int age;
    String name;

    public Person(){
        // This is a default constructor
    }

    public Person(int x){
        // This is a parameterized constructor
    }

    static int getAge(int x){  
        int age = x;
        return age;
    }
    
    static String getName(String y){
        String name = y;
        return name;
    }

    public static void main(String args[]){

        Person person1 = new Person(); // The person1 object is created from a default constructor
        Person person2 = new Person(10); // The person1 object is created from a parameterized constructor
        
        person1.name = getName("Mueid Hasan");
        person2.name = getName("SD Imam Shimul");
        
        person1.age = getAge(21);
        person2.age = getAge(20);
        
        System.out.println("Person 1 - Name: " + person1.name + ", \tAge: " + person1.age);
        System.out.println("Person 2 - Name: " + person2.name + ", \tAge: " + person2.age);

    }
}


