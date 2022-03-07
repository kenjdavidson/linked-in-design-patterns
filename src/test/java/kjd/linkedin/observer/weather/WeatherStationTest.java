package kjd.linkedin.observer.weather;

import java.io.IOException;

import org.junit.Test;

import kjd.linkedin.observer.client.AlertSystem;
import kjd.linkedin.observer.client.Logger;
import kjd.linkedin.observer.client.UserInterface;

public class WeatherStationTest {
    @Test
    public void testWeatherStation() {
        try (AlertSystem alerts = new AlertSystem();
                Logger logger = new Logger();
                UserInterface ui = new UserInterface()) {            
            WeatherStation.INSTANCE.setWeather(new Weather(15.0, 14.0, 40.0));
            WeatherStation.INSTANCE.setWeather(new Weather(-30.0, 14.0, 40.0));
        } catch (IOException e) {
            // Ignore
        } 
        
    }
}
