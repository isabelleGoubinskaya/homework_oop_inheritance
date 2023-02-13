public class Car extends Transport {
    private static final int yearOfIssue = 2023;
    private static final String countryOfOrigin = "Japan";
    private double engineVolume;
    private String registrationNumber;
    private int numberOfSeats;
    private String tireType;

    public Car(String mark, String model, int yearOfIssue, String countryOfOrigin, String bodyColor, int maxSpeed,
               double engineVolume, String registrationNumber, int numberOfSeats, String tireType) {
        super(mark, model, yearOfIssue, countryOfOrigin, bodyColor, maxSpeed);
        this.engineVolume = engineVolume;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.tireType = tireType;
    }

    public Car() {
        super(yearOfIssue, countryOfOrigin);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }
}
