package practice01;

public class Menu_01 {
    
    private String menuName;
    private int stock;

    public Menu_01(){

    }

    public Menu_01(String menuName, int stock) {
        this.menuName = menuName;
        this.stock = stock;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    


}//class
