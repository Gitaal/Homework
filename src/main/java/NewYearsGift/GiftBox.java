package NewYearsGift;

//Хранилище вкусностей:)
public class GiftBox {
    Gift[] giftBox = new Gift[0];
    private double totalPrice = 0;
    private double totalWeight = 0;

    //Добавляем товар
    public void addGift(Gift gift) {
        int oldSize = giftBox.length;
        Gift[] newGiftBox = new Gift[oldSize + 1];
        for (int i = 0; i < oldSize; i++) {
            newGiftBox[i] = giftBox[i];
        }
        newGiftBox[oldSize] = gift;
        giftBox = newGiftBox;
        totalPrice += gift.getPrice();
        totalWeight += gift.getWeight();
    }


    public void dellGift(int index) {
        int oldSizeDell = giftBox.length;
        int newSizeDell = oldSizeDell - 1;
        int i;
        totalPrice -= giftBox[index].getPrice();//Выводим элемент, который удаляем
        totalWeight -= giftBox[index].getWeight();
        Gift[] newDellGiftBox = new Gift[newSizeDell];
        for (i = 0; i < newSizeDell; i++) {//ищем элемент, который надо удалить
            int oldIndex;
            if (i < index) {
                oldIndex = i;
            } else {
                oldIndex = i + 1;
            }
            newDellGiftBox[i] = giftBox[oldIndex];
        }
        System.out.println("Вынули из коробки: " + giftBox[index].toString());
        giftBox = newDellGiftBox;
    }


    //Выводим список

    public void printItems() {
        for (int i = 0; i < giftBox.length; i++) {
            System.out.println(i + ". " + giftBox[i].toString());
        }
        System.out.println("Общий вес товара: " + totalWeight + " Общая стоимость: " + totalPrice);

    }


    public double getTotalWeight() {
        return totalWeight;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getNumOfSweets() {
        return giftBox.length;
    }


}
