public enum Builder {

    COLLINGS,
    FENDER,
    MARTIN,
    GIBSON,
    OLSON,
    RYAN,
    PRS;

    public String toString() {
        switch (this) {
          case COLLINGS:
            return "Collings";
          case FENDER:
            return "Fender";
          case MARTIN:
            return "Martin";
          case GIBSON:
            return "Gibson";
          case OLSON:
            return "Olson";
          case RYAN:
            return "Ryan";
          case PRS:
            return "Prs";
          default:
            return this + "fehlt in der toString-Methode";
        }
      }
    }


