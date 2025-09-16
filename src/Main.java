//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Привет Мир!!!");
        System.out.println(" Hello World!!!");

        var dog = 8.0;
        var cat = 3.6;
        var peper = 763789;
        System.out.println(" dog " +dog);
        System.out.println(" cat " +cat);
        System.out.println(" peper " +peper);

// увеличил переменную на 4
        dog = dog + 4;
        cat = cat + 4;
        peper = peper + 4;
        System.out.println(" dog "+dog);
        System.out.println(" cat " + cat);
        System.out.println(" peper " + peper);

// уменьшил переменную
        dog = dog - 3.5;
        cat = cat + 1.6;
        peper = peper + 7636;
        System.out.println(" dog " +dog);
        System.out.println(" cat " + cat);
        System.out.println(" peper " + peper);

// Задача №4
        var friend = 19;
        System.out.println(" friend " +friend);
        friend = friend+2;
        System.out.println(" friend " +friend);
        friend = friend / 7;
        System.out.println(" friend " +friend);

// Задача № 5
        var frog = 3.5;
        System.out.println(" frog " +frog);
        frog = frog * 10;
        System.out.println(" frog " +frog);
        frog = frog / 3.5;
        System.out.println(" frog " +frog);
        frog = frog + 4;
        System.out.println(" frog " +frog);

// Задача 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalMass = boxer1+boxer2;
        System.out.println("Общая масса двух боксеров " + totalMass + " кг");
        var differenceBetweenMasses = boxer2 - boxer1;
        System.out.println("Разница между весом боксеров " + differenceBetweenMasses + " кг");
// Задача 7 находим остаток от деления между двумя весами
        var balanceBetweenScales = boxer2 % boxer1;
        System.out.println("остаток от деления " +balanceBetweenScales + " кг " );
// Задача 8     1.условие
        var totalOperatingHours = 640; // всего часов поделено между сотрудниками
        var hoursPerEmployee = 8;      // часов в день на одного сотрудника
        var personInCompany = totalOperatingHours/hoursPerEmployee;   //работников в компании
        System.out.println("Всего работников в компании " +personInCompany + " человек");

//              2. условие  в компании стало на 94 человека больше
        var moreEmployees = personInCompany + 94;
        System.out.println("стало сотрудников " + moreEmployees);
        var newTotalHours = moreEmployees*hoursPerEmployee;
        System.out.println("Если в компании работает " + moreEmployees+ " человека, то всего " + newTotalHours+ " часов работы может быть поделено между сотрудниками" );

// Переменные урок 2.
//  Задача 1  Объявите переменные типа int, byte, short, long, float, double.
        int a = 5;
        byte b = 127;
        short c = 300;
        long d = 500000L;
        float e = 15.5f;
        double f = 10.65;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b типом byte равно " + b);
        System.out.println("Значение переменной C типом short равно " + c);
        System.out.println("Значение переменной d типом long равно " + d);
        System.out.println("Значение переменной e типом float равно " + e);
        System.out.println("Значение переменной f типом double равно " + f);
        // задача 2
        double num1  = 27.12;
        long num2 = 987678965549L;
        double num3 = 2.786;
        short num4 = 569;
        short num5 = -159;
        short num6 = 27897;
        byte num7 = 67;
        System.out.println(+num1+" подходит тип double");
        System.out.println(+num2+" подходит тип long");
        System.out.println(+num3+" подходит тип double");
        System.out.println(+num4+" подходит тип short");
        System.out.println(+num5+" подходит тип short");
        System.out.println(+num6+" подходит тип short");
        System.out.println(+num7+" подходит тип byte");
// задача 3
        byte ludmilaPavl = 23;
        byte AnnaSerg = 27;
        byte EkatAndreev = 30;
        short totalPaper = 480;
        int totalStudents = ludmilaPavl+AnnaSerg+EkatAndreev;
        int papersForStudent = totalPaper/totalStudents;
        System.out.println("На каждого ученика рассчитано " +papersForStudent+ " листов бумаги");
