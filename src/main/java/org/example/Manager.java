package org.example;

public class Manager {
    private String[] films = new String[0];
    private String title;
    private int limit = 10;

    public Manager() {
        this.limit = 10;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

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

    public String[] findAll() {
        String[] all = getFilms();
        String[] reversed = new String[all.length];
        for (int i = 0; i <= all.length - 1; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public String[] findLast() {
        String[] all = getFilms();
        int resultlength;
        if (films.length < limit) {
            resultlength = films.length;
        } else {
            resultlength = limit;
        }
        String[] reversed = new String[resultlength];
        for (int i = 0; i < resultlength; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }
}