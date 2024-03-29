package lesson04_Encapsulation.studentTask;

public class Student {

    private String name;
    private int age;

    public int getAge(){ // read only
        if(age == 0){
            System.err.println("Age has not been set.");
            System.exit(1);
        }
        return age;
    }
    public void setAge(int age){ // write only
        if(age < 1 || age > 100){
            System.err.println("Invalid age "+age);
            // return; exiting the method
            System.exit(1); // program gets terminated
        }
        this.age = age;
    }
    public String getName() {
        if(name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }
    public void setName(String name) {

        boolean hasDigit = false, hasSpecialChar = false;

        for (char each : name.toCharArray()){
            if(Character.isDigit(each)){
                hasDigit =true;
                break;
            }
        }
        if (hasDigit){
            System.err.println("Name can't contains digits");
            System.exit(1);
        }
        if(name.trim().isEmpty()){
            System.err.println("Name can't be blank or empty.");
            System.exit(1);
        }
        this.name = name;
    }
}
