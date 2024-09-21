public class Animal {
    int leg;
    String name;
    
    void setter(int leg, String name)
    {
        this.leg = leg;
        this.name = name;
    }
    void getter()
    {
        System.out.println(this.leg);
        System.out.println(this.name);
    }

/*  
public static void main(String[] args) {
        Animal obAnimal = new Animal();
        obAnimal.setter(4, "dog");
        obAnimal.getter();
    }  */    

}