// Задача 4
        byte bottlesPer2Min = 16;
        byte minutesPer2Min = 2;
        int bottlesPerMinute = bottlesPer2Min/minutesPer2Min;
        byte time20Min = 20;
        short time1Day = 24 * 60;
        int time3Days = 3 * time1Day;
        int time1Month = 30 * time1Day;

        int bottles20Min = bottlesPerMinute * time20Min;
        int bottles1Day = bottlesPerMinute * time1Day;
        int bottles3Days = bottlesPerMinute * time3Days;
        int bottles1Month = bottlesPerMinute * time1Month;

        System.out.println("За 20 минут машина произвела " + bottles20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottles1Day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottles3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottles1Month + " штук бутылок");
// Задача 5
        byte totalCans = 120; // всего банок краски
        byte whiteForClass = 2; // белой краски на 1 класс
        byte brownOnClass = 4; // коричневой краски на 1 класс
        int numberOfClasses = totalCans / (whiteForClass + brownOnClass); // 20 классов в школе
        System.out.println("количество классов в школе "+numberOfClasses);

        int allWhitePaint = whiteForClass * numberOfClasses; // 40 банок белой краски
        int allBrownPaint = brownOnClass * numberOfClasses ; // 80 банок коричневой краски
        System.out.println("было куплено "+allWhitePaint+" банок белой краски" );
        System.out.println( "было куплено "+allBrownPaint+" банок коричневой краски " );
        System.out.println("В школе, где "+numberOfClasses+" классов, нужно "+allWhitePaint+" банок белой краски и " +allBrownPaint+" банок коричневой краски");

        //Задача 6

        short weightBanana = 5 * 80;
        short weightMilkMl = (200 / 100) * 105;
        short weightIceCreamPlombir = 2 * 100;
        short weightRawEgg = 4 * 70;

        float weightInGrams = weightBanana + weightMilkMl + weightIceCreamPlombir + weightRawEgg;
        float weightInKg = weightInGrams/1000;
        System.out.println("Вес спортзавтрака из всех ингридиентов составляет "+weightInGrams+" грамм, или "+weightInKg+ " кг.");
// Задача 7
        short totalWeightLoss = 7000;
        short lossPerDay1 = 250;
        short lossPerDay2 = 500;

        int daysAt250 = totalWeightLoss / lossPerDay1; // 28
        int daysAt500 = totalWeightLoss / lossPerDay2; // 14
        double averageDays = (daysAt250 + daysAt500) / 2.0; // 21.0

        System.out.println(+daysAt250+" дней для похудения на 7 кг при потере по 250 г в день");
        System.out.println(+ daysAt500+ " Дней для похудения на 7 кг при потере по 500 г в день");
        System.out.println("В среднем потребуется " + averageDays + " день");
        //Задача 8
        // Исходные зарплаты
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        // Маша
        float newSalaryMasha = salaryMasha * 1.10f ;
        float oldYearIncomeMasha = salaryMasha * 12;
        float newYearIncomeMasha = newSalaryMasha * 12;
        float diffMasha = newYearIncomeMasha - oldYearIncomeMasha;
        // Денис
        float newSalaryDenis = salaryDenis * 1.10f;
        float oldYearIncomeDenis = salaryDenis * 12;
        float newYearIncomeDenis = newSalaryDenis * 12;
        float diffDenis = newYearIncomeDenis - oldYearIncomeDenis;
        // Кристина
        float newSalaryKristina = salaryKristina * 1.10f;
        float oldYearIncomeKristina = salaryKristina * 12;
        float newYearIncomeKristina = newSalaryKristina * 12;
        float diffKristina = newYearIncomeKristina - oldYearIncomeKristina;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + diffMasha + " руб.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + diffDenis + " руб.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + diffKristina + " руб.");
    }




    }







