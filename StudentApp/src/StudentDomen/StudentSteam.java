package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    /** Список групп */
    private List<StudentGroup> teams;
    /** Идентификатор */
    public int idgrop;

    /**
     * конструктор
     * 
     * @param numder номер потока
     */
    public StudentSteam(int numder) {
        this.teams = new ArrayList<>();
        this.idgrop = numder;
    }

    /**
     * @param Team группа
     * добавления группы в список потоков
     */
    public void addTeam(StudentGroup Team) {
        this.teams.add(Team);
    }

    public int getIdgrop() {
        return idgrop;
    }

    public List<StudentGroup> getTeams() {
        return teams;
    }

    @Override
    public String toString() {
        String teamout = new String();
        teamout = String.format("\n№Потока %d", getIdgrop());
        for (StudentGroup studentGroup: teams){
            teamout = teamout + "\n"+ studentGroup.getGroup() + "\n";
        }
        return teamout;
    }

    /** Анонимный итератор */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
			private int cnt = 0;

			@Override
			public boolean hasNext() {
				return cnt < teams.size();
			}

			@Override
			public StudentGroup next() {
				if (!hasNext()) {
					return null;
				}
				return teams.get(cnt++);
			}
		};
    }

}
