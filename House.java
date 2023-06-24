public class House implements Comparable<House> {
    int area;
    int price;
    String city;

    public House(int area, int price, String city) {
        this.area = area;
        this.city = city;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("House :");
        sb.append(" area ").append(area);
        sb.append(", price ").append(price);
        sb.append(", city ").append(city);
        return sb.toString();
    }

    @Override
    public int compareTo(House anotherHouse) {
        if (this.area == anotherHouse.area)
        {
            return 0;
        }
        else if (this.area < anotherHouse.area)
        {
            return -1;
        }
        else
        {
            return 1;
        }

    }
}
