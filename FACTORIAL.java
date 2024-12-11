
class  FACTORIAL {
    int sum(int n)
    {
        if(n==0)
        return 1;
        return n*sum(n-1);
    }
    public static void main(String args[])
    {
        FACTORIAL r=new FACTORIAL();
        int res=r.sum(5);
        System.out.println(res);
    }
}