public class BabyDog extends dog{

    String BabyName;

    void setter(String color, String barking, String BabyName)
    {
        this.color = color;
        this.barking = barking;
        this.BabyName = BabyName;

    }

    void getter(){
        System.out.println(color + barking + BabyName);
    }

    public static void main(String[] args) {
        BabyDog obj = new BabyDog();
        obj.setter("red ", "gheu gheu ", "Tommy");
        obj.getter();
    }

}
