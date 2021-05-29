package latihan03;
public class Gajah extends Hewan
{
    public static void testClassMethod()
    {
        System.out.println("The Class method in Hewan...");
    }
    //meng-override method pada class Animal
    public void testInstanceMethod()
    {
        System.out.println("This instance method in Gajah...");
    }
    public static void main (String[] args)
    {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInatanceMethod();
    }        
}
