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
        return this + "fehlt in der toString-Methode";
    }
  }
}