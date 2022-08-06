package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurrentRadioStationLessThenMax () {
        Radio radio = new Radio(15);
        radio.setCurrentStation(13);
        Assertions.assertEquals(13, radio.getCurrentStation());
        Assertions.assertEquals(15, radio.getAmount());

    }

    @Test
    public void shouldSetCurrentRadioStationMoreThenMax () {
        Radio radio = new Radio(15);
        radio.setCurrentStation(15);
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(15, radio.getAmount());


    }

    @Test
    public void shouldSetCurrentRadioStationLessThenMaxDefault () {
        Radio radio = new Radio(10);
        radio.setCurrentStation(6);
        Assertions.assertEquals(6, radio.getCurrentStation());
        Assertions.assertEquals(10, radio.getAmount());

    }

    @Test
    public void shouldSetCurrentRadioStationLessThenMaxSecondCase () {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        Assertions.assertEquals(6, radio.getCurrentStation());
        Assertions.assertEquals(10, radio.getAmount());

    }

    @Test
    public void shouldSetCurrentRadioStationMoreThenMaxSecondCase () {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(10, radio.getAmount());

    }

    @Test
    public void shouldSetNegativeRadioStationS () {
        Radio radio = new Radio(15);
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(15, radio.getAmount());

    }

    @Test
    public void shouldSetNegativeRadioStationSecondCase () {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(10, radio.getAmount());

    }

    @Test
    public void shouldSetNextMoreThenMaxStation() {
        Radio radio = new Radio(18);
        radio.setCurrentStation(17);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(18, radio.getAmount());

    }

    @Test
    public void shouldSetNextStationAfterEightLessThenMaxStation() {
        Radio radio = new Radio(18);
        radio.setCurrentStation(8);
        radio.nextStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
        Assertions.assertEquals(18, radio.getAmount());

    }

    @Test
    public void shouldSetNextStationAfterZeroStation() {
        Radio radio = new Radio(18);
        radio.setCurrentStation(0);
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());
        Assertions.assertEquals(18, radio.getAmount());

    }

    @Test
    public void shouldSetNextStationAfterFirstStation() {
        Radio radio = new Radio(18);
        radio.setCurrentStation(1);
        radio.nextStation();
        Assertions.assertEquals(2, radio.getCurrentStation());
        Assertions.assertEquals(18, radio.getAmount());

    }

    @Test
    public void shouldSetNextStationAfterInBetween() {
        Radio radio = new Radio(18);
        radio.setCurrentStation(5);
        radio.nextStation();
        Assertions.assertEquals(6, radio.getCurrentStation());
        Assertions.assertEquals(18, radio.getAmount());

    }


    @Test
    public void shouldSetNextMoreThenMaxStationSecondCase() {
        Radio radio = new Radio ();
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(10, radio.getAmount());


    }


    @Test
    public void shouldSetNextStationAfterZeroStationSecondCase() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());
        Assertions.assertEquals(10, radio.getAmount());

    }

    @Test
    public void shouldSetNextStationAfterFirstStationSecondCase() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.nextStation();
        Assertions.assertEquals(2, radio.getCurrentStation());
        Assertions.assertEquals(10, radio.getAmount());

    }

    @Test
    public void shouldSetNextStationAfterInBetweenSecondCase() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        Assertions.assertEquals(6, radio.getCurrentStation());
        Assertions.assertEquals(10, radio.getAmount());

    }


    @Test
    public void shouldSetPrevStationAfterZero() {
        Radio radio = new Radio(18);
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(17, radio.getCurrentStation());
        Assertions.assertEquals(18, radio.getAmount());

    }

    @Test
    public void shouldSetPrevStationInBetween() {
        Radio radio = new Radio(18);
        radio.setCurrentStation(3);
        radio.prevStation();
        Assertions.assertEquals(2, radio.getCurrentStation());
        Assertions.assertEquals(18, radio.getAmount());

    }

    @Test
    public void shouldSetPrevStationBeforeMax() {
        Radio radio = new Radio(18);
        radio.setCurrentStation(17);
        radio.prevStation();
        Assertions.assertEquals(16, radio.getCurrentStation());
        Assertions.assertEquals(18, radio.getAmount());

    }


    @Test
    public void shouldSetPrevStationAfterOne() {
        Radio radio = new Radio(18);
        radio.setCurrentStation(1);
        radio.prevStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(18, radio.getAmount());

    }

    @Test
    public void shouldSetPrevStationAfterZeroSecondCase() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
        Assertions.assertEquals(10, radio.getAmount());

    }

    @Test
    public void shouldSetPrevStationInBetweenSecondCase() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.prevStation();
        Assertions.assertEquals(2, radio.getCurrentStation());
        Assertions.assertEquals(10, radio.getAmount());

    }

    @Test
    public void shouldSetPrevStationBeforeMaxSecondCase() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prevStation();
        Assertions.assertEquals(7, radio.getCurrentStation());
        Assertions.assertEquals(10, radio.getAmount());

    }

    @Test
    public void shouldSetCurrentVolumeInBetween() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        Assertions.assertEquals(5, radio.getCurrentVolume ());
    }

    @Test
    public void shouldSetNegativeCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume ());
    }

    @Test
    public void shouldSetZeroCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        Assertions.assertEquals(0, radio.getCurrentVolume ());
    }

    @Test
    public void shouldSetFirstCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        Assertions.assertEquals(1, radio.getCurrentVolume ());
    }

    @Test
    public void shouldSetCurrentVolumeAfter100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume ());
    }

    @Test
    public void shouldSetCurrentVolumeBefore100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        Assertions.assertEquals(99, radio.getCurrentVolume ());
    }

    @Test
    public void shouldSetCurrentVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume ());
    }
    @Test
    public void shouldSetIncreaseVolumeAfterZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume ());
    }


    @Test
    public void shouldSetIncreaseVolumeAfterInBetween() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        Assertions.assertEquals(6, radio.getCurrentVolume ());
    }

    @Test
    public void shouldSetIncreaseVolumeAfter100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume ());
    }

    @Test
    public void shouldSetIncreaseVolumeAfter99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume ());
    }


    @Test
    public void shouldSetReduceVolumeInBetween() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.reduceVolume();
        Assertions.assertEquals(2, radio.getCurrentVolume ());
    }

    @Test
    public void shouldSetReduceVolumeAfterZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume ());
    }
    @Test
    public void shouldSetReduceVolumeAfterOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume ());
    }

    @Test
    public void shouldSetReduceVolumeAfter100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume ());
    }

    @Test
    public void shouldSetReduceVolumeAfter99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume ());
    }
}
