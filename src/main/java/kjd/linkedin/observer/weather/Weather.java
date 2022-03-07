package kjd.linkedin.observer.weather;

public class Weather {
    public final Double temperature;
    public final Double windSpeed;
    public final Double pressure;

    public Weather(Double t, Double ws, Double p) {
        this.temperature = t;
        this.windSpeed = ws;
        this.pressure = p;
    }
}
