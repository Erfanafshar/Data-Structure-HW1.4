import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int limit;
        String lAndnStr;
        String goodsStr;
        String[] lAndn;
        String[] goodsS;

        lAndnStr = scanner.nextLine();
        goodsStr = scanner.nextLine();

        lAndn = lAndnStr.split(" ");
        goodsS = goodsStr.split(" ");

        number = Integer.valueOf(lAndn[0]);
        limit = Integer.valueOf(lAndn[1]);

        int[] goods = new int[number];

        for (int i = 0; i < number; i++) {
            goods[i] = Integer.valueOf(goodsS[i]);
        }

        Arrays.sort(goods);

        int f = 0;
        int l = number - 1;
        int res = 0;

        while (true) {

            if (f >= l) {
                if (f == l) {
                    res++;
                }
                break;
            }

            if (goods[f] + goods[l] > limit) {
                res++;
                l--;
            } else {
                res++;
                l--;
                f++;
            }
        }
        System.out.println(res);
    }

}
