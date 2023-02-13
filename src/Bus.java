public class Bus extends Transport {
    private int seats;
    private String registrationNumber;
    private String tireSign;

    public Bus(String mark, String model, int yearOfIssue, String countryOfOrigin, String bodyColor, int maxSpeed) {
        super(mark, model, yearOfIssue, countryOfOrigin, bodyColor, maxSpeed);
    }

    public Bus() {
        super();
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTireSign() {
        return tireSign;
    }

    public void setTireSign(String tireSign) {
        this.tireSign = tireSign;
    }
}
