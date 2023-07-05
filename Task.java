import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task {
    public static void main(String[] args) throws Exception {
        
        Notebook Notebook1 = new Notebook("Lenovo IdealPad 5", 8, 256, "Windows 11", "синий", 15.6);
        Notebook Notebook2 = new Notebook("Honor MagicBook 16", 16, 512, "без ОС", "серый", 16.1);
        Notebook Notebook3 = new Notebook("Apple MacBook Air 13", 8, 256, "MacOs", "золотистый", 13.3);
        Notebook Notebook4 = new Notebook("HP 250 G7", 4, 1024, "без ОС", "черный", 15.6);
        Notebook Notebook5 = new Notebook("Xiomi RedmiBook 15", 8, 256, "Windows 11", "серый", 15.6);
        Notebook Notebook6 = Notebook1;

        Set<Notebook> unicNotebook = new HashSet<Notebook>();
        unicNotebook.add(Notebook1);
        unicNotebook.add(Notebook2);
        unicNotebook.add(Notebook3);
        unicNotebook.add(Notebook4);
        unicNotebook.add(Notebook5);
        unicNotebook.add(Notebook6);
        System.out.println(Notebook1.equals(Notebook6));
        System.out.printf("Всего уникалных ноутбуков: %d \n", unicNotebook.size());
        

        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "объем накопителя");
        mapCrit.put(3, "ОС");
        mapCrit.put(4, "цвет");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики: 1. объем оперативной памяти (гб): ");
        int ramUser = sc.nextInt();
        System.out.println("2. объем накопителя (гб): ");
        int storUser = sc.nextInt();
        
        for(Notebook lap: unicNotebook) {
            if ((lap.getRam() >= ramUser) && (lap.getStorageCap() >= storUser)) {
                System.out.println(lap.toString());
            }
        }
        sc.close();
        
    }
}
