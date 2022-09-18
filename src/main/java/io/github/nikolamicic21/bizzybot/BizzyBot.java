package io.github.nikolamicic21.bizzybot;

import java.awt.*;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class BizzyBot {

    public static void main(String[] args) throws AWTException, NoSuchAlgorithmException {
        final var width = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth();
        final var height = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight();
        final var dpi = ((double) Toolkit.getDefaultToolkit().getScreenResolution()) / 100;
        final var random = SecureRandom.getInstanceStrong();

        final var robot = new Robot();
        while (true) {
            robot.mouseMove((int) (random.nextInt(width) / dpi), (int) (random.nextInt(height) / dpi));
            robot.delay(10_000);
        }
    }
}
