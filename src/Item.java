class Item {
    private int ID;
    private String Name;

    public Item(int ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }
    public void Show(){
        System.out.println("Item's name: " + Name);
    }
    @Override
    public String toString(){
        return "ID: " + ID + " Name: " + Name;
    }
}
