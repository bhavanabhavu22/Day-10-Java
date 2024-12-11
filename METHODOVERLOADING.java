public class METHODOVERLOADING {
    static void a()
    {
        System.out.println();
    }
    static void a(int b)
    {
        System.out.println("HEY PEOPLE MEMBERS "+b );
    }
    static void a(int b,int c)
    {
        System.out.println("PLZZ "+  b +" "+c);
    }
    public static void main(String args[])
    {
        a();
        a(6);
        a(4,7);
    }
}
