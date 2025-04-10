public class HelloWorld
{
  public static void main(String[] args) {
    if(args.length != 1)
    {
      System.out.println("Usage: java HelloWorld YOURNAMEHERE");
    }
    else
    {
      System.out.println("Hello " + args[0] + "!");
    }
  }
}