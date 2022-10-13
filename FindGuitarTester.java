public class FindGuitarTester {

  public static void main(String[] args) {
    // Set up Rick's guitar inventory
    Inventory inventory = new Inventory();
    initializeInventory(inventory);



    Guitar whatErinLikes = new Guitar(null, 0, Builder.FENDER, Model.STRATOCASTOR,Wood.ALDER, Wood.ALDER,Type.ELECTRIC);
    Guitar guitar = inventory.search(whatErinLikes);
    if (guitar != null) {
      System.out.println("Erin, you might like this " +
        guitar.getBuilder() + " " + guitar.getModel() +  " " +
        guitar.getType() + " guitar:\n   " +
        guitar.getBackWood() + " back and sides,\n   " +
        guitar.getTopWood() + " top.\nYou can have it for only $" +
        guitar.getPrice() + "!");
    } else {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }
  }

  private static void initializeInventory(Inventory inventory) {
    inventory.addGuitar("11277", 3999.95, Builder.COLLINGS, Model.CJ,Wood.INDIAN_ROSEWOOD, Wood.SITKA,Type.ACOUSTIC);
    inventory.addGuitar("V95693", 1499.95, Builder.FENDER, Model.STRATOCASTOR,Wood.ALDER, Wood.ALDER,Type.ELECTRIC);
    inventory.addGuitar("V9512", 1549.95, Builder.FENDER, Model.STRATOCASTOR,Wood.ALDER, Wood.ALDER,Type.ELECTRIC);
    inventory.addGuitar("122784", 5495.95, Builder.MARTIN, Model.D_18, Wood.MAHOGANY, Wood.ADIRONDACK, Type.ACOUSTIC);
    inventory.addGuitar("76531", 6295.95, Builder.MARTIN, Model.OM_28, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, Type.ACOUSTIC);
    inventory.addGuitar("70108276", 2295.95, Builder.GIBSON, Model.LES_PAUL, Wood.MAHOGANY, Wood.MAPLE, Type.ELECTRIC);
    inventory.addGuitar("82765501", 1890.95, Builder.GIBSON, Model.SG_61_REISSUE, Wood.MAHOGANY, Wood.MAHOGANY, Type.ELECTRIC);
    inventory.addGuitar("77023", 6275.95, Builder.MARTIN, Model.D_28, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, Type.ACOUSTIC);
    inventory.addGuitar("1092", 12995.95, Builder.OLSON, Model.SJ, Wood.INDIAN_ROSEWOOD, Wood.CEDAR, Type.ACOUSTIC);
    inventory.addGuitar("566-62", 8999.95, Builder.RYAN, Model.CATHEDRAL, Wood.COCOBOLO, Wood.CEDAR, Type.ACOUSTIC);
    inventory.addGuitar("6 29584", 2100.95, Builder.PRS, Model.DAVE_NAVARRO_SIGNATURE, Wood.MAHOGANY, Wood.MAPLE, Type.ELECTRIC);
  }
}
