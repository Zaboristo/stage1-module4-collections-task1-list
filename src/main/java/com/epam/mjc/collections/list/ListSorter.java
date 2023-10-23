package com.epam.mjc.collections.list;

import javax.xml.transform.Source;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator section = new ListComparator();
        for(int i = 0; i + 1< sourceList.size(); i++){
            switch (section.compare(sourceList.get(i), sourceList.get(i+1))){
                case 1:
                    String c = sourceList.get(i);
                    sourceList.set(i, sourceList.get(i+1));
                    sourceList.set(i+1, c);
                    i=-1;
                case 2:
                case 0:
                default:
                    break;
            }
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        Integer ap = Integer.parseInt(a);
        Integer bp = Integer.parseInt(b);
        if ((ap*ap) > (bp*bp)) return 1;
        else if ((bp*bp)>(ap*ap))
            return 2;
        else if (ap>bp) return 1;
        else return 0;
    }
}
