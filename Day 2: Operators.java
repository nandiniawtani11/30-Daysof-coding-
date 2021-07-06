 public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    double tip=((tip_percent/(double)(100))*meal_cost);
    double tax=((tax_percent/(double)(100))*meal_cost);
    System.out.println(Math.round(meal_cost+tip+tax));

    }
