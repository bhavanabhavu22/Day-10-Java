import java.util.*;
public class ARGUMENTpassing {
    String name;
    ARGUMENTpassing(String name)
    {
        this.name=name;
    }
    void dis1()
    {
        System.out.println(name);
    }
    void agt()
    {
         teacher s=new teacher();
        s.teach(this);
    }
    public static void main(String args[])
    {
        ARGUMENTpassing d=new ARGUMENTpassing("HARSHA SAI");
        d.agt();
    }
}
class teacher {
    public void teach(ARGUMENTpassing s)
    {
        s.dis1();
    }
}

