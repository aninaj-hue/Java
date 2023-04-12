package extended;

import java.util.Scanner;

public class C extends B {
    public C(int x) {
        super(x);
    }
    private float y;
    public void readY()
    {try (Scanner scanner = new Scanner(System.in))
    {this.y=scanner.nextFloat();}
    }

    public void readX()
    {
        try(Scanner scanner = new Scanner(System.in))
        {this.x=scanner.nextInt();}
    }
    public void displayXYS()
    {
        System.out.println("X="+x+ " Y=" +y+ "S= "+s);
    }
}
