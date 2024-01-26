import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HardwareStore {


    public static void main(String[] args) {
        Laptop lap1 = new Laptop("Katana11UCX892XRU", 8, 500, 52999, "Linux", "Black", "Taiwan");
        Laptop lap2 = new Laptop("MaibenbenX556", 8, 500, 71999, "Linux", "Black", "China");
        Laptop lap3 = new Laptop("AcerNitro5AN51546R7XU", 8, 500, 82799, "absent", "Black", "Taiwan");
        Laptop lap4 = new Laptop("GIGABYTEG5MF", 16, 1000, 90299, "Windows 11", "Black", "China");
        Laptop lap5 = new Laptop("AcerNitro5AN5155852F9", 16, 1000, 119999, "absent", "China", "China");
        Laptop lap6 = new Laptop("LenovoLegion5Pro16ACH6", 16, 1000, 153990, "absent", "China", "China");
        Laptop lap7 = new Laptop("AORUS17HBXF", 32, 3000, 237999, "Windows 11 Home", "Black", "China");
        Laptop lap8 = new Laptop("LenovoLegion716IAX7", 32, 4000, 301990, "Windows 11 Home", "Grey", "");
        Laptop lap9 = new Laptop("ASUSROGZephyrusDuo16GX650PYNM040W", 64, 5000, 447999, "Windows 11 Home", "Black", "China");

        Set<Laptop> laptops = new HashSet<>(Arrays.asList(lap1, lap2, lap3, lap4, lap5, lap6, lap7, lap8, lap9));

        Set<Laptop> filetre = findeTop(laptops);
        for (Laptop top : filetre) {
            System.out.println(top);
        }
    }


    public static Set<Laptop> findeTop(Set<Laptop> laptops) {
        Set<Laptop> sortedLapTop = new HashSet<>();
        int targetDataPriceMin = PriceMin();
        int targetDataPriceMax = PriceMax();
        for (Laptop lap : laptops) {
            if (targetDataPriceMax < targetDataPriceMin) {
                System.out.println("Максимальная цена ниже минимальной");
                break;
            } else if (targetDataPriceMin == 0 || targetDataPriceMax == 0) {
            } else if (lap.getPrice() >= targetDataPriceMin && lap.getPrice() <= targetDataPriceMax) {
                sortedLapTop.add(lap);
            }
        }
        Set<Laptop> sortedLapTop2 = new HashSet<>();
        int targetDataRamMin = RamMin();
        int targetDataRamMax = RamMax();
        for (Laptop lap : sortedLapTop) {
            if (targetDataRamMax < targetDataRamMin) {
                System.out.println("Максимальная RAM ниже минимальной");
                break;
            } else if (targetDataRamMin == 0 || targetDataRamMax == 0) {
            } else if (lap.getRam() >= targetDataRamMin && lap.getRam() <= targetDataRamMax) {
                sortedLapTop2.add(lap);
            }
        }
        return sortedLapTop2;
    }

    public static int PriceMin() {
        Scanner scaner = new Scanner(System.in);
        boolean res = true;
        int priceMin = 0;
        while (res) {
            System.out.println("Выберите критерии ");
            System.out.println("1 - Пропустить  | 2 - Минимальная стоимость");
            int data = scaner.nextInt();
            switch (data) {
                case 1:
                    res = false;
                    break;
                case 2:
                    System.out.println("Введите минимальную  стоимость  ");
                    priceMin = scaner.nextInt();
                    return priceMin;
            }
        }
        return priceMin;
    }

    public static int PriceMax() {
        Scanner scaner = new Scanner(System.in);
        boolean res = true;
        int PriceMax = 0;
        while (res) {
            System.out.println("Выберите критерии ");
            System.out.println("1 - Пропустить  |  2 - Максимальная стоимость  ");
            int data = scaner.nextInt();
            switch (data) {
                case 1:
                    res = false;
                    break;
                case 2:
                    System.out.println("Введите максимальную стоиомсть");
                    PriceMax = scaner.nextInt();
                    return PriceMax;
            }
        }
        return PriceMax;
    }

    public static int RamMin() {
        Scanner scaner = new Scanner(System.in);
        boolean res = true;
        int RamMin = 0;
        while (res) {
            System.out.println("Выберите критерии ");
            System.out.println("1 - Пропустить  | 2 - Минимальная память");
            int data = scaner.nextInt();
            switch (data) {
                case 1:
                    res = false;
                    break;
                case 2:
                    System.out.println("Введите минимальное RAM");
                    RamMin = scaner.nextInt();
                    return RamMin;
            }
        }
        return RamMin;
    }

    public static int RamMax() {
        Scanner scaner = new Scanner(System.in);
        boolean res = true;
        int RamMax = 0;
        while (res) {
            System.out.println("Выберите критерии ");
            System.out.println("1 - Пропустить  | 2 - Максимальная память");
            int data = scaner.nextInt();
            switch (data) {
                case 1:
                    res = false;
                    break;
                case 2:
                    System.out.println("Введите максимальное RAM");
                    RamMax = scaner.nextInt();
                    return RamMax;
            }
        }
        return RamMax;
    }


}
