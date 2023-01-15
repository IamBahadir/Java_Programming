package day37_Inheritance.scrumTask;


public class AmazonInc {


    public static void main(String[] args) {

        String companyName = "Amazon Inc";

        ProductOwner productOwner = new ProductOwner("Stuart", 42, 'M', 1, 160000, companyName);
        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Micheal", 41, 'F', 190000, 2, companyName);
        ScrumMaster scrumMaster = new ScrumMaster("Jack",42,'M',155000,3,companyName);

        Tester tester1 = new Tester("Bahadır",36,'M',"Tester",120000,4,companyName);
        Tester tester2 = new Tester("Ahmet",34,'M',"Tester",120000,5,companyName);
        Tester tester3 = new Tester("Huseyin",32,'M',"Tester",120000,6,companyName);
        Tester tester4 = new Tester("Billur",36,'F',"Tester",120000,7,companyName);

        Tester [] testers = {tester1, tester2, tester3, tester4};


        Developer developer = new Developer("Kalbinur",36,'F',"Developer",175000,10,companyName);

        ScrumTeam scrumTeam = new ScrumTeam(productOwner,businessAnalyst,scrumMaster);

        System.out.println(scrumTeam);

        scrumTeam.addDeveloper(developer);

        System.out.println(scrumTeam);

        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);


        System.out.println("----------------------------------");


        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name+" "+tester.salary);
        }


        System.out.println("----------------------------------");

        scrumTeam.removeTester(5);

        System.out.println(scrumTeam);

        System.out.println("----------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name+" "+tester.salary);
        }



    }


}
