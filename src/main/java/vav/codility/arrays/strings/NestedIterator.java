package vav.codility.arrays.strings;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NestedIterator  implements Iterator<Integer> {

    public interface NestedInteger {
        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();
        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();
        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }

        List<Integer> ans;
        Iterator<Integer> it;
        public NestedIterator(List<NestedInteger> nestedList) {
            this.ans = getList(nestedList);
            this.it = ans.iterator();
        }

        private List<Integer> getList(List<NestedInteger> ls) {
            List<Integer> ans = new LinkedList<>();
            for (NestedInteger ns: ls) {
                if (ns.isInteger()) {
                    ans.add(ns.getInteger());
                } else {
                    ans.addAll(getList(ns.getList()));
                }
            }
            return ans;
        }

        @Override
        public Integer next() {
            return it.next();
        }

        @Override
        public boolean hasNext() {
            return this.it.hasNext();
        }

    }
