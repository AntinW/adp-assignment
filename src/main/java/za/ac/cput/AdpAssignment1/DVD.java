package za.ac.cput.AdpAssignment1;

public class DVD {

    private String dvdName;
    private int numDvd;

    public DVD() {
    }

    public DVD(String dvdName, int numDvd) {
        this.dvdName = dvdName;
        this.numDvd = numDvd;
    }

    public String getDvdName() {
        return dvdName;
    }

    public void setDvdName(String dvdName) {
        this.dvdName = dvdName;
    }

    public int getNumDvd() {
        return numDvd;
    }

    public void setNumDvd(int numDvd) {
        this.numDvd = numDvd;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "dvdName='" + dvdName + '\'' +
                ", numDvd=" + numDvd +
                '}';
    }
}
