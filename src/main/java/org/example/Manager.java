package org.example;
public class Manager {
    private String[] films = new String[0];
    private String title;
    private int numberFilms = 10;

    public void save(String title) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = title;
        films = tmp;
    }
    public String[] getFilms() {
        return films;
    }

    public Manager() {

    }
    public Manager(int numberFilms) {
        this.numberFilms = numberFilms;
    }
    public String[] findAll() {
        String[] all = getFilms();
        String[] reversed = new String[numberFilms];
        for (int i = 0; i <= numberFilms - 1; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return films = reversed;
    }
}
