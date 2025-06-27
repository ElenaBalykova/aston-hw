public class Park {
    public class Attraction {
        private String attractionTitle;
        private String attractionOpenTime;
        private double attractionCost;

        public Attraction(String attractionTitle, String attractionOpenTime, double attractionCost) {
            this.attractionTitle = attractionTitle;
            this.attractionOpenTime = attractionOpenTime;
            this.attractionCost = attractionCost;
        }

        public String getAttractionTitle() {
            return attractionTitle;
        }

        public String getAttractionOpenTime() {
            return attractionOpenTime;
        }

        public double getAttractionCost() {
            return attractionCost;
        }

    }

    public static void main(String[] args) {
        Park ski = new Park();

        Park.Attraction coldSki = ski.new Attraction("Funicular", "9:00 - 22:00", 15.5);

        System.out.println(coldSki.getAttractionTitle());
        System.out.println(coldSki.getAttractionOpenTime());
        System.out.println(coldSki.getAttractionCost());
    }
}
