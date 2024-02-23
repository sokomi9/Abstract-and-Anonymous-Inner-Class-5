abstract class Occupation
{
    public abstract void occupation();
    public abstract void occupationSalary();
    public abstract void occupationAge();
}
public class index
{
    public static void main(String a[])
    {
        Occupation obj = new Occupation() {
            public void occupation()
            {
                System.out.println("Software Developer");
            }
            public void occupationSalary()
            {
                System.out.println("$200000 per annum");
            }
            public void occupationAge()
            {
                System.out.println(15);
            }
        };
        obj.occupation();
        obj.occupationAge();
        obj.occupationSalary();
    }
}