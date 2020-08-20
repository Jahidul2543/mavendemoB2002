package controlflow.returntypedemo;

public class ATMBoth {

    public boolean readATMCard(ATMCard atmCard){
        // 1. Insert Card inside a ATM Machine
        boolean cardStatus = true;
        return cardStatus;
    }

    public boolean validatePassowrd(){
        System.out.println("Do password validation ");
        boolean paswordValidationResult = true;
        return paswordValidationResult;

    }

    public String withdrawMoney(){
        System.out.println("Allow valid Customer to withdraw money");
        String transactionStatus = "Successful";
        return transactionStatus;
    }

    public String endTransaction(){

        System.out.println("This method will end the transaction");
        String thankYouText = "Thanks for being with Citi Bank";
        System.out.println(thankYouText);
        return thankYouText;
    }

    public void makeTransaction(){

        ATMBoth obj = new ATMBoth();
        ATMCard myATMCard = new ATMCard();

        // 1. Reading ATM Card
        boolean cardStatus = obj.readATMCard(myATMCard);

        // 2. Go for password validation if only card is valid


        if(cardStatus==true){
            boolean passwrodStatus = obj.validatePassowrd();

            if(passwrodStatus == true){
                System.out.println("Welcome to your account");
                // 3. Allow customer to withdraw money if password is valid
                String trnasactionStatus = obj.withdrawMoney(); // disperse

                if(trnasactionStatus.equals("Successful")){
                    // 4. End Transaction
                    obj.endTransaction();
                }
                else {
                    System.out.println(" Put valid amount ");
                }
            }
            else {
                System.out.println("Password is invalid, provide correct password");
            }
        }
        else {
            System.out.println("This is an invalid card please try with valid card");
        }

    }
}
