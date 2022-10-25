public enum Model {
  CJ,
  STRATOCASTOR,
  D_18,
  OM_28,
  LES_PAUL,
  DAVE_NAVARRO_SIGNATURE,
  SJ,
  CATHEDRAL,
  SG_61_REISSUE,
  D_28;

  public String toString() {
    switch (this) {
      case CJ:
        return "Cj";
      case STRATOCASTOR:
        return "Stratocastor";
      case D_18:
        return "D-18";
      case OM_28:
        return "Om-28";
      case LES_PAUL:
        return "Les Paul";
      case DAVE_NAVARRO_SIGNATURE:
        return "Dave Navarro Signature";
      case SJ:
        return "Sj";
      case CATHEDRAL:
        return "Cathedral";
      case SG_61_REISSUE:
        return "SG '61 Reissue";
      case D_28:
        return "D-28";
      default:
        return this + " is missing in the toString-method";
    }
  }
}
