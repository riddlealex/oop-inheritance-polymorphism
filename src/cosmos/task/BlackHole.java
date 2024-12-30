package cosmos.task;

public class BlackHole extends SpaceObject implements DensityOfSpaceObject, BlackHoleCheck{

    public BlackHole(String name, int distance, int mass, int speed) {
        super(name, distance, mass, speed);
    }

    @Override
    public boolean isCollapsedByBlackHole(BlackHole blackHole) {
        return Math.abs(getDistance() - blackHole.getDistance()) < 20;
    }

    @Override
    public double density() {
        return getMass() / 1000.0;
    }

    @Override
    public String toString() {
        return "BlackHole: " + getName();
    }
}
