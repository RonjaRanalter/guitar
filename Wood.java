public enum Wood {

  INDIAN_ROSEWOOD,
  ALDER,
  SITKA,
  ADIRONDACK,
  MAHOGANY,
  MAPLE,
  CEDAR,
  BRAZILIAN_ROSEWOOD,
  COCOBOLO;

  public String toString() {
    switch (this) {
      case INDIAN_ROSEWOOD:
        return "Indian Rosewood";
      case ALDER:
        return "Alder";
      case SITKA:
        return "Sitka";
      case ADIRONDACK:
        return "Adirondack";
      case MAHOGANY:
        return "Mahogany";
      case MAPLE:
        return "Maple";
      case CEDAR:
        return "Cedar";
      case BRAZILIAN_ROSEWOOD:
        return "Brazilian Rosewood";
      case COCOBOLO:
        return "Cocobolo";
      default:
        return this + " " + "is missing in the toString-method";
    }
  }
}