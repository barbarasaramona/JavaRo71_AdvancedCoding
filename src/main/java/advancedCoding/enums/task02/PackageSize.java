package advancedCoding.enums.task02;

public enum PackageSize {
    SMALL(0,20),
    MEDIUM(21,45),
    LARGE(46, Integer.MAX_VALUE);

    int minPackSize;
    int maxPackSize;


    PackageSize(int min, int max) {
        this.minPackSize = min;
        this.maxPackSize = max;
    }

    public static PackageSize getPackageSize(int packageSize) throws Exception {
        for (PackageSize p : PackageSize.values()) {
            if (packageSize > p.minPackSize && packageSize < p.maxPackSize) {
                return p;
            }
        }
        throw new Exception("Pachetul e prea mare!");
    }
    public static PackageSize getPackageSize(int minPackageSize, int maxPackageSize) throws Exception {
        for (PackageSize p : PackageSize.values()) {
            if (minPackageSize >= p.minPackSize && maxPackageSize < p.maxPackSize) {
                return p;
            }
        }
        throw new Exception("Pachetul e prea mare!");
    }
}
