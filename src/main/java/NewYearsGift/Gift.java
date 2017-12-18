package NewYearsGift;

// Создаем класс подарок
public abstract class Gift {
    private String tovar;
    private double price;
    private double weight;


    //Конструктор
    public Gift(String tovar, double price, double weight) {
        this.tovar = tovar;
        this.price = price;
        this.weight = weight;
    }

    //Геттеры
    public String getTovar() {
        return tovar;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    //Сеттеры
    public void setTovar(String tovar) {
        this.tovar = tovar;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Товар: "+tovar+" Вес: "+ weight + " Цена: "+price;
    }


}
