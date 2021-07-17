package vav.codility.arrays.strings;

public class FindTheHighestAltitude {

    public int largestAltitude(int[] gain) {
        int maxAlt = 0;
        int alt = 0;
        for (int i = 0; i < gain.length; i++) {
            alt += gain[i];
            maxAlt = Math.max(maxAlt, alt);
        }
        return maxAlt;
    }
}
