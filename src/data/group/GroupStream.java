package data.group;

import data.iterator.GroupStreamIterator;

import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<StudentGroup>, Comparable<GroupStream>, Group {
    private List<StudentGroup> groups;

    public GroupStream(List<StudentGroup> groups) {
        this.groups = groups;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this);
    }

    @Override
    public int compareTo(GroupStream gst) {
        return Integer.compare(this.groups.size(), gst.groups.size());
    }
}
