import java.io.*;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) throws IOException {
        Timer timer = new Timer(); //создаём объект класса Timer
        ProcessBuilder prok = new ProcessBuilder("notepad.exe"); // создаем процесс который будем выполнять
        for (int i = 0; i<11; i++){
            timer.schedule(new TimerTask() { // создаем таймер
                @Override      // переопределяем метод
                public void run() {
                    try {
                        prok.start();   // запускаем процесс
                    } catch (IOException e){
                        throw new RuntimeException(e);
                    }
                }
            }, i * 2000); // запускаем чере 2 секунды
        }
    }
}