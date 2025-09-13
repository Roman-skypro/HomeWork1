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

    }
    }
