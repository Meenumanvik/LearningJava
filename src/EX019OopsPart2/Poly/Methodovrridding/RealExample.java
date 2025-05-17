package EX019OopsPart2.Poly.Methodovrridding;

public class RealExample {
    public static void main(String args[])
    {
        TC t1=new TC();
        t1.openBrowser();
        t1.StartTC();
TC t2=new TC();
t2.StartTC();
t2.openBrowser();

    }
}
class TC extends CommonToAll{
void StartTC()
{
openBrowser();
}
}
class CommonToAll{
void openBrowser()
{
    System.out.println("Open the Browser in 5 sec");
}
}
class TC2 extends CommonToAll{
    @Override
    void openBrowser()
    {
        System.out.println("Open the Browser in 2 sec");
    }
}