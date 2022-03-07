package kjd.linkedin.observer.client;

import java.io.Closeable;
import java.io.IOException;

import kjd.linkedin.observer.Observer;
import kjd.linkedin.observer.weather.Weather;
import kjd.linkedin.observer.weather.WeatherStation;

public class Logger implements Observer<Weather>, Closeable {
    public Logger() {
        WeatherStation.INSTANCE.registerObserver(this);
    }

    public void log(Weather weather) {
        System.out.println("Logging: " + weather.toString());
    }

    @Override
    public void close() throws IOException {
        WeatherStation.INSTANCE.registerObserver(this);
    }

    @Override
    public void observed(Weather observed) {
        log(observed);
    }
}
