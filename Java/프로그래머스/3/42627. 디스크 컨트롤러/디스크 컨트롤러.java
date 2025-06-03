import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int n = jobs.length;

        List<Job> jobList = new ArrayList<>();
        for (int i = 0; i < n; i++) 
            jobList.add(new Job(jobs[i][0], jobs[i][1], i));
        
        Collections.sort(jobList, (a, b) -> {
            return a.arrival - b.arrival;
        });

        PriorityQueue<Job> pq = new PriorityQueue<>((a, b) -> {
            if (a.duration != b.duration) 
                return a.duration - b.duration;
            if (a.arrival != b.arrival) 
                return a.arrival - b.arrival;
            return a.id - b.id;
        });

        int cur = 0, index = 0, sum = 0;
        while (index < n || !pq.isEmpty()) {
            if (pq.isEmpty()) 
                cur = Math.max(cur, jobList.get(index).arrival);
            
            while (index < n && jobList.get(index).arrival <= cur)
                pq.add(jobList.get(index++));

            Job job = pq.poll();
            cur += job.duration;
            sum += (cur - job.arrival);
        }

        return sum / n;
    }
}

class Job {
    int arrival;
    int duration;
    int id;

    Job(int arrival, int duration, int id) {
        this.arrival = arrival;
        this.duration = duration;
        this.id = id;
    }
}