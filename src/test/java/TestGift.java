import NewYearsGift.Candy;
        import NewYearsGift.Chocolate;
        import NewYearsGift.GiftBox;
        import NewYearsGift.JellyBelly;
        import org.junit.Assert;
        import org.junit.Test;

public class TestGift {

    @Test//пустая коробка не содержит товар
    public void initiallyTheBoxIsEmpty() {
        GiftBox giftBox = new GiftBox();
        //giftBox.addGift(new Chocolate("Шоколад", 200, 100, "dark"));
        Assert.assertEquals("В пустой коробке не должно ничего лежать!",0,giftBox.getNumOfSweets(),0);
    }

    @Test//проверяем, что пустая коробка весит 0
    public void theWeightOfTheEmptyBox() {
        GiftBox giftBox = new GiftBox();
        Assert.assertEquals("Вес пустой коробки должен ровняться нулю!", 0, giftBox.getTotalWeight(), 0);
    }

    @Test//проверяем, что пустая коробка стоит 0
    public void thePriceOfTheEmptyBox() {
        GiftBox giftBox = new GiftBox();
        Assert.assertEquals("Стоимость пустой коробки должна ровняться нулю!", 0, giftBox.getTotalPrice(), 0);
    }

    @Test//проверяем, что цена подарка больше 0
    public void thePriceOfTheGift() {
        GiftBox giftBox = new GiftBox();
        double price1 = 1;
        double price2 = 0;
        double price3 = 0;
        giftBox.addGift(new Candy("Конфета", price1, 200, "lollipop"));
        giftBox.addGift(new Chocolate("Шоколад", price2, 300, "dark"));
        giftBox.addGift(new JellyBelly("JellyBelly", price3, 400, "fruit"));
        Assert.assertTrue("Вес коробчки должен быть больше 0", price1 + price2 + price3 > 0);
    }

    @Test//Вес конфеты должен быть больше 0
    public void theWeightOfTheCandy() {
        GiftBox giftBox = new GiftBox();
        double weight = 10;
        giftBox.addGift(new Candy("Конфета", 100, weight, "lollipop"));
        Assert.assertTrue("Вес конфеты должен быть больше 0", weight > 0);
    }

    @Test//Цена шоколадки больше 0
    public void thePriceOfTheChocolate() {
        GiftBox giftBox = new GiftBox();
        double price = 20;
        giftBox.addGift(new Chocolate("Шоколад", price, 100, "dark"));
        Assert.assertTrue("Цена шоколада должна быть больше 0", price > 0);
    }

 @Test//Количество товаров в коробке должно быть больше 0\
    public void theQuantityOfTheItemInTheBox() {
        GiftBox giftBox = new GiftBox();
        giftBox.addGift(new Chocolate("Шоколад", 200, 100, "dark"));
        Assert.assertTrue("Количество товаров должно быть больше 0",giftBox.getNumOfSweets()>0);
    }


}
