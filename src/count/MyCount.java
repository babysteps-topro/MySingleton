package count;

public class MyCount
{
    private static MyCount mycountobj=new MyCount();

    private int counter=0;

    //private constructor is the key of singleton pattern
    private MyCount()
    {
        //do some initialization here
        System.out.println("I will only be created once at "+new java.util.Date());
    }

    public int getCount()
    {
        return counter;
    }

    public void addCount()
    {
        counter++;
    }

    public static MyCount getInstance()
    {
        return mycountobj;
    }

    public static void main(String[] args)
    {
        MyCount mycountobj=MyCount.getInstance();
        mycountobj.addCount();
        System.out.println("The count is:"+mycountobj.getCount());


        MyCount mycountobj2=MyCount.getInstance();
        System.out.println("the program is going to end here");

    }

}
