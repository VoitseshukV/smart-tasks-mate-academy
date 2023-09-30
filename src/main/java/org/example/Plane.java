package org.example;

public class Plane {
    private int length;
    private int nubmerOfSeats;
    private int enginesCount;
    private int tanksVolume;
    private int weight;

    private Plane(PlaneBuilder builder) {
        this.length = builder.length;
        this.nubmerOfSeats = builder.nubmerOfSeats;
        this.enginesCount = builder.enginesCount;
        this.tanksVolume = builder.tanksVolume;
        this.weight = builder.weight;
    }

    public static class PlaneBuilder {
        private int length;
        private int nubmerOfSeats;
        private int enginesCount;
        private int tanksVolume;
        private int weight;

        public PlaneBuilder() {}

        public PlaneBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setNubmerOfSeats(int nubmerOfSeats) {
            this.nubmerOfSeats = nubmerOfSeats;
            return this;
        }

        public PlaneBuilder setEnginesCount(int enginesCount) {
            this.enginesCount = enginesCount;
            return this;
        }

        public PlaneBuilder setTanksVolume(int tanksVolume) {
            this.tanksVolume = tanksVolume;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public int getLength() {
            return length;
        }

        public int getNubmerOfSeats() {
            return nubmerOfSeats;
        }

        public int getEnginesCount() {
            return enginesCount;
        }

        public int getTanksVolume() {
            return tanksVolume;
        }

        public int getWeight() {
            return weight;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
