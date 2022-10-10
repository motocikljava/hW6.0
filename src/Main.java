public class Main {
    public static void main(String[] args) {
        // задание 1
        var cash = 15000;
        var total = 0;
        var month = 1;
        while (total <= 2_459_000) {
            System.out.println( "Месяц " + month + ", сумма накоплений равна " + total + " рублей" );
            total = total + total / 100;
            total = total + cash;
            month++;
            // я не понимаю как подогнать под точную сумму в 2.459.000
        }
        // задание 2
        int a = 1;
        while (a <= 10) {
            System.out.println( a );
            a++;
        }
        for (int b = 10 ; b >= 1; b--) {
            System.out.println( b );
        }
        //задание 3
        var population = 12000000;
        var prirost = population / 1000 * 17;
        var smert = population / 1000 * 8;
        var years = 0;
        while ( years < 10) {
            years++;
            population = population + prirost - smert;
            System.out.println("Год " + years + ", численность населения составляет " + population);
        }
        //задание 4 и 5 сделал в одном т.к. нет смысла разбивать
        int pervyiVznos = 15000;
        int summaZaMes = pervyiVznos * 7 / 100;
        int itogo = 0;
        var monthVklada = 0;
        while (itogo <= 12000000) {
            itogo = itogo + pervyiVznos + summaZaMes;
            monthVklada++;
            if (monthVklada % 6 == 0) {
                System.out.println("накоплений " + itogo + " за " + monthVklada + " месяцев");
            }

        }
        //задание 6

        int vznosVasi = 15000;
        int zaMesayac = vznosVasi * 7 / 100;
        int monthInYear = 12 * 9;
        int monthOfYear = 0;
        while ( monthOfYear <= monthInYear ) {
            monthOfYear++;
            int itog = (vznosVasi + zaMesayac) * monthOfYear;
            if (monthOfYear % 6 == 0) {
                System.out.println("Итого накоплений за каждые пол года вклада " + itog );
            }

        }
// задание 7
        for (int friday = 5; friday <=31; friday++) {
            if (friday % 7 == 0)
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        // задание 8
        int nolYear = 0;
        int periodProleta = 79;
        int now = 2022;
        int doNow = now - 200;
        int posleNow = now + 100;
        while (nolYear < posleNow) {
            if (nolYear > doNow) {
                System.out.println(nolYear);
            }
            nolYear = nolYear + periodProleta;
        }
        //задание 9
        for (int n = 2; n <= 10; n ++) {
            System.out.println(n * 2);
        }
        System.out.println("сделал дз");



    }
}