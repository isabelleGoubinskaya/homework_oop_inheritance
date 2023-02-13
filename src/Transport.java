public class Transport {
    private String mark;
    private String model;
    private final int yearOfIssue;
    private String countryOfOrigin;
    private String bodyColor;
    private int maxSpeed;

    public Transport(String mark, String model, int yearOfIssue, String countryOfOrigin, String bodyColor, int maxSpeed) {
        this.mark = mark;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.countryOfOrigin = "Japan";
        this.countryOfOrigin = countryOfOrigin;
        setBodyColor(bodyColor);
        setMaxSpeed(maxSpeed);
    }

    public Transport(int yearOfIssue, String countryOfOrigin) {

        this.yearOfIssue = yearOfIssue;
        this.countryOfOrigin = "Japan";
        this.countryOfOrigin = countryOfOrigin;
    }

    public Transport() {

        yearOfIssue = 2023;
        countryOfOrigin = "Japan";
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null || bodyColor.trim().isEmpty()) {
            throw new IllegalArgumentException("Body color cannot be null or empty.");
        }
        this.bodyColor = bodyColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            throw new IllegalArgumentException("Max speed must be a positive value.");
        }
        this.maxSpeed = maxSpeed;
    }
}
