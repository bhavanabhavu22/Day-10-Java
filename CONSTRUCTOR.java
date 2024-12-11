import java.util.*;
class construct {
    int c;
    String b;
    construct()
    
    {
        this.c=345;
        this.b="HELLO GUYS";
}
    void display()
    {
        System.out.println(b+" "+c);
    }
}
public class CONSTRUCTOR
{
    public static void main(String args[])
    {
      construct s=new construct();
      s.display();
    }
}