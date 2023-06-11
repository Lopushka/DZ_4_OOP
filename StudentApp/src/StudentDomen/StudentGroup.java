package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>,Comparable<StudentGroup> {
    private List<Student> group;
    private long groupid;

    /**
     * @param students список студ.
     * @param groupid  номер гр.
     */
    public StudentGroup(List<Student> students, long groupid) {
        this.group = students;
        this.groupid = groupid;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> students) {
        this.group = students;
    }

    public long getGroupid() {
        return groupid;
    }

    public void setGroupid(long groupid) {
        this.groupid = groupid;
    }

    /**
     * Анонимный итератор
     */

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int cnt;

            @Override
            public boolean hasNext() {
                return cnt < group.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return group.get(cnt++);
            }
        };

        // return new SGIterator(students);
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (this.group.size() == o.getGroup().size()) {
            return 0;
        }
        if (this.group.size() < o.getGroup().size()) {
            return -1;
        }
        return 1;
    }

    public void addStudent(Object byId) {
    }

    public char[] getName() {
        return null;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "group = " + group +
                ", idGroup = " + groupid +'\n'+
                '}';
    }
}
