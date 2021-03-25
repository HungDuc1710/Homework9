public class Cook extends Employee {
    private long serviceCharge;
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +" "+ serviceCharge +" "+calculatorSalary();
    }

    @Override
    public long calculatorSalary() {
        
        return getBasicSalary() + serviceCharge;
    }



    public long getServiceCharge() {
        return serviceCharge;
    }



    public void setServiceCharge(long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }



    public Cook(int id, String name, int age, long basicSalary, long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }
    
}
