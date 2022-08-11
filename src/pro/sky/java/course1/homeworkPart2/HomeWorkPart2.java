package pro.sky.java.course1.homeworkPart2;

public class HomeWorkPart2 {
    public static void main(String[] args) {

        Author bradberry = new Author("Рей", "Бредберри");

        Author pushkin = new Author("Александр", "Пушкин");

        Author bradferry = new Author("Рей", "Бредферри");

        Book fahrenheit = new Book("Фаренгейт", bradberry, 1976);

        Book forest = new Book("Лес", pushkin, 1946);

        Book gahrenheit = new Book("Фаренгейт", bradferry, 1924);

        System.out.println();

        if (bradberry != null) {
            System.out.println("Имя автора: " + bradberry.getName() + " Фамилия автора: " + bradberry.getSurname());
        }


        System.out.println();

        if (pushkin != null) {
            System.out.println("Имя автора: " + pushkin.getName() + " Фамилия автора: " + pushkin.getSurname());
            {
                System.out.println();

                System.out.println("Название книги: " + forest.getBookName() + " Год издания книги: " + forest.getYearOfCreate() + " Автор книги: " + forest.getAuthor().getName() + " " + forest.getAuthor().getSurname());

                System.out.println();

                System.out.println("Название книги: " + fahrenheit.getBookName() + " Год издания книги: " + fahrenheit.getYearOfCreate() + " Автор книги: " + fahrenheit.getAuthor().getName() + " " + fahrenheit.getAuthor().getSurname());

                System.out.println();

                fahrenheit.setYearOfCreate(1965);
                System.out.println("Актуальный год публикации книги " + fahrenheit.getBookName() + " = " + fahrenheit.getYearOfCreate());

                System.out.println();

                System.out.println(bradberry);

                System.out.println();

                System.out.println(fahrenheit);

                // Проверка на равенство между авторами

                System.out.println(bradberry.equals(bradberry));
                System.out.println(bradberry.equals(bradferry));
                System.out.println(bradberry.equals(pushkin));

                System.out.println();

                // Проверка на равенство между книгами

                System.out.println(fahrenheit.equals(fahrenheit));
                System.out.println(fahrenheit.equals(gahrenheit));
                System.out.println(fahrenheit.equals(forest));

                System.out.println();

                // Выполнение Хэш кодов

                System.out.println(fahrenheit.hashCode() == gahrenheit.hashCode());
                System.out.println(fahrenheit.equals(gahrenheit));

            }
        }

    }

}

