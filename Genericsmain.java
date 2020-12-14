class Generics<T, U,S>
{
    T obj1;
    U obj2;
    S obj3;  
    Generics(T obj1, U obj2,S obj3)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
 
    }
}
 
class Genericsmain
{
    public static void main (String[] args)
    {
        Generics <String,Integer, String> obj =new Generics<String, Integer,String>("WEEK", 7,"LAB-PROGRAM");
 
        obj.print();
    }
}