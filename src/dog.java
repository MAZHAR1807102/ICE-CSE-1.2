public class dog extends Animal{
    String color;
    String barking;

    void isBarking()
    {
        System.err.println(barking);
    }
    void setter(String color, String barking)
    {
        this.color = color;
        this.barking = barking;
    }

    void getter(){
        System.out.println(color + barking);
    }


    public static void main(String[] args) {
        dog obj = new dog();
        obj.setter("red ", "gheu gheu");
        obj.getter();
    }
    
}
