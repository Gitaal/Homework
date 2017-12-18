package NewYearsGift;

public class AllGift {
    public void allGift() {
        GiftBox box=new GiftBox();
        box.addGift(new Candy("Mentos", 200, 0.2, "lollipops"));
        box.addGift(new JellyBelly("Hello kitty",900, 0.5,"fruit"));
        box.addGift(new Chocolate("Snickers",300, 0.7,"dark"));

        box.printItems();
        System.out.println();
        box.dellGift(2);
        System.out.println();
        System.out.println("После удаления:");
        box.printItems();


   }
}
