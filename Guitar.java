public class Guitar {

  private String serialNumber;
  private double price;
  private Builder builder;
  private Model model;
  private Wood backWood, topWood;
  private Type type;

  public Guitar(String serialNumber, double price, Builder builder, Model model, Wood backWood, Wood topWood, Type type) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(float newPrice) {
    this.price = newPrice;
  }

  public Builder getBuilder() {
    return builder;
  }

  public Model getModel() {
    return model;
  }

  public Type getType() {
    return type;
  }

  public Wood getBackWood() {
    return backWood;
  }

  public Wood getTopWood() {
    return topWood;
  }
}
