public class Hamming {
    private final String leftStrand;
    private final String rightStrand;
    private final int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("strands must be of equal length");

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        hammingDistance = calculateHammingDistance();
    }

    public int getHammingDistance() {
        return hammingDistance;
    }

    private int calculateHammingDistance() {
        if (leftStrand.length() != rightStrand.length()) return 0;

        var hammingDistance = 0;
        for (int i = 0; i < leftStrand.length(); i++)
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) hammingDistance++;
        return hammingDistance;
    }
}
