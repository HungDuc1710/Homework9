import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Waiter> listWaiter = new ArrayList<>();
        listWaiter.add(new Waiter(1, "waiter1", 19, 10000000, 5000000));
        listWaiter.add(new Waiter(2, "waiter2", 20, 11000000, 6000000));
        listWaiter.add(new Waiter(3, "waiter3", 21, 12000000, 7000000));

        List<Cook> listCook = new ArrayList<>();
        listCook.add(new Cook(1, "Cook1", 19, 13000000, 1000000));
        listCook.add(new Cook(2, "Cook2", 20, 14000000, 2000000));
        listCook.add(new Cook(3, "Cook3", 21, 15000000, 3000000));

        System.out.println("Thông tin danh sách bồi bàn:");
        printArray(listWaiter);
        System.out.println("Thông tin danh sách phụ bếp:");
        printArray(listCook);
    }
    public static void printArray(List<? extends Employee> list){
            for(Employee employee : list){
                System.out.println(employee);
            }
        }
    
}
