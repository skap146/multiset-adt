/**
 * Abstract class representing a MultiSet ADT.
 */
public abstract class MultiSet {

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    abstract void add(Integer item);

    /**
     * Remove the given item to this multiset.
     *
     * @param item the item to remove
     */
    abstract void remove(Integer item);

    /**
     * Figure out whether the item is contained in the multiset.
     *
     * @param item the item to check if contained in the multiset.
     */
    abstract boolean contains(Integer item);

    /**
     * Figure out whether the multiset is empty
     */
    abstract boolean is_empty();

    /**
     * Figure out the number of times an item appears in the multiset.
     */
    abstract int count(Integer item);

    /**
     * Figure out the length/size of the multiset
     */
    abstract int size();

    // TODO finish adding abstract methods to fully describe what it means to be a MultiSet.
}
