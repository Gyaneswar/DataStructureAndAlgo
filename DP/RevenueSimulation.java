import java.util.*;

class RevenueSimulation {
    // Define parameters
    final int N = 20; // Total number of team members
    final int months = 24; // Total number of months
    final double baselineRevenue = 100; // Baseline revenue per customer
    final int initialCustomers = 1000; // Initial number of customers
    final double initialChurnRate = 0.10; // Churn rate
    final int organicGrowth = 25; // Organic growth per month
    final double csatIncrease = 0.01; // CSAT increase per support agent
    final double revenueIncreaseRate = 0.20; // Revenue increase rate for Account Managers
    final int customersManagedPerAccountManager = 25; // Number of customers managed per Account Manager
    final double churnRateDecrease = 0.15;
    final double initalChurnRate = 0.1;
    final double initalCSAT = 70;

    public static void main(String[] args) {
        RevenueSimulation revenue = new RevenueSimulation();
        revenue.recur(0,revenue.initialCustomers);
        for(Map.Entry<Integer,double[]> ele: revenue.history.entrySet())
            System.out.println(ele.getKey()+" "+Arrays.toString(ele.getValue()));
    }

    //store the max allocation for each month
    private HashMap<Integer,double[]> history = new HashMap<>();
    private HashMap<String,Double> map = new HashMap<>();

    private double recur(int currMonth,int customers) {
        if (currMonth > 24) {
            return 0;
        }

        if(map.containsKey(customers+"-"+currMonth))
            return map.get(customers+"-"+currMonth);

        double max = Double.MIN_VALUE;        
        int business = 0, account = 0, cSupport = 0;
        for (int newBusiness = 0; newBusiness <= N; newBusiness++) {
            for (int accountManagement = 0; accountManagement <= N - newBusiness; accountManagement++) {
                int support = N - newBusiness - accountManagement;
                double result[] = simulateRevenue(currMonth,accountManagement,newBusiness,support,customers);
                double value =  recur((currMonth + 1),(int)result[1]);
                result[0] += value;
                if (result[0] > max) {
                    max = result[0];
                    business = newBusiness;
                    account = accountManagement;
                    cSupport = support;
                }
            }
        }
        //System.out.println(currMonth+" "+ max + " " + account + " " + business + " "+ cSupport);
        history.put(currMonth,new double[]{max,account,business,cSupport});
        map.put(customers+"-"+currMonth,max);
        return max;
    }

    private double[] simulateRevenue(int month, int accountManagement,int newBusiness,int support,int customers) {
        // Calculate revenue from existing customers
        double revenue = customers * baselineRevenue;
        for (int i = 0; i < accountManagement; i++) {
            revenue += baselineRevenue * customersManagedPerAccountManager *
                    (1 + (month < 6 ? month : 6) * revenueIncreaseRate);
        }

        // Calculate revenue from organic growth
        customers += organicGrowth;
        revenue += organicGrowth * baselineRevenue;

        // Calculate revenue from new customer acquisitions
        int newCustomersAcquired = newBusiness * 5;
        customers += newCustomersAcquired;
        revenue += newCustomersAcquired * baselineRevenue;

        // Calculate revenue after churn
        double customersLost = customers * initalChurnRate;
        revenue -= (customersLost * baselineRevenue);
        customers -= customersLost;

        // Calculate revenue increase due to CSAT improvement
        //churn(t) = 0.1 * (1 - 0.15 * csat(t))
        double newChurnRate = initalChurnRate * (1 - churnRateDecrease * support);
        revenue += (customers * (initalChurnRate - newChurnRate) * baselineRevenue)/12;

        return new double[]{revenue,customers};
    }
}
