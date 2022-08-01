package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {

        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;

    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume > 10) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        currentVolume = newVolume;
    }


    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation=0;
        }
    }

    public void prevStation() {
        if (currentStation >0) {
            currentStation--;
        } else {
            currentStation=9;
        }
    }



    public void increaseVolume() {
        int increaseVolume;
        if (currentVolume < 10) {
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


