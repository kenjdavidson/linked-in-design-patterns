package kjd.linkedin.observer.weather;

import kjd.linkedin.observer.Observable;
import kjd.linkedin.observer.Observer;
import kjd.linkedin.observer.Subject;

public class WeatherStation implements Observable<Weather> {
    public static final WeatherStation INSTANCE = new WeatherStation();

    private WeatherStation() {
        // Singleton
    }

    private Subject<Weather> observers = new Subject<>();
    private Weather weather;
    
    public void setWeather(Weather weather) {
        this.weather = weather;
        observers.notifyObservers(weather);
    }

    public Weather getWeather() {
        return weather;
    }

    @Override
    public boolean registerObserver(Observer<Weather> observer) {
        return observers.registerObserver(observer);
    }

    @Override
    public boolean removeObserver(Observer<Weather> observer) {
        return observers.removeObserver(observer);
    }
}
