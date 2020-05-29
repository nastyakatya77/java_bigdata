package anastasiya.kunitskaya;

class Factory extends Thread
{
    public void run()
    {
        while(true)
        {
            synchronized (Main.factory)
            {
                Main.created++;
                System.out.println("Created " + Integer.toString(Main.created));
            }
            try
            {
                Thread.sleep(700);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread has been interrupted");
            }
        }
    }
}

class Shop extends Thread
{
    public void run()
    {
        while(true)
        {
            synchronized (Main.factory)
            {
                synchronized (Main.storage)
                {
                    if(Main.created > 0)
                    {
                        Main.created--;
                        Main.delivered++;
                        System.out.println("Delivered " + Integer.toString(Main.delivered));
                    } else
                        System.out.println("Nothing to deliver");
                }
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread has been interrupted");
            }
        }
    }
}

class Client extends Thread
{
    public void run()
    {
        while(true)
        {

            synchronized (Main.storage)
            {
                synchronized (Main.buy)
                {
                    if(Main.delivered > 0)
                    {
                        Main.delivered--;
                        Main.bought++;
                        System.out.println("Bought " + Integer.toString(Main.bought));
                    } else
                        System.out.println("Nothing to buy");
                }

            }

            try
            {
                Thread.sleep(1200);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread has been interrupted");
            }
        }
    }
}

public class Main
{
    public static Object factory = new Object();
    public static Object storage = new Object();
    public static Object buy = new Object();
    public static int created = 0;
    public static int delivered = 0;
    public static int bought = 0;

    public static void main(String[] args)
    {
        Factory factory = new Factory();
        Shop shop1 = new Shop();
        Shop shop2 = new Shop();
        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        factory.start();
        shop1.start();
        shop2.start();
        client1.start();
        client2.start();
        client3.start();
    }
}
