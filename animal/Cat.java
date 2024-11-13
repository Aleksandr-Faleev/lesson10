public class Cat extends Animal {

    // Статическая переменная для подсчёта кошек
    private static int catCount = 0;
    public String name;



    // Поле для хранения сытости кошки
    private boolean fullness;

    public Cat(String name) {
        super();
        this.name=name;
        catCount++;
        this.fullness = false;
    }

//Метод действия бег
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(this.name + " " + "пробежал" + " " + distance + "м");
        } else {
            System.out.println(this.name + " " + "больше бежать не может ");
        }
    }

    // Метод действия плавать
    public void swim(int distance) {
        System.out.println(this.name + " " + "кот не умеет плавать");
    }

    // Метод для кормления кошки
    public void eatFromBowl(Bowel bowl, int amount) {
        if (bowl.getFoodAmount() >= amount) {
            bowl.consumeFood(amount);
            this.fullness = true;
            System.out.println("Кошка съела " + amount + " единиц еды.");
        } else {
            System.out.println("В миске недостаточно еды для кошки.");
        }
    }

    // Метод для проверки сытости кошки
    public boolean isFull() {
        return fullness;
    }

    // Метод для получения количества кошек
    public static int getCatCount() {
        return catCount;
    }
}
