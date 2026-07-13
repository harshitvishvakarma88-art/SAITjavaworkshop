class ElectricityBill {
    private String customerName;
    private int unitsConsumed;
    private double pricePerUnit;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalBill() {
        double bill = unitsConsumed * pricePerUnit;

        if (unitsConsumed > 500) {
            bill += bill * 0.10;
        }
        return bill;
    }
}