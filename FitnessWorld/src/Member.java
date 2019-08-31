public class Member extends Person {

    private boolean isBasic;

    public Member(String navn, String cpr, boolean isBasic) {
        super(navn, cpr);
        this.isBasic = isBasic;
    }

    public void full() {

        isBasic = false;
    }

    public void basic() {

        isBasic = true;
    }

    public String getMemberType() {
        if (!isBasic) {
            return "Full";
        } else {

            return "Basic";
        }
    }

    public int monthlyFee() {
        if (!isBasic) {
            return 299;
        } else {
            return 199;
        }
    }
}
