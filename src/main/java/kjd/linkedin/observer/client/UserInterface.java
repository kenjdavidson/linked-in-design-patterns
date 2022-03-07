package kjd.linkedin.observer.client;

import java.io.Closeable;
import java.io.IOException;
import java.text.MessageFormat;

import kjd.linkedin.observer.Observer;
import kjd.linkedin.observer.weather.Weather;
import kjd.linkedin.observer.weather.WeatherStation;

public class UserInterface implements Observer<Weather>, Closeable {
    public UserInterface() {
        WeatherStation.INSTANCE.registerObserver(this);
    }

    public void display(Weather weather) {
        System.out.println(MessageFormat.format("Temp: {0}\nWind Speed: {1}\nPressure: {2}", weather.temperature, weather.windSpeed, weather.pressure));
    }

    @Override
    public void observed(Weather observed) {
        display(observed);
    }

    @Override
    public void close() throws IOException {
        WeatherStation.INSTANCE.removeObserver(this);
    }
}
