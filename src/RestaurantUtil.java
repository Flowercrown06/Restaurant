public class RestaurantUtil {
    public static void addDish(Dish dish) {
        Restaurant.dishes[Restaurant.dishIndex++]= dish;
    }
    public static void printAllDishes(){
        for(int i=0; i<Restaurant.dishIndex; i++){
            Dish dish= Restaurant.dishes[i];
            System.out.println(dish.getName());
        }

    }
    public static void removeDish(String name){
        for(int i=0; i<Restaurant.dishIndex; i++){
            Dish dish= Restaurant.dishes[i];
            if(dish.getName().equals(name)){
                Restaurant.dishes[i]= null;
                errorCorrection(Restaurant.dishes,i);
                Restaurant.dishIndex--;

            }
        }
    }
    private static void errorCorrection(Dish[] dishes, int k){
        for(int i=0; i<Restaurant.dishIndex; i++){
            dishes[k+i]= dishes[k+i+1];
            dishes[k+i+1] = null;
        }

    }
}
