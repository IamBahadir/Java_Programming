package day37_Inheritance.bankBranch;

import java.util.ArrayList;
import java.util.Arrays;

public class branchTeam {


    public Manager MN;
    public Security SC;

    public ArrayList<RelationshipManager> relationshipManagers = new ArrayList<>();
    public ArrayList<BankOfficer> bankOfficers = new ArrayList<>();


    public branchTeam(Manager MN, Security SC) {
        this.MN = MN;
        this.SC = SC;

    }

    public void addRelationshipManager(RelationshipManager relationshipManager){
        relationshipManagers.add(relationshipManager);
    }
    public void addRelationshipManagers(RelationshipManager[] relationshipManagers){
        this.relationshipManagers.addAll(Arrays.asList(relationshipManagers));
    }
    public void removeRelationshipManager(int ID){
        relationshipManagers.removeIf(p-> p.ID==ID);
    }

    public void addBankOfficer(BankOfficer bankOfficer){
        bankOfficers.add(bankOfficer);
    }
    public void addBankOfficers(BankOfficer[]bankOfficers){
        this.bankOfficers.addAll(Arrays.asList(bankOfficers));
    }
    public void removeBankOfficer(int ID){
        bankOfficers.removeIf(p-> p.ID == ID);
    }


    public String toString() {
        return "branchTeam{" +
                "MN=" + MN.name +
                ", SC=" + SC.name +
                ", How many relationshipManagers we have : =" + relationshipManagers.size() +
                ", How many bankOfficers we have :=" + bankOfficers.size() +
                '}';
    }
}
