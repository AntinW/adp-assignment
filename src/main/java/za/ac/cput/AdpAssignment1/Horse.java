package za.ac.cput.AdpAssignment1;

/**
 * Author: Tauriq-Allie Wilkinsob
 * Subject: ADP372S
 * Student No.: 219071330
 */
public class Horse {

    private String name,color;
    private int age;
    private double weight,height;

    public Horse()
    {

    }

    public Horse(String name, String color, int age, double weight, double height)
    {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName()
    {
        return name;
    }

    public String getColor()
    {
        return color;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public double getHeight()
    {
        return height;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setColor(String color)
    {
        this.color = color;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
