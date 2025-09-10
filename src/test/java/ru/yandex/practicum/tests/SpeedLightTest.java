package ru.yandex.practicum.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.practicum.SpeedLight;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SpeedLightTest {

    private final String expectedColour;
    private final int speed;

    public SpeedLightTest(String expectedColour, int speed) {
        this.expectedColour = expectedColour;
        this.speed = speed;
    }

    @Parameterized.Parameters(name = "expected Light = {0}, speed = {1}")
    public static Object[] data() {
        return new Object[][]{
                {"green", 50},
                {"red", 90},
                {"yellow", 70},
        };
    }
    @Test
    public void checkLight() {
        SpeedLight speedLight = new SpeedLight();
        assertEquals(expectedColour, speedLight.showLight(speed));
    }
}
