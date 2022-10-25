public class Guitar {

  private Builder builder;
  private Model model;
  private Wood backWood, topWood;
  private Type type;

  public Guitar(
    Builder builder,
    Model model,
    Wood backWood,
    Wood topWood,
    Type type
  ) {
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
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
