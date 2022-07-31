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
        int nextStation;
        if (currentStation < 10) {
            if (currentStation == 9) {
                currentStation = 0;
            } else {
                currentStation++;
            }
        }
        nextStation = currentStation;
        setCurrentStation(nextStation);
    }

    public void prevStation() {
        int prevStation;
        if (currentStation < 10) {
            if (currentStation == 0) {
                currentStation = 9;
            } else {
                currentStation--;
            }
        }
        prevStation = currentStation;
        setCurrentStation(prevStation);
    }



    public void increaseVolume() {
        int increaseVolume;
        if (currentVolume < 10) {
            currentVolume++;
        }
        increaseVolume = currentVolume;
        setCurrentVolume(increaseVolume);
    }

    public void reduceVolume() {
        int reduceVolume;
        if (currentVolume < 10) {
            currentVolume--;
        }
        reduceVolume = currentVolume;
        setCurrentVolume(reduceVolume);
    }

}


