package org.example;

public class SolarSystemTest {
    public static void main(String[] args) {
        SolarSystem planet = SolarSystem.EARTH;

        switch (planet) {
            case MERCURY:
                printPlanetInfo(planet);
                break;
            case VENUS:
                printPlanetInfo(planet);
                break;
            case EARTH:
                printPlanetInfo(planet);
                break;
            case MARS:
                printPlanetInfo(planet);
                break;
            case JUPITER:
                printPlanetInfo(planet);
                break;
            case SATURN:
                printPlanetInfo(planet);
                break;
            case URANUS:
                printPlanetInfo(planet);
                break;
            case NEPTUNE:
                printPlanetInfo(planet);
                break;
            default:
                System.out.println("Unknown planet.");
                break;
        }
    }

    private static void printPlanetInfo(SolarSystem planet) {
        System.out.println("Planet: " + planet);
        System.out.println("Order from Sun: " + planet.getOrderFromSun());
        System.out.println("Distance from Previous Planet: " + planet.getDistanceFromPrevious());
        System.out.println("Distance from Sun: " + planet.getDistanceFromSun());
        System.out.println("Radius: " + planet.getRadius());
        System.out.println("Previous Planet: " + (planet.getPreviousPlanet() != null ? planet.getPreviousPlanet() : "None"));
        System.out.println("Next Planet: " + (planet.getNextPlanet() != null ? planet.getNextPlanet() : "None"));
        System.out.println();
    }
}

