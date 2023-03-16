import org.example.Manager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    String title1 = "Бладшот";
    String title2 = "Вперёд";
    String title3 = "Отель 'Белград'";
    String title4 = "Джентельмены";
    String title5 = "Челове-невидимка";
    String title6 = "Тролли. Мировой тур";
    String title7 = "Номер один";
    String title8 = "Виновный";
    String title9 = "Любовь и монстры";
    String title10 = "Морбиус";
    String title11 = "Парни со стволами";
    String title12 = "Призрачная шестёрка";
    Manager man = new Manager();

    @Test
    public void AddFilm() {
        man.save(title1);
        man.save(title2);
        man.save(title3);
        man.save(title4);
        man.save(title5);
        man.save(title6);
        man.save(title7);
        man.save(title8);
        man.save(title9);
        man.save(title10);
        man.save(title11);
        man.save(title12);


        String[] expected = {title1, title2, title3, title4, title5, title6, title7, title8, title9, title10, title11, title12};
        String[] actual = man.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reversedFilms() {
        man.save(title1);
        man.save(title2);
        man.save(title3);
        man.save(title4);
        man.save(title5);
        man.save(title6);
        man.save(title7);
        man.save(title8);
        man.save(title9);
        man.save(title10);
        man.save(title11);
        man.save(title12);

        man.findAll();

        String[] expected = {title12, title11, title10, title9, title8, title7, title6, title5, title4, title3, title2, title1};
        String[] actual = man.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reverserFilmsTen() {
        man.save(title1);
        man.save(title2);
        man.save(title3);
        man.save(title4);
        man.save(title5);
        man.save(title6);
        man.save(title7);
        man.save(title8);
        man.save(title9);
        man.save(title10);
        man.save(title11);
        man.save(title12);

        man.findLast();

        String[] expected = {title12, title11, title10, title9, title8, title7, title6, title5, title4, title3};
        String[] actual = man.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reverserFilmsFive() {
        Manager man = new Manager(5);
        man.save(title1);
        man.save(title2);
        man.save(title3);
        man.save(title4);
        man.save(title5);
        man.save(title6);
        man.save(title7);
        man.save(title8);
        man.save(title9);
        man.save(title10);
        man.save(title11);
        man.save(title12);

        man.findLast();

        String[] expected = {title12, title11, title10, title9, title8};
        String[] actual = man.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }
}
