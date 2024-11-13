//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Создаём объекты собаки и кошки
        Dog boss = new Dog("Босс");
        boss.run(450);
        boss.swim(3);
        boss.run(510);
        boss.swim(11);

        Dog reks = new Dog("Рекс");
        reks.run(350);
        reks.swim(6);
        reks.run(510);
        reks.swim(11);

        Cat leo = new Cat("Лео");
        leo.run(150);
        leo.run(510);
        leo.swim(6);

        Cat milo = new Cat("Мило");
        milo.run(90);
        milo.run(510);
        milo.swim(6);

        Cat pux = new Cat("Пушок");
        pux.run(90);
        pux.run(510);
        pux.swim(6);

        // Подсчёт созданных животных
        System.out.println("Всего создано животных: " + Animal.quantityCount());
        System.out.println("Всего создано собак: " + Dog.getDogCount());
        System.out.println("Всего создано кошек: " + Cat.getCatCount());

        // Кормление кошек
        Bowel bowl = new Bowel(30);
        Cat[] cats = {new Cat("Лео"), new Cat("Мило"), new Cat("Пушок")};

        for (Cat cat : cats) {
            cat.eatFromBowl(bowl, 10);

        }

        // Проверка сытости кошек
        for (int i = 0; i < cats.length; i++) {
            System.out.println("кот №" + (i+1) + " сыта: " + cats[i].isFull());
        }

        // Добавление ещё еды в миску
        bowl.addFood(10);
        System.out.println("Текущее количество еды в миске: " + bowl.getFoodAmount());
    }
}

