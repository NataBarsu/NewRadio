package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int amount =10;



    public Radio (int amount) {
        this.amount = amount;

    }

    public Radio () {

    }


    public int getCurrentStation() {

        return currentStation;
    }



    public int getAmount() {

        return amount;
    }


    public int getCurrentVolume() {

        return currentVolume;
    }
    public void setCurrentStation(int newCurrentStation) {
        int maxStation = amount -1;
        if (newCurrentStation >(maxStation)) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;

    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        currentVolume = newVolume;
    }


    public void nextStation() {
        int maxStation = amount -1;
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation=0;
        }
    }

    public void prevStation() {
        int maxStation = amount -1;
        if (currentStation >0) {
            currentStation--;
        } else {
            currentStation=maxStation;
        }
    }



    public void increaseVolume() {
        int increaseVolume;
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        int reduceVolume;
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}



