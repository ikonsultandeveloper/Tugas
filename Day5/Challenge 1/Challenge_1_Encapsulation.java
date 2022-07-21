import java.util.*;

class Cat
{
    private String full_color;
    private Integer num_of_leg;

    public Cat(){

    }
    public Cat(String full_color, Integer num_of_leg)
    {
        this.full_color = full_color;
        this.num_of_leg = num_of_leg;
    }
    public void setFullColor(String full_color)
    {
        this.full_color = full_color;
    }
    public void setNumOfLeg(Integer num_of_leg)
    {
        this.num_of_leg = num_of_leg;
    }
    public String getFullColor()
    {
        return this.full_color;
    }
    public Integer getNumOfLeg()
    {
        return this.num_of_leg;
    }
    public void show_identity()
    {
        System.out.println("Saya kucing dengan detail, Warna Bulu : " + this.getFullColor() + " dengan jumlah kaki : " + this.getNumOfLeg());
    }
}

class Fish
{
    private String type;
    private String feed;

    public Fish(){

    }
    public Fish(String type, String feed)
    {
        this.type = type;
        this.type = feed;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setFeed(String feed)
    {
        this.feed = feed;
    }
    public String getType()
    {
        return this.type;
    }
    public String getFeed()
    {
        return this.feed;
    }
    public void show_identity()
    {
        System.out.println("Saya ikan dengan detail, Jenis : " + this.getType() + " makanan : " + this.getFeed());
    }
}

class Flower
{
    private String nama;
    private String color;
    private Integer num_of_petal;

    public Flower(){

    }
    public Flower(String nama, String color, Integer num_of_petal)
    {
        this.nama = nama;
        this.color = color;
        this.num_of_petal = num_of_petal;
    }
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setNumOfPetal(Integer num_of_petal)
    {
        this.num_of_petal = num_of_petal;
    }
    public String getNama()
    {
        return this.nama;
    }
    public String getColor()
    {
        return this.color;
    }
    public Integer getNumOfPetal()
    {
        return this.num_of_petal;
    }
    public void show_identity()
    {
        System.out.println("Saya bunga dengan detail, Jenis : " + this.getNama() + " color : " + this.getColor() + " num of petal : " + this.getNumOfPetal());
    }
}

class Car
{
    private String type;
    private String color;
    private Integer num_of_tire;

    public Car(){

    }
    public Car(String type, String color, Integer num_of_tire)
    {
        this.type = type;
        this.color = color;
        this.num_of_tire = num_of_tire;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setNumOfTire(Integer num_of_tire)
    {
        this.num_of_tire = num_of_tire;
    }
    public String getType()
    {
        return this.type;
    }
    public String getColor()
    {
        return this.color;
    }
    public Integer getNumOfTire()
    {
        return this.num_of_tire;
    }
    public void show_identity()
    {
        System.out.println("Saya mobil dengan detail, Type : " + this.getType() + " color : " + this.getColor() + " num of tire : " + this.getNumOfTire());
    }
}

public class Challenge_1_Encapsulation
{
    public static void main(String[] arg)
    {
        Cat();
        Fish();
        Flower();
        Car();
    }
    public static void Cat()
    {
        Cat cat1 = new Cat();
        cat1.setFullColor("Hitam");
        cat1.setNumOfLeg(4);
        cat1.show_identity();

        Cat cat2 = new Cat();
        cat2.setFullColor("Putih");
        cat2.setNumOfLeg(3);
        cat2.show_identity();

        Cat cat3 = new Cat();
        cat3.setFullColor("Hitam Putih");
        cat3.setNumOfLeg(4);
        cat3.show_identity();

        Cat cat4 = new Cat();
        cat4.setFullColor("Poleng Poleng");
        cat4.setNumOfLeg(3);
        cat4.show_identity();

        Cat cat5 = new Cat();
        cat5.setFullColor("Bintik Bintik");
        cat5.setNumOfLeg(4);
        cat5.show_identity();
    }

    public static void Fish()
    {
        Fish fish1 = new Fish();
        fish1.setType("Paus");
        fish1.setFeed("Plankton");
        fish1.show_identity();

        Fish fish2 = new Fish();
        fish2.setType("Cupang");
        fish2.setFeed("Cacing");
        fish2.show_identity();

        Fish fish3 = new Fish();
        fish3.setType("Arwana");
        fish3.setFeed("Jangkrik");
        fish3.show_identity();

        Fish fish4 = new Fish();
        fish4.setType("Sapu Sapu");
        fish4.setFeed("Pelet");
        fish4.show_identity();
    }

    public static void Flower()
    {
        Flower flower1 = new Flower();
        flower1.setNama("Bangkai");
        flower1.setColor("Merah");
        flower1.setNumOfPetal(12);
        flower1.show_identity();

        Flower flower2 = new Flower();
        flower1.setNama("Anggrek");
        flower1.setColor("Putih");
        flower1.setNumOfPetal(8);
        flower2.show_identity();

        Flower flower3 = new Flower();
        flower3.setNama("Mawar");
        flower3.setColor("Merah");
        flower3.setNumOfPetal(3);
        flower3.show_identity();

        Flower flower4 = new Flower();
        flower4.setNama("Melati");
        flower4.setColor("Kuning");
        flower4.setNumOfPetal(5);
        flower4.show_identity();
    }

    public static void Car()
    {
        Car car1 = new Car();
        car1.setType("Sedan");
        car1.setColor("Merah");
        car1.setNumOfTire(4);
        car1.show_identity();

        Car car2 = new Car();
        car2.setType("Truk");
        car2.setColor("Hijau");
        car2.setNumOfTire(6);
        car2.show_identity();

        Car car3 = new Car();
        car3.setType("Tronton");
        car3.setColor("Coklat");
        car3.setNumOfTire(12);
        car3.show_identity();

        Car car4 = new Car();
        car4.setType("Angkot");
        car4.setColor("Kuning");
        car4.setNumOfTire(4);
        car4.show_identity();
    }
}
