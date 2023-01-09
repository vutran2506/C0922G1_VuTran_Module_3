package mvc_furama.model.Facikity;

public class Facility {
    private  int id;
    private String name;
    private int area;
    private  double cost;
    private  int maxPeople;
    private  int rentTypeIds;
    private int facilityTypeIds;
    private RentType rentTypeId;
    private FacilityType facilityTypeId;
    private String standardRoom;
    private String description;
    private double poolArea;
    private int numberOFloor;
    private String facilityFree;

    public Facility() {
    }

    public Facility(int id, String name, int area, double cost, int maxPeople, RentType rentTypeId, FacilityType facilityTypeId, String standardRoom, String description, double poolArea, int numberOFloor, String facilityFree) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentTypeId = rentTypeId;
        this.facilityTypeId = facilityTypeId;
        this.standardRoom = standardRoom;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOFloor = numberOFloor;
        this.facilityFree = facilityFree;
    }

    public Facility(int id, String name, int area, double cost, int maxPeople, int rentTypeIds, int facilityTypeIds, String standardRoom, String description, double poolArea, int numberOFloor, String facilityFree) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentTypeIds = rentTypeIds;
        this.facilityTypeIds = facilityTypeIds;
        this.standardRoom = standardRoom;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOFloor = numberOFloor;
        this.facilityFree = facilityFree;
    }

    public Facility(String name, int area, double cost, int maxPeople, int rentTypeIds, int facilityTypeIds, String standardRoom, String description, double poolArea, int numberOFloor, String facilityFree) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentTypeIds = rentTypeIds;
        this.facilityTypeIds = facilityTypeIds;
        this.standardRoom = standardRoom;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOFloor = numberOFloor;
        this.facilityFree = facilityFree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getRentTypeIds() {
        return rentTypeIds;
    }

    public void setRentTypeIds(int rentTypeIds) {
        this.rentTypeIds = rentTypeIds;
    }

    public int getFacilityTypeIds() {
        return facilityTypeIds;
    }

    public void setFacilityTypeIds(int facilityTypeIds) {
        this.facilityTypeIds = facilityTypeIds;
    }

    public RentType getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(RentType rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public FacilityType getFacilityTypeId() {
        return facilityTypeId;
    }

    public void setFacilityTypeId(FacilityType facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOFloor() {
        return numberOFloor;
    }

    public void setNumberOFloor(int numberOFloor) {
        this.numberOFloor = numberOFloor;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }
}
