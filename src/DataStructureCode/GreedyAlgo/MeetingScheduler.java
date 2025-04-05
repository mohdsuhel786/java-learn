package DataStructureCode.GreedyAlgo;

import java.util.*;

class Meeting
{
    int start, end, pos;

    Meeting(int start, int end, int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

public class MeetingScheduler
{
    static void maxMeetings(int start[], int end[])
    {
        List<Meeting> meetings = new ArrayList<>();

        for (int i = 0; i < start.length; i++)
        {
            meetings.add(new Meeting(start[i], end[i], i + 1));
        }

        meetings.sort((m1, m2) -> (m1.end != m2.end) ? Integer.compare(m1.end, m2.end) : Integer.compare(m1.pos, m2.pos));

        List<Integer> selectedMeetings = new ArrayList<>();
        selectedMeetings.add(meetings.get(0).pos);
        int lastEndTime = meetings.get(0).end;

        for (int i = 1; i < start.length; i++)
        {
            if (meetings.get(i).start > lastEndTime)
            {
                lastEndTime = meetings.get(i).end;
                selectedMeetings.add(meetings.get(i).pos);
            }
        }

        System.out.println("The order in which the meetings will be performed is: ");
        System.out.println(selectedMeetings);
    }

    public static void main(String[] args)
    {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 5, 7, 9, 9};
        maxMeetings(start, end);
    }
}
