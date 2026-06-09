package Module1.WeeklyAssign.Composition;

public class KYCsystem {

    private PANvalidator pan;
    private AadharVerifier aadhaar;

    public KYCSystem() {
        pan = new PANvalidator();
        aadhaar = new AadharVerifier();
    }

    public void completeKYC() {
        pan.validatePAN();
        aadhaar.verifyAadhaar();
    }
}