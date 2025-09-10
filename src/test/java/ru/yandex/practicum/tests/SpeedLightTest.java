package ru.yandex.practicum.tests;

import org.junit.Test;
import ru.yandex.practicum.SpeedLight;

import static org.junit.Assert.assertEquals;

public class SpeedLightTest {

    @Test
    public void checkLightGreen() {
        checkLight("green", 50);
    }

    @Test
    public void checkLightYellow() {
        checkLight("yellow", 70);
    }

    @Test
    public void checkLightRed() {
        checkLight("red", 90);
    }


    private static void checkLight(String expectedLight, int currentSpeed) {
        SpeedLight speedLight = new SpeedLight();
        assertEquals(expectedLight, speedLight.showLight(currentSpeed));
    }
}
