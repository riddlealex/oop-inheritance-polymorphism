package cosmos.task;

public class SpaceRunner {

    public static void main(String[] args) {

        Satellite moon = new Satellite("Луна", 4, 5, 20);
        System.out.println("Диаметр: " + moon.diameter());

        Planet earth = new Planet("Земля", 3, 20, 400, 23, moon);
        System.out.println(earth.isInhabited());

        Star sun = new Star("Солнце", 10, 1000, 300, 2000);

        Asteroid asta = new Asteroid("Аста", 2, 1, 500);
        System.out.println(asta.density());

        BlackHole phoenix = new BlackHole("Феникс", 20, 100000, 500);
        System.out.println(phoenix.compareMass(sun));
        System.out.println(earth.isCollapsedByBlackHole(phoenix));

        System.out.println(sun.getName() + " звезда ли? " + SpaceUtils.isStar(sun));
        SpaceUtils.gravitationForce(phoenix,asta);
        SpaceUtils.isIlluminates(earth, sun);
        SpaceUtils.chanceOfCollision(moon,asta);


    }
}
