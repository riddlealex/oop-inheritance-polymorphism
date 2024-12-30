package cosmos.task;

public class Asteroid extends SpaceObject implements  DensityOfSpaceObject, BlackHoleCheck{

    public Asteroid(String name, int distance, int mass, int speed) {
        super(name, distance, mass, speed);
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
        return "Asteroid{}" + getName();
    }
}
