package kjd.linkedin.observer.client;

import java.io.Closeable;
import java.io.IOException;
import java.text.MessageFormat;

import kjd.linkedin.observer.Observer;
import kjd.linkedin.observer.weather.Weather;
import kjd.linkedin.observer.weather.WeatherStation;

public class AlertSystem implements Observer<Weather>, Closeable {
    public AlertSystem() {
        WeatherStation.INSTANCE.registerObserver(this);
    }

    public void alert(Weather weather) {
        if (weather.windSpeed > 100) {
            System.out.println(MessageFormat.format("Weather alert: Wind Speed {0}", weather.windSpeed));
        }        

        if (weather.temperature < -10) {
            System.out.println(MessageFormat.format("Weather alert: Temperature {0}", weather.temperature));
        }

        if (weather.pressure > 50) {
            System.out.println("Weather alert: Tornado warning");
        }
    }

    @Override
    public void close() throws IOException {
        WeatherStation.INSTANCE.registerObserver(this);
    }

    @Override
    public void observed(Weather observed) {
        alert(observed);
    }
}
