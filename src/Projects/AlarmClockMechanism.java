package Projects;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.FilePermission;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClockMechanism implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClockMechanism(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        System.out.println("🚀 AlarmClockMechanism thread started...");
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
        System.out.println("\nAlarm Noises");
        playSound(filePath);
    }

    private void playSound(String filePath) {

        File audioFile = new File(filePath);
        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("Press Enter to stop the Alarm");
            scanner.nextLine();
            clip.stop();
            scanner.close();
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio File is not supported.");
        } catch (LineUnavailableException e) {
            System.out.println("Audio is unavailable");
        } catch (IOException e) {
            System.out.println("Error reading audio file.");
        }

    }
}
