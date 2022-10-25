import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Inventory {

  private List guitars;
  List<Guitar> guitarResult = new ArrayList<Guitar>();

  public Inventory() {
    guitars = new LinkedList();
  }

  public void addGuitar(
    Builder builder,
    Model model,
    Wood backWood,
    Wood topWood,
    Type type
  ) {
    Guitar guitar = new Guitar(builder, model, backWood, topWood, type);
    guitars.add(guitar);
  }

  public Guitar search(Guitar searchGuitar) {
    for (Iterator i = guitars.iterator(); i.hasNext();) {
      Guitar guitar = (Guitar) i.next();
      Builder builder = searchGuitar.getBuilder();
      if (
        (builder != null) &&
        (!builder.equals("")) &&
        (!builder.equals(guitar.getBuilder()))
      ) continue;
      Model model = searchGuitar.getModel();
      if (
        (model != null) &&
        (!model.equals("")) &&
        (!model.equals(guitar.getModel()))
      ) continue;
      Type type = searchGuitar.getType();
      if (
        (type != null) &&
        (!searchGuitar.equals("")) &&
        (!type.equals(guitar.getType()))
      ) continue;
      Wood backWood = searchGuitar.getBackWood();
      if (
        (backWood != null) &&
        (!backWood.equals("")) &&
        (!backWood.equals(guitar.getBackWood()))
      ) continue;
      Wood topWood = searchGuitar.getTopWood();
      if (
        (topWood != null) &&
        (!topWood.equals("")) &&
        (!topWood.equals(guitar.getTopWood()))
      ) continue;
      return guitar;
    }
    return null;
  }
}
