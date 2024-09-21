public class Fifteen_Sep {
    int roll;
    String name;
    static String Clg = "ICE";
    //COPY CONSTRUCTOR
    Fifteen_Sep(int r, String n)
    {
        roll = r;
        name = n;
    }

    public static void main(String args[]){
        Fifteen_Sep st1 = new Fifteen_Sep(10, "XYZ");
        Fifteen_Sep st2 = new Fifteen_Sep(11, "ABC");
        st1.roll = 1;
        st2.roll = 2;
        System.out.println(st1.Clg);
        System.out.println(st2.Clg);

    }


}
