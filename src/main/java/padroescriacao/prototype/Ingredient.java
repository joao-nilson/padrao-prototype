package padroescriacao.prototype;

public class Ingredient implements Cloneable {
    private String name;
    private double grams;

    public Ingredient(String name, double grams) {
        this.name = name;
        this.grams = grams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrams() {
        return grams;
    }

    public void setGrams(double grams) {
        this.grams = grams;
    }

    public void scale(double factor) {
        this.grams = this.grams * factor;
    }

    @Override
    public Ingredient clone() throws CloneNotSupportedException {
        return (Ingredient) super.clone();
    }

    @Override
    public String toString() {
        return name + "=" + grams + "g";
    }
}
