public enum Type {

  ELECTRIC,
  ACOUSTIC;

  public String toString() {
    switch (this) {
      case ELECTRIC:
        return "electric";
      case ACOUSTIC:
        return "accoustic";
      default:
        return this + " " + "is missing in the toString-method";
    }
  }
}