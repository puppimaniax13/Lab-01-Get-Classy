public class Product {
    private String ID;
    private String name;
    private String desc;
    private double cost;
/**
Stores a given person object
@param ID       item ID
@param name     item name
@param desc     item description
@param cost     item's cost in USD
 */


    public Product(String ID, String name, String desc, double cost) {
        this.ID = ID;
        this.name = name;
        this.desc = desc;
        this.cost = cost;
    }

    /**
     *
     * @return returns the item's name and description
     */

    public String itemName(){
        return name + " " + desc;
    }

    /**
     *
     * @return items name description and cost
     */

    public String totalItem(){
        return cost + " " + itemName();
    }

    /**
     *
     * @return items cost as a string
     */

    public String getCost(){
        return String.valueOf(cost);
    }

    /**
     *
     * @return returns the items ID, name, description, and cost in a CSV format.
     */

    public String toCSV(){
        return ID + "," + name + "," + desc + "," + cost;
    }

    public String toJson(){
        return toCSV();
    }

    public String toXML(){
        return toCSV();
    }

    public void setName(String newName){
        name = newName;
    }
    public void setDesc(String newDesc){
        desc = newDesc;
    }
    public void setCost(double newCost){
        cost = newCost;
    }
        public void setID(String ID){
        this.ID = ID;
    }
}
