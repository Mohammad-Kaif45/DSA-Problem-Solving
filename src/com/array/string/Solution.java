package com.array.string;

import java.util.*;

// Maximum square area by removing fences
public class Solution {
    public static int maximumsquarearea(int m, int n, int[] hFences,int[] vFences){
        Set<Integer> hEdges = getEdges(hFences,m);
        Set<Integer> vEdges = getEdges(vFences,n);

        long res = 0;
        for(int edge : hEdges){
            if(vEdges.contains(edge)){
                res = Math.max(res,edge);
            }
        }
        if(res == 0) {
            return -1;
        } else {
            return (int) ((res * res) % 1000000007);
        }
    }
    public static Set<Integer>  getEdges(int[] fences,int border){
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int fence : fences){
            list.add(fence);
        }

        list.add(1);
        list.add(border);
        Collections.sort(list);

        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                set.add(list.get(j) - list.get(i));
            }
        }
        return set;
    }
    public static void main(String[] args) {
        int m = 6, n = 7;
        int[] hFences = {2};
        int[] vFences = {4};
        System.out.println(maximumsquarearea(m,n,hFences,vFences));
    }
}

