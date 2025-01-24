public class Main{
    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // return 3
        System.out.println(getBucketCount(3.4, 2.1, 1.5)); // return 5
        System.out.println(getBucketCount(3.4, 1.5)); // return 3
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double area = (width * height);

        int counter = 0;
        while (area > 0){
            area -= areaPerBucket;
            counter++;
        }
        return counter - extraBuckets;

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double area = (width * height);

        int counter = 0;
        while (area > 0){
            area -= areaPerBucket;
            counter++;
        }
        return counter ;

    }

    public static int getBucketCount(double area, double areaPerBucket){

        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        int counter = 0;
        while (area > 0){
            area -= areaPerBucket;
            counter++;
        }
        return counter;
    }

}