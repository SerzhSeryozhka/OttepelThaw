import java.util.Scanner;

public class Thaw
{
    public static void main(String[] args)
    {
        System.out.print("Введите колличество сравниваемых дней: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Введите температуру в эти дни: ");
        int max = 0;
        int sp = 1;
        int u;
        int hz = 0;
        while (sp <= n)
        {
            u = scanner.nextInt(); //сканер ввода температур
            sp++;//счётчик дней
            if (u > 0)
            {
                hz++;
            } else
            {
                if (hz > max)
                    max = hz;
                hz = 0;
            }
        }
        if (hz > max)
            max = hz;
        System.out.println(max);
    }
}