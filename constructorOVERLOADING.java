import java.util.*;
public class constructorOVERLOADING {
    String name;
    constructorOVERLOADING()
    {
        name="raj";
    }
    constructorOVERLOADING(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String args[])
    {
        constructorOVERLOADING c=new constructorOVERLOADING();
        c.display();
        constructorOVERLOADING b=new constructorOVERLOADING("pandu");
        b.display();
    }
}
