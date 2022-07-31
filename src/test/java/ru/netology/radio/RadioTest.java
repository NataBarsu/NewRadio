package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStationInBetween () {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected =5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNegativeRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected =0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMoreThenNineRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected =0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected =0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFirstRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected =1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected =0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected =9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected =1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.reduceVolume();
        int expected =2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

