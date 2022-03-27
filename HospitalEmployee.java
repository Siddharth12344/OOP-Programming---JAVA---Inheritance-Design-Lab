package InheritanceDesignLab;
public class HospitalEmployee {
	protected String name;
	protected int number;
	public HospitalEmployee() {}
	public HospitalEmployee(String empName, int empNumber) {
		name= empName;
		number= empNumber;
	}
	public void setName(String empName) {
		name= empName;
	}
	public void setNumber(int empNumber) {
		number= empNumber;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
    public String toString() {
    	return name+ " "+ number;
    }
    public void work()
    {
    System.out.println (name + " works for the hospital.");
    }

}
class Doctor extends HospitalEmployee{
	String specialty;
	public Doctor() {};
    public Doctor(String empname,int empnum,String specialty1) {
		specialty=specialty1;
		name=empname;
		number=empnum;
	}
    @Override
    public String toString() {
    	return name+ " "+ number+" "+specialty;
    }
    @Override
    public void work()
    {
    System.out.println (name + " works for the hospital. "+name + " is a(n)"+ specialty +"doctor");
    }

	
}
class Surgeon extends Doctor{
	boolean operating;
    public Surgeon(String empname,int empnum,String specialty1,boolean oper) {
		operating=oper;
		specialty=specialty1;
		name=empname;
		number=empnum;
	}
    @Override
    public String toString() {
    	return name+ " "+ number+" "+specialty+"Operating: "+operating;
    }
    
    	@Override
    	public void work()
    	{
    		if(operating==true) {
    		System.out.println (name + " works for the hospital. "+name + "is operating now ");}
    		else {
    			System.out.println(name + " works for the hospital. "+name + "is not operating now ");
    		}
    	}
    
	
} 
class Nurse extends HospitalEmployee{
	int numOfPatients;
    public Nurse(String empname,int empnum,int numOfPatient1) {
		numOfPatients=numOfPatient1;
		name=empname;
		number=empnum;
	}
    @Override
    public String toString() {
    	return name+ number+" "+"has "+numOfPatients+" "+"patients.";
    }
    @Override
    public void work()
    {
    System.out.println (name + " works for the hospital. "+name + " is a nurse with "+ numOfPatients +" patients");
    }

}
