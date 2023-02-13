public class Main {
    public static void main(String[] args) {
        String countryOfOrigin = "Japan";
        int yearOfIssue = 2023;
        Transport myTransport = new Transport(yearOfIssue, countryOfOrigin);
        myTransport.setMark("Toyota");
        myTransport.setModel("Camry");

        System.out.println("Transport:");
        System.out.println("Mark: " + myTransport.getMark());
        System.out.println("Model: " + myTransport.getModel());
        System.out.println("Year of Issue: " + myTransport.getYearOfIssue());
        System.out.println("Country of Origin: " + myTransport.getCountryOfOrigin());

        System.out.println();

        Car myCar = new Car();
        myCar.setMark("Tesla");
        myCar.setModel("Model S");
        myCar.setEngineVolume(3.0);
        myCar.setRegistrationNumber("ABC123");
        myCar.setNumberOfSeats(5);
        myCar.setTireType("Summer");

        System.out.println("Car:");
        System.out.println("Mark: " + myCar.getMark());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year of Issue: " + myCar.getYearOfIssue());
        System.out.println("Country of Origin: " + myCar.getCountryOfOrigin());
        System.out.println("Registration Number: " + myCar.getRegistrationNumber());
        System.out.println("Number of Seats: " + myCar.getNumberOfSeats());
        System.out.println("Tire Type: " + myCar.getTireType());

        Bus bus1 = new Bus();
        bus1.setMark("Volvo");
        bus1.setModel("B7R");
        bus1.setSeats(40);
        bus1.setRegistrationNumber("B7R 123");
        bus1.setTireSign("Winter");

        System.out.println("Bus Details:");
        System.out.println("Mark: " + bus1.getMark());
        System.out.println("Model: " + bus1.getModel());
        System.out.println("Number of Seats: " + bus1.getSeats());
        System.out.println("Registration Number: " + bus1.getRegistrationNumber());
        System.out.println("Tire Sign: " + bus1.getTireSign());
    }
}
