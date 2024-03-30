
//considering account managers get customers from 0 month
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
        revenue.recur(0, revenue.initialCustomers, 0, 0, new int[] { 0, 0, 0, 0, 0, 0, 0 });
        for (Map.Entry<Integer, double[]> ele : revenue.history.entrySet())
            System.out.println(ele.getKey() + " " + Arrays.toString(ele.getValue()));
    }

    // store the max allocation for each month
    private HashMap<Integer, double[]> history = new HashMap<>();
    private HashMap<String, Double> map = new HashMap<>();

    private double recur(int currMonth, int customers, int xbusiness, int xaccount, int customerAccountMap[]) {
        if (currMonth > 24) {
            return initialCustomers * baselineRevenue;
        }

        if (map.containsKey(customers+"-"+xbusiness + "-" + xaccount))
            return map.get(customers+"-"+xbusiness + "-" + xaccount);

        double max = -1;
        int maxCustAccMap[] = customerAccountMap;
        int business = 0, account = 0, cSupport = 0, nCustomers = 0;
        for (int newBusiness = 0; newBusiness <= N; newBusiness++) {
            for (int accountManagement = 0; accountManagement <= N - newBusiness; accountManagement++) {
                int support = N - newBusiness - accountManagement;
                int arr[] = copyArray(customerAccountMap);
                double result[] = simulateRevenue(accountManagement, newBusiness, support, customers,
                arr);                
                double value = recur((currMonth + 1), (int) result[1], business, account,
                arr);
                result[0] += value;
                if (result[0] > max) {
                    max = result[0];
                    business = newBusiness;
                    account = accountManagement;
                    cSupport = support;
                    nCustomers = (int) result[1];
                    maxCustAccMap = arr;
                }
            }
        }   
        
        //System.out.println(Arrays.toString(maxCustAccMap));
        if (history.containsKey(currMonth) && history.get(currMonth)[1] < max)
            history.put(currMonth, new double[] { nCustomers, max, account, business, cSupport });
        else if (!history.containsKey(currMonth))
            history.put(currMonth, new double[] { nCustomers, max, account, business, cSupport });

        map.put(customers+"-"+xbusiness + "-" + xaccount, max);
        return max;
    }

    private int[] copyArray(int[] customerAccountMap) {
        int arr[] = new int[customerAccountMap.length];
        for (int i = 0; i < customerAccountMap.length; i++)
            arr[i] = customerAccountMap[i];

        return arr;
    }

    private double[] simulateRevenue(int accountManagement, int newBusiness, int support, int customers,
            int customerAccountMap[]) {                
        // Calculate revenue from existing customers

        // Calculate revenue from existing customers
        double revenue = 0.0;// customers * baselineRevenue;

        // Calculate revenue from organic growth
        customers += organicGrowth;
        revenue += organicGrowth * baselineRevenue;

        // Calculate revenue from new customer acquisitions
        int newCustomersAcquired = newBusiness * 5;
        customers += newCustomersAcquired;
        revenue += newCustomersAcquired * baselineRevenue;

        customerAccountMap[0] += newCustomersAcquired + organicGrowth;

        // Calculate revenue from account management
        double accountManagerRevenue = 0;
        int accountManagementPower = customersManagedPerAccountManager * accountManagement;
        for (int k = customerAccountMap.length - 1; k >= 0; k--) {
            if (accountManagementPower == 0 || customerAccountMap[k] == 0)
                break;
            double compoundedRevenue = baselineRevenue * Math.pow(1 + revenueIncreaseRate, k);
            if (customerAccountMap[k] > accountManagementPower) {
                if (accountManagementPower < customerAccountMap[k]) {
                    accountManagerRevenue += customersManagedPerAccountManager * compoundedRevenue;
                    accountManagementPower -= accountManagementPower - customerAccountMap[k];
                } else {
                    accountManagerRevenue += customerAccountMap[k] * compoundedRevenue;
                    accountManagementPower -= accountManagementPower - customerAccountMap[k];
                }
            }
        }
        revenue += accountManagerRevenue;

        // Calculate revenue increase due to CSAT improvement
        // Churn(t) = 0.1 * (1 - 0.15 * CSAT(t))
        double csat = support; // Initial CSAT plus support increase
        double newChurnRate = initalChurnRate * (1 - churnRateDecrease * csat);
        if (newChurnRate > 0)
            revenue += (customers * (initalChurnRate - newChurnRate) * baselineRevenue) / 12;
        // Calculate revenue after churn
        double customersLost = Math.round(customers * newChurnRate) / 12;

        if (newChurnRate > 0)
            customers -= customersLost;
        else
            customersLost = 0;

        shiftToRight(customerAccountMap, (int) customersLost);        

        return new double[] { revenue, customers };
    }

    private void shiftToRight(int customerAccountMap[], int customersLost) {
        for (int i = customerAccountMap.length - 1; i >= 1; i--) {
            customerAccountMap[i] += customerAccountMap[i - 1];
            customerAccountMap[i - 1] = 0;
            if (customersLost == 0)
                continue;
            if (customerAccountMap[i] > 0) {
                if (customerAccountMap[i] > customersLost) {
                    customerAccountMap[i] -= customersLost;
                    customersLost = 0;
                } else {
                    customersLost -= customerAccountMap[i];
                    customerAccountMap[i] = 0;
                }
            }
        }
    }
}
