public class Lab_01_13_09_24 {
    int dat;
    char st;
    void PrintDat()
    {
        System.out.println(dat);
        System.out.println(st);

    }
    void PrintDat(int val)
    {
        System.out.println("00");
    }
    Lab_01_13_09_24(int x, char y)
    {
        dat = x;
        st = y;
    }
    Lab_01_13_09_24(int x)
    {
        dat = x;
        //st = y;
    }
    Lab_01_13_09_24(Lab_01_13_09_24 obj)
    {
        dat = obj.dat;
        st = obj.st;
    }

    public static void main(String[] args) {
        Lab_01_13_09_24 obj = new Lab_01_13_09_24(40, 'c');
        Lab_01_13_09_24 obj1 = new Lab_01_13_09_24(50);
        Lab_01_13_09_24 obj2 = new Lab_01_13_09_24(obj);

        obj1.dat = obj.dat;
        obj1.st = obj.st;
        //obj.dat = 10;
        obj.PrintDat();
        //obj.PrintDat(20);
        obj2.PrintDat();
        //System.out.println(obj2.st);
    }
}
