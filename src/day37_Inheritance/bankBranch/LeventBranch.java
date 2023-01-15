package day37_Inheritance.bankBranch;



public class LeventBranch {

    public static void main(String[] args) {


        System.out.println("------------------------------------------------------------------");

        Manager manager = new Manager("Joshua", 47, 'M', 1, 275000);
        Security security = new Security("Martin", 28, 'M', 2, 80000);

        System.out.println(manager);
        System.out.println(security);


        branchTeam branchTeam = new branchTeam(manager, security);
        System.out.println(branchTeam);

        System.out.println("------------------------------------------------------------------");

        RelationshipManager relationshipManager1 = new RelationshipManager("Sozua", 35, 'F', 3, 120000);
        RelationshipManager relationshipManager2 = new RelationshipManager("Clary", 35, 'F', 4, 120000);
        RelationshipManager relationshipManager3 = new RelationshipManager("Sebastian", 35, 'M', 5, 120000);

        RelationshipManager[] relationshipManagers = {relationshipManager1, relationshipManager2, relationshipManager3};

        System.out.println("------------------------------------------------------------------");

        BankOfficer bankOfficer1 = new BankOfficer("Larisa", 33, 'F', 6, 75000);
        BankOfficer bankOfficer2 = new BankOfficer("Barbara", 32, 'F', 7, 75000);
        BankOfficer bankOfficer3 = new BankOfficer("She'Cari ", 22, 'F', 8, 75000);

        BankOfficer[] bankOfficers = {bankOfficer1, bankOfficer2, bankOfficer3};

        System.out.println("------------------------------------------------------------------");

        System.out.println(branchTeam);

        branchTeam.addBankOfficers(bankOfficers);
        branchTeam.addRelationshipManagers(relationshipManagers);

        System.out.println(branchTeam);

        System.out.println("------------------------------------------------------------------");

        for (RelationshipManager relationshipManager : relationshipManagers) {
            System.out.println(relationshipManager.name + " " + relationshipManager.salary + " ID : " + relationshipManager.ID);
        }
        System.out.println("------------------------------------------------------------------");


        for (BankOfficer bankOfficer : bankOfficers) {
            System.out.println(bankOfficer.name + " " + bankOfficer.salary + " ID : " + bankOfficer.ID);
        }

        System.out.println("------------------------------------------------------------------");

        branchTeam.removeBankOfficer(7);
        branchTeam.removeRelationshipManager(3);

        System.out.println(branchTeam);

        System.out.println("------------------------------------------------------------------");


        for (RelationshipManager each : branchTeam.relationshipManagers) {
            System.out.println(each);
        }

        System.out.println("------------------------------------------------------------------");

        for (BankOfficer each : branchTeam.bankOfficers) {
            System.out.println(each);
        }

        System.out.println("------------------------------------------------------------------");






    }


}
