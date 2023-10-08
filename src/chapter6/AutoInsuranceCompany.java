package chapter6;

import org.jetbrains.annotations.NotNull;

public class AutoInsuranceCompany {

    private String accountNumber;
    private String name;
    private String makeAndModels;
    private String state;

    public AutoInsuranceCompany(String accountNumber, String name, String makeAndModels, String state) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.makeAndModels = makeAndModels;
        this.state = state;
    }

    public AutoInsuranceCompany() {
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeAndModel(String makeModel) {
        this.makeAndModels = makeModel;
    }

    public String getMakeAndModel() {
        return makeAndModels;
    }

    public void state(@NotNull String state) {
       // String newState = null;
        if (state.equals("NY") || state.equals("CT") || state.equals("MA") || state.equals("NJ")) {
            this.state = state;
      }
        else throw new RuntimeException("Incorrect State");

        //            newState = switch (state) {
//                case "NY" -> "New York";
//                case "CT" -> "Connecticut";
//                case "MA" -> "Massachusetts";
//                default -> "New Jersey";
//
    }

    public String getState() {
        return state;
    }

    public boolean isNoFaultState() {
        boolean noFaultState;
        switch (getState()) {
            case "MA", "NJ", "PA" -> noFaultState = true;
            default -> noFaultState = false;
        }
        return noFaultState;
    }
}
