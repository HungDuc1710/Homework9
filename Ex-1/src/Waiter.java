public class Waiter extends Employee {
    private long compensate;

    public Waiter(int id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }
    
    @Override
    public long calculatorSalary() {
        
        return getBasicSalary() + compensate;
    }



    public long getCompensate() {
        return compensate;
    }



    public void setCompensate(long compensate) {
        this.compensate = compensate;
    }



    public Waiter() {
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +" "+ compensate +" "+calculatorSalary();
}

    
}
