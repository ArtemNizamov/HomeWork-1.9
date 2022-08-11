public class Main {

    public static void main(String[] args) {
        Author bradberry = new Author("Рей", "Бредберри");
        Author pushkin = new Author("Александр", "Пушкин");

        Book fahrenheit = new Book("Фаренгейт", bradberry, 1976);

        Book forest = new Book("Лес", pushkin, 1946);

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


            }
        }

    }

}