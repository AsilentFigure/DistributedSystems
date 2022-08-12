package solution;

/**
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/12 10:35
 */
public class Average {
    public double average(int[] salary) {
        double result = 0.0;
        int maxSalary = 0, minSalary = salary[0], sumSalary = 0;
        for(int perSalary : salary){
            if(perSalary > maxSalary) {
                maxSalary = perSalary;
            }else if (perSalary < minSalary) {
                minSalary = perSalary;
            }
            sumSalary += perSalary;
        }
        result = (sumSalary - maxSalary - minSalary) / (double)(salary.length - 2);
        return result;
    }
}
