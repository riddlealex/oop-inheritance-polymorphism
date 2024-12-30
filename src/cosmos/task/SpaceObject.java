package cosmos.task;

public abstract class SpaceObject implements SpaceService{

    private String name;
    private int distance; // all the objects will be in one dimensional space, like: -2 -1 0 1 2
    private int mass;
    private int speed;

    public SpaceObject(String name, int distance, int mass, int speed) {
        this.name = name;
        this.distance = distance;
        this.mass = mass;
        this.speed = speed;
    }

    @Override
    public double diameter() {
        return (double) getMass() / getSpeed();
    }

    @Override
    public String compareMass(SpaceObject object) {
        if (getMass() > object.getMass()) {
            return "Масса " + getName() + " больше, чем масса " + object.getName();
        } else if (getMass() < object.getMass()) {
            return "Масса " + getName() + " меньше, чем масса " + object.getName();
        } else {
            return "Масса " + getName() + " равна массе " + object.getName();
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public int getMass() {
        return mass;
    }

    public int getSpeed() {
        return speed;
    }
}
