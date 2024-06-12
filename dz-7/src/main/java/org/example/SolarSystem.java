package org.example;

    public enum SolarSystem {
        MERCURY(0, 1, null),
        VENUS(50, 2, MERCURY),
        EARTH(40, 3, VENUS),
        MARS(60, 2, EARTH),
        JUPITER(200, 7, MARS),
        SATURN(300, 6, JUPITER),
        URANUS(400, 5, SATURN),
        NEPTUNE(450, 5, URANUS);

        private final int orderFromSun;
        private final int distanceFromPrevious;
        private final int distanceFromSun;
        private final int radius;
        private final SolarSystem previousPlanet;
        private SolarSystem nextPlanet;

        static {
            for (SolarSystem planet : SolarSystem.values()) {
                if (planet.previousPlanet != null) {
                    planet.previousPlanet.nextPlanet = planet;
                }
            }
        }

        SolarSystem(int distanceFromPrevious, int radius, SolarSystem previousPlanet) {
            this.orderFromSun = previousPlanet == null ? 1 : previousPlanet.orderFromSun + 1;
            this.distanceFromPrevious = distanceFromPrevious;
            this.radius = radius;
            this.previousPlanet = previousPlanet;
            this.distanceFromSun = previousPlanet == null ? 0 : previousPlanet.distanceFromSun + distanceFromPrevious;
        }

        public int getOrderFromSun() {
            return orderFromSun;
        }

        public int getDistanceFromPrevious() {
            return distanceFromPrevious;
        }

        public int getDistanceFromSun() {
            return distanceFromSun;
        }

        public int getRadius() {
            return radius;
        }

        public SolarSystem getPreviousPlanet() {
            return previousPlanet;
        }

        public SolarSystem getNextPlanet() {
            return nextPlanet;
        }
    }
