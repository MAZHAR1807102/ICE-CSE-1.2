public class Person {
    int age;
    String name;


    static int getAge(int x){
    
        int age = x;
        return age;

    }
    
    static String getName(String y){
        String name = y;
        return name;
    }

    public static void main(String args[]){

        Person person1 = new Person();
        Person person2 = new Person();
        
        person1.name = getName("Mueid Hasan");
        person2.name = getName("Majharul Islam");
        
        person1.age = getAge(21);
        person2.age = getAge(26);
        
        System.out.println("Person 1 - Name: " + person1.name + ", \tAge: " + person1.age);
        System.out.println("Person 2 - Name: " + person2.name + ", \tAge: " + person2.age);

    }
}


