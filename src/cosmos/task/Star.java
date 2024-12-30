package cosmos.task;

public class Star extends SpaceObject implements DensityOfSpaceObject, BlackHoleCheck, SpaceService{

    private int luminosity;


    public Star(String name, int distance, int mass, int speed, int luminosity) {
        super(name, distance, mass, speed);
        this.luminosity = luminosity;
    }

    public int getLuminosity() {
        return luminosity;
    }

    @Override
    public boolean isCollapsedByBlackHole(BlackHole blackHole) {
        return Math.abs(getDistance() - blackHole.getDistance()) < 4;
    }

    @Override
    public double density() {
        return getMass() / 10.0;
    }

    @Override
    public String toString() {
        return "Star{" + getName() +
                ", luminosity=" + luminosity +
                '}';
    }
}
