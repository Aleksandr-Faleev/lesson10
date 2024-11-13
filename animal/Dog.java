public class Dog extends Animal{
    // Статическая переменная для подсчёта собак
    private static int dogCount = 0;
    private String name;
    public Dog(String name) {
        super();
        this.name=name;
        dogCount++;
    }

    //Метод действия бег
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(this.name+" " +"пробежал"+" "+distance + " метров.");
        } else {
            System.out.println(this.name+" "+"больше бежать не может");
        }
    }
    // Метод действия плавать
   public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(this.name+" "+"проплыл"+" " +distance+"м");
        } else {
            System.out.println(this.name+" " +"больше плыть не может");
        }
    }

    // Метод для получения количества собак
    public static int getDogCount() {
        return dogCount;
    }
}


