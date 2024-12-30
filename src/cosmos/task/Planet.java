package cosmos.task;

import java.util.concurrent.ThreadLocalRandom;

public class Planet extends SpaceObject implements DensityOfSpaceObject, BlackHoleCheck, PlanetInhabited{

    private double co2;
    private Satellite satellite;


    public Planet(String name, int distance, int mass, int speed, double co2) {
        super(name, distance, mass, speed);
        this.co2 = ThreadLocalRandom.current().nextDouble(0, 50);
    }
    public Planet(String name, int distance, int mass, int speed, double co2, Satellite satellite) {
        super(name, distance, mass, speed);
        this.co2 = ThreadLocalRandom.current().nextDouble(0, 50);
        this.satellite = satellite;
    }

    @Override
    public boolean isCollapsedByBlackHole(BlackHole blackHole) {
        return Math.abs(getDistance() - blackHole.getDistance()) < 2;
    }

    @Override
    public double density() {
        return getMass() / 100.0;
    }

    @Override
    public String toString() {
        return "Planet{" + getName() +
                isInhabited();
    }

    @Override
    public String isInhabited() {
        return "Шанс того, что на планете есть жизнь: " + co2*2 + "%";
    }
}
