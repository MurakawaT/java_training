import java.util.ArrayList;

public class binarySearch {
    public static int lowerbound(int[] a, int key) {
        if(a[a.length-1] < key)
            return a.length;
        int lb = 0, ub = a.length-1, mid;
        do {
            mid = (ub+lb)/2;
            if(a[mid] < key)
                lb = mid + 1;
            else
                ub = mid;
        }while(lb < ub);
        return ub;
    }

    public static int upperbound(int[] a, int key) {
        if(a[a.length-1] <= key)
            return a.length;
        int lb = 0, ub = a.length-1, mid;
        do {
            mid = (ub+lb)/2;
            if(a[mid] <= key)
                lb = mid + 1;
            else
                ub = mid;
        }while(lb < ub);
        return ub;
    }

    public static int lowerbound(ArrayList<Integer> a, int key) {
        if(a.get(a.size()-1) < key)
            return a.size();
        int lb = 0, ub = a.size()-1, mid;
        do {
            mid = (ub+lb)/2;
            if(a.get(mid) < key)
                lb = mid + 1;
            else
                ub = mid;
        }while(lb < ub);
        return ub;
    }

    public static int upperbound(ArrayList<Integer> a, int key) {
        if(a.get(a.size()-1) <= key)
            return a.size();
        int lb = 0, ub = a.size()-1, mid;
        do {
            mid = (ub+lb)/2;
            if(a.get(mid) <= key)
                lb = mid + 1;
            else
                ub = mid;
        }while(lb < ub);
        return ub;
    }

    public static void main(String[] args) {
        int[] a = {0,2,5,5,5,8,16};

        System.out.println(lowerbound(a,5));
        System.out.println(upperbound(a,5));
        System.out.println(lowerbound(a,7));
        System.out.println(upperbound(a,7));
        System.out.println(lowerbound(a,16));
        System.out.println(upperbound(a,16));
    }


}
