public class University {

    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Student("Nowak", Student.Major.informatyka);
        people[1] = new Student("Kowalska", Student.Major.telekomunikacja);
        people[2] = new Student("Biernacki", Student.Major.matematyka);
        people[3] = new Employee("Lewandowski", 1000000);
        people[4] = new Employee("Duda", 10000);


        for(int i = 0; i < 3;i++) {
            ((Student) people[i]).addGrade((short) 6);
        }

        //w instrukcji bylo napisane o wszystkich STUDENTACH, dlatego sprawdzam instanceof
        for(Person p : people) {
            if(p instanceof Student) System.out.println(p.toString());
        }
        int i = 0;
        while( i < 5) {
            if(people[i] instanceof Student) System.out.println(people[i].toString());
            i++;
        }
    }

}
