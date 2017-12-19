package com.mingcui;

import java.util.*;

public class CourseSchedule_207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        int[] degree = new int[numCourses];
        Queue queue = new LinkedList();
        int count = 0;

        //make graph
        for(int i=0;i<numCourses;i++)
            graph[i] = new ArrayList();

        for(int i=0;i<prerequisites.length;i++){
            degree[prerequisites[i][1]]++;
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        for(int i=0;i<degree.length;i++){
            if(degree[i] == 0){
                queue.add(i);
                count++;
            }
        }
        while(queue.size() != 0){
            int course = (int)queue.poll();
            for(int i=0; i<graph[course].size();i++){
                int pointer = (int)graph[course].get(i);
                degree[pointer]--;
                if(degree[pointer] == 0){
                    queue.add(pointer);
                    count++;
                }
            }
        }
        if(count == numCourses)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        int numCourses = 2;
        int[][] prerequisites = {{0,1}, {0,6}, {0,8}, {1,4}, {1,6}, {1,9}, {2,4}, {2,6}, {3,4}, {3,5},
                {3,8}, {4,5}, {4,9}, {7,8}, {7,9}};
        numCourses = 9;
        CourseSchedule_207 schedule_207 = new CourseSchedule_207();
        schedule_207.canFinish(numCourses,prerequisites);
    }
}
