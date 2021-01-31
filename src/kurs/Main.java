package kurs;

/*
Ваша задачка чуть сложнее. Вы заранее не знаете, сколько цифр будет в числе.
На вход функции может прийти 1, 242, 14435 или 324234234
Функция должна вернуть TRUE в случае, если сумма цифр, стоящих на четных позициях
равна сумме цифр, стоящих на нечетных позициях ИЛИ если все цифры, стоящие на четных
позициях равны всем цифрам, стоящих на нечетных. Иначе вернуть FALSE.
Примеры:
3443 - TRUE
222222 - TRUE
321654 - FALSE
*/

public class Main {

    public static void main(String[] args) {

        System.out.printf("%d - %b\n", 3443, analysisNumber(3443));
        System.out.printf("%d - %b\n", 222222, analysisNumber(222222));
        System.out.printf("%d - %b\n", 321654, analysisNumber(321654));

    }

    private static boolean analysisNumber(int n) {
        String nStr = Integer.toString(n);
        StringBuilder oddSB = new StringBuilder();
        StringBuilder evenSB = new StringBuilder();
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < nStr.length(); i++) {
            char c = nStr.charAt(i);
            if (i % 2 == 0) {
                evenSB.append(c);
                evenSum += Integer.parseInt("" + c);
            } else {
                oddSB.append(c);
                oddSum += Integer.parseInt("" + c);
            }
        }
        return evenSum == oddSum || evenSB.toString().equals(oddSB.toString());
    }
}
