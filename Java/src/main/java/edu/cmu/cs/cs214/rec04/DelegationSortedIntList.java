package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation
    private IntegerList sortlst = new SortedIntList();
    private int totalAdded = 0;

    public boolean add(int num) {
        totalAdded++;
        if(sortlst.add(num)) return true;
        else return false;
    }

    public boolean addAll(IntegerList list) {
        totalAdded += list.size();
        if (sortlst.addAll(list)) return true;
        else return false;
    }

    public int get(int index) {
        return sortlst.get(index);
    }

    public boolean remove(int num) {
        if (sortlst.remove(num)) return true;
        else return false;
    }

    public boolean removeAll(IntegerList list) {
        if (sortlst.removeAll(list)) return true;
        else return false;
    }

    public int size() {
        return sortlst.size();
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}