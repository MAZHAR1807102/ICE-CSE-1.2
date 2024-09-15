
public class App {
    int data = 10;
    void PrintData(){
        System.out.println("The Data is:" + data);
    }
    void PrintData( int Data){
        System.out.println("The Data is:" + Data);
    }
    public App(int x)
    {
data = x;
    }

    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
       // int n = 5;
        App Object = new App(30);
        Object.PrintData();
        Object.PrintData(20);
        /*for(int i = 0; i < n; i++)
        {
            if(i==2)System.out.println(i);
        }*/

        
    }
}
