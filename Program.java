import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<House> house_list = new ArrayList<>();

        House house1 = new House(7000, 15000, "Moscow");
        House house2 = new House(10000, 7000, "Vladimir");
        House house3 = new House(5000, 3800, "Nizhny Novgorod");

        house_list.add(house1);
        house_list.add(house2);
        house_list.add(house3);

        for (House h: house_list) {
            System.out.println(h);
        }

        PriceComparator priceComparator = new PriceComparator();
        house_list.sort(priceComparator);

        System.out.println("Sorted ");
        for (House h: house_list) {
            System.out.println(h);
        }
    }
}
