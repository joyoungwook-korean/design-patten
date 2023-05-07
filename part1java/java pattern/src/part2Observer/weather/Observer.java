package part2Observer.weather;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
