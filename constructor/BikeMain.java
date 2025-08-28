package constructor;

class Bike {

    String name;
    int price;
    String color;
    int yom;
    String brand;

    public Bike(String name, int price, String color, int yom, String brand) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.yom = yom;
        this.brand = brand;
    }
}

public class BikeMain {
    public static void main(String[] args) {
        Bike b1 = new Bike("Honda CF", 80000, "Black", 2024, "Honda");
        System.out.println("Bike 1 name: " + b1.name);
        System.out.println("Bike 1 price: " + b1.price);
        System.out.println("Bike 1 color: " + b1.color);
        System.out.println("Bike 1 year of manufacturing: " + b1.yom);
        System.out.println("Bike 1 brand: " + b1.brand);
        System.out.println();

        Bike b2 = new Bike("Yamaha R15", 160000, "Blue", 2023, "Yamaha");
        System.out.println("Bike 2 name: " + b2.name);
        System.out.println("Bike 2 price: " + b2.price);
        System.out.println("Bike 2 color: " + b2.color);
        System.out.println("Bike 2 year of manufacturing: " + b2.yom);
        System.out.println("Bike 2 brand: " + b2.brand);
        System.out.println();

        Bike b3 = new Bike("Royal Enfield Classic 350", 210000, "Grey", 2022, "Royal Enfield");
        System.out.println("Bike 3 name: " + b3.name);
        System.out.println("Bike 3 price: " + b3.price);
        System.out.println("Bike 3 color: " + b3.color);
        System.out.println("Bike 3 year of manufacturing: " + b3.yom);
        System.out.println("Bike 3 brand: " + b3.brand);
        System.out.println();

        Bike b4 = new Bike("KTM Duke 390", 300000, "Orange", 2024, "KTM");
        System.out.println("Bike 4 name: " + b4.name);
        System.out.println("Bike 4 price: " + b4.price);
        System.out.println("Bike 4 color: " + b4.color);
        System.out.println("Bike 4 year of manufacturing: " + b4.yom);
        System.out.println("Bike 4 brand: " + b4.brand);
        System.out.println();

        Bike b5 = new Bike("Suzuki Gixxer SF", 140000, "Red", 2021, "Suzuki");
        System.out.println("Bike 5 name: " + b5.name);
        System.out.println("Bike 5 price: " + b5.price);
        System.out.println("Bike 5 color: " + b5.color);
        System.out.println("Bike 5 year of manufacturing: " + b5.yom);
        System.out.println("Bike 5 brand: " + b5.brand);
        System.out.println();

        Bike b6 = new Bike("Kawasaki Ninja 300", 350000, "Green", 2023, "Kawasaki");
        System.out.println("Bike 6 name: " + b6.name);
        System.out.println("Bike 6 price: " + b6.price);
        System.out.println("Bike 6 color: " + b6.color);
        System.out.println("Bike 6 year of manufacturing: " + b6.yom);
        System.out.println("Bike 6 brand: " + b6.brand);
        System.out.println();

    }
}
