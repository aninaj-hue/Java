package extended;

import java.util.Scanner;

public class B extends A{
    public B(int x) {
        super(x);
    }

    public String s;
    public void readS()
    {
        Scanner scanner = new Scanner(System.in);
        this.s=scanner.nextLine();
        scanner.close();
    }

    public void displayX()
    {
        System.out.println(x);
    }


}
