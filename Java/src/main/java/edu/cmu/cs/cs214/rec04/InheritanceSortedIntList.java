package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    // Write your implementation below with API documentation

    private int totalAdded = 0;

    /**
     * Adds the specified int to the list. Overrides the inherited version.
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num){
        this.totalAdded++;
        if(super.add(num)) return true;
        else return false;
    }

    /**
     * Adds all of the elements of the IntegerList to the list.
     * Overrides the inherited version.
     *
     * @param list IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call
     */
    /* @Override
    public boolean addAll(IntegerList list){
        if(super.addAll(list)) return true;
        else return false;
    } */

    /**
     * Returns the total number of elements that have been added to the list
     * since its creation.
     * 
     * @return the total number of elements added since creation
     */
    public int getTotalAdded(){
        return totalAdded;
    }

}