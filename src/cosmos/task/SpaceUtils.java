package cosmos.task;

import java.util.concurrent.ThreadLocalRandom;

public final class SpaceUtils {

    private SpaceUtils() {
    }

    public static void gravitationForce(SpaceObject so1, SpaceObject so2) {
        System.out.println("Сила гравитационных сил между " + so1.getName() + " и " + so2.getName() + " равна: " +
                Math.abs(so1.getDistance() - so2.getDistance()) * 100);
    }

    public static boolean isStar(SpaceObject spaceObject) {
        return spaceObject instanceof Star;
    }

    public static void isIlluminates(SpaceObject spaceObject, Star star) {
        System.out.println(star.getName() + " освещает ли " + spaceObject.getName() + ": "
        + (Math.abs(spaceObject.getDistance() - star.getDistance()) * star.getLuminosity() > 100));

    }

    public static void chanceOfCollision(SpaceObject object, Asteroid asteroid) {
        double distance = Math.abs(object.getDistance() - asteroid.getDistance());
        double generalSpeed = (double) (object.getSpeed() + asteroid.getSpeed()) / 2;
        double chance;
        if (distance < 2) {
            if (generalSpeed < 10) {
                chance = ThreadLocalRandom.current().nextDouble(distance * generalSpeed, 100);
            } else {
                chance = ThreadLocalRandom.current().nextDouble(0, 50);
            }
        } else {
            chance = ThreadLocalRandom.current().nextDouble(0, generalSpeed);
        }
        System.out.println("Шанс столкновения " + object.getName() + " и " + asteroid.getName() + " равняется: " +
                chance + "%");
    }


}
